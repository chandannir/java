package variables;


/*
This java program focuses on local variables.

Variables defined inside methods, constructors or blocks are called local variables.
The variable will be declared and initialized within the method, it will be
destroyed when the method has completed
 */
public class LocalVariables {

    public static void main(String[] args) {
        int m = 2;
        System.out.println(m);

        /*
        'int m' is our local variable and cannot be accessed outside the main method.

        When creating local variables with must me initialized to avoid receiving an error when compiling.

        int c;
        'int c' will not compile because it hasn't been given a value.
         */
    }
}
