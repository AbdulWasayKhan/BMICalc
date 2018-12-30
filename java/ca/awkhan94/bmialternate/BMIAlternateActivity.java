package ca.awkhan94.bmialternate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIAlternateActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmialternate);
    }

    /**
     * Helper method to set/change the contents of TextView in GUI
     * Two inputs as
     * @param id
     * @param newContents
     * Given the id(set in the view xml file) of a TextView we change its contents to
     * "newContents" in our example this helper method is used when we want to change
     * the content of TextView "answer" in newContent.
     */
    private void setContentsOfTextView(int id, String newContents)
    {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    /**
     * Helper method for retrieving contents from the GUI
     * @param id
     * Given the id(set in the View Xml file) of an EditText
     * retrieve what the user has entered
     */

    private String getInputOfEditText(int id)
    {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    /**
     * implementation body of method "computeBMIButtonClicked". This block of code
     * can be attached to some GUI components in the View xml file by setting the attribute
     * "OnClick" Now there is a linkage created between the Controller(BMIAlternateActivity.java)
     * and the View which is in this case "activity_bmialternate.xml"
     * @param view
     * here View is the type of the arguments.
     */
    public void computeBMIButtonClicked(View view)
    {
        /*Phase 1: Retrieving values for the EditText fields when button clicked.
        * to do this we can call helper methods.
        * */
        String textName = getInputOfEditText(R.id.inputName);
        String textWeight = getInputOfEditText(R.id.inputWeight);
        String textHeight = getInputOfEditText(R.id.inputHeight);


        /**
         * Phase 2: based on information retrieved display them.
         */
//        String contents = textName + " has weight " + textWeight + " and height" + textHeight;
//        setContentsOfTextView(R.id.labelAnswer, contents);

        /**
         * Alternative phase2: Based on info retrieved
         * Convert them into numbers if necessary
         * Caution: Every input value that the user entered is retrieved as a string;
         * e.g: when the user enter name Abdul its retrieved by the controller as "Abdul"
         * the weight 70, as "70" (a string of 2 characters)
         * the height 1.78 as  "1.78" (a string of 4 characters)
         */

        // No conversion needed for the name

        //Conversion for weight and height

        double weight = Double.parseDouble(textWeight);
        double height = Double.parseDouble(textHeight);

        //Computation shouldn't be done in context of controller because of seperation
        //of concern principle. in general the computation required for specific app can
        //be very complicated. It is bad to have the controller responsible for both input
        //retrieve and computation

        //in general we want to have separate component responsible for computation.
//        double bmi =  weight / (height * height);
//        String contents = textName + "has the bmi: " + bmi;
//        setContentsOfTextView(R.id.labelAnswer, contents);

        /**
         * Proper phase2: based on information retrieved
         * create a model and let it compute the BMI and return the computation result to be displayed
         */

        Person user = new Person(textName, weight, height);
       // double userBMI = user.getBMI();
        setContentsOfTextView(R.id.labelAnswer, user.toString());

    }
}
