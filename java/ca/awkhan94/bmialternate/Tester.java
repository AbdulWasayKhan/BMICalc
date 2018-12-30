package ca.awkhan94.bmialternate;

/**
 * Created by user on 12/29/18.
 */
public class Tester
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Abdul Wasay", 70.5, 1.23);
        Person p2 = new Person("Abdul Hai Kha", 80.4, 1.56);
//        System.out.println("Abdul Wasay bmi is: " + p1.getBMI());
//        System.out.println("Abdul Hai Kha bmi is: " + p2.getBMI());

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.println("After Abdul Wasay has gained 3 kg");
        p1.setWeight(p1.weight + 3);
        System.out.println("After Abdul hai khan has lost 2 Kg");
        p2.setWeight(p2.weight - 2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }


}
