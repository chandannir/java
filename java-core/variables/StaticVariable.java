package variables;

/*
This java program focuses on the static/class variables.

Class variables or also known as static variables are declared with in a class,
outside any method, constructor or a block. with the static keyword
 */

public class StaticVariable {

    static int a = 2;
    /*
    We can use this variable in the main method without using
    an object.
     */

    public static void main(String[] args) {
        System.out.println(a);
        /*
        This prints the class variable intialized in the class.
         */
    }
}
