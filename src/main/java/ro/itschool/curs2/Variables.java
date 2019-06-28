package ro.itschool.curs2;

/**
 * variables in java can be of 3 types
 * - instance variables = non-staic fields, the STATE of the object
 * - class variables = static fields, variables that are on the class object
 * - local variables = variables inside a method or function
 * - parameters = variables that are passed into a function or method
 * - constants = class variables that can't change their value
 * variables ALWAYS have lowercase name (camelCase when needed)
 */
public class Variables {
    private static final String CONSTANT = "This is a constant";
    private static String classVar = "This is a class variable";
    private String instanceVar = "This is an instance variable";

    public static void main(String[] args) {
        //In order to access an instance variable, you need an object instance of that type
        Variables object = new Variables();
        System.out.println("accessing an instance variable on an object: " + object.instanceVar);

        //In order to access a class variable, you only need the name of the object
        System.out.println("accessing an class variable, you don't need an object of that type " + Variables.classVar);
        Variables.classVar = "Changed class variable";
        System.out.println("A class variable can be changed if it is not defined as a constant " + Variables.classVar);

        //Local variables are defined and used inside a method. Their scope is limited to that method or block of code.
        String localVar = "This is local variable";
        System.out.println("A local variable is available only in the block it's defined(usually the method) " + localVar);

        //Parameters are variables that are passed to a function or method. Their scope is limited to the method they are passed in
        anotherMethod("This is a parameter");

        //Constants are class variables that can't change their value
        System.out.println("Constants have the same value everytime you access it " + Variables.CONSTANT);

    }

    private static void anotherMethod(String param) {
        System.out.println("You can use a parameter inside the method it is passed " + param);
    }
}
