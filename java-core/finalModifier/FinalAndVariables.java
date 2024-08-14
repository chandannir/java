package finalModifier;

/*
This program focuses on the final modifier and variables.

If a variable is declared final than its value stays constant.
The modifier insures the value cannot be changed.
 */

public class FinalAndVariables {

    static final int a = 2;
    /*
    We can use the static modifier to make it a class variable.
     */

    public static void main(String[] args) {

         // a = 3;
        /*
        The statement above will return an error because we can not change
        the value of a final variable.
         */

    }

}
