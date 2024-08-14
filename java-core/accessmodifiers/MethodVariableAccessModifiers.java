package accessmodifiers;

/*
This java program focuses on method and method variable access modifiers.
 */
public class MethodVariableAccessModifiers {


    private void m1(){}
    /*
    Just like a private instance variable a private method cannot be
    accessed outside the class.

    Methods with the void access modifier cannot return a value is it cannot be
    called a SOP (System.out.print).
     */

    public int m2(){
        /*
        Since this method has a return type it can be called a SOP.
        And it will return a value with a print statement.
         */

        int i = 10;

        return i;
    }
}
