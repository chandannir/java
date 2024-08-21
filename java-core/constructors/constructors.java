package constructors;



public class constructors {

    int a;
    constructors(){

        int a = 3;
    } //constructor

    public static void main(String[] args) {
        constructors myObj = new constructors();
        System.out.println(myObj.a);

        /*
        If we didn't include the constructor to intialize the value
        variable a the SOP statement would not work.
         */

    }

}
