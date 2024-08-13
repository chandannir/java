package variables;

/*
This java program focuses on instance variables.

Instance variables are variables within a class but outside any method.
These variables are instantiated when the class is loaded.

 */


public class InstanceVariables {

    int a = 1;
    /*
    instance variables cannot be used in the main method with creating an object.
     */


    public static void main(String[] args) {

        InstanceVariables obj = new InstanceVariables();
        // an object must be created to use instance variables.
        System.out.println(obj.a);

    }
}
