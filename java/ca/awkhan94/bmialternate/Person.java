package ca.awkhan94.bmialternate;

/**
 * Created by user on 12/29/18.
 */
public class Person
{

    String name;
    double weight;
    double height;

    public Person(String personName, double personWeight, double personHeight)
    {
        this.name = personName;
        this.weight = personWeight;
        this.height = personHeight;

    }

    /**
     * Given the current context object's weight and height, apply the BMI calculation formula.
     * @return
     */

    public double getBMI()
    {
        double bmi = this.weight / (this.height * this.height);
        return bmi;
    }

    /**
     *
     * @returns The current string representation of current context person object.
     */
    @Override
    public String toString()
    {
        String s = "";
        s = s + this.name;
        s += "'s BMI is: ";
        //This line below smells because it repeats the method getBMI() would do
        //Simply replace the line by call to method BMI()
        /*double bmi =  this.weight / (this.height * this.height);
        */
        double bmi = this.getBMI();
        s += + bmi;
        return  s;
    }

    public void setWeight(double newWeight)
    {
        this.weight = newWeight;
    }

//    public void setHeight(double newHeight)
//    {
//        this.height = newHeight;
//    }
}
