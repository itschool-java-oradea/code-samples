package ro.itschool.curs2;

public class JavaPrimitiveTypes {
    public static void main(String[] args) {
        //we define a variable by specifying its type and name;
        int a;//this variable is of type a, but has NO value.
        //in order to assign a value to it, we have to initialize it
        a = 2;
        //now we can use it
        System.out.println("The value of variable a is " + a);

        // the definition and initialization can be done in the same line:
        int b = 5;

        //we have primitive types for all important data types:
        //------------------------------------------------------------------------------------------
        //byte : occupies 1 byte; used for small values between -128 and 128
        //default value = 0
        byte byteVar = 127;
        System.out.println("Byte var is " + byteVar);
        //if we assign value outside the limits a compilation error will occur
        //byte byteVarOutside = 200; //this fails at compilation

        //------------------------------------------------------------------------------------------
        //short : occupies 2 bytes: values between -32,768 and 32,767
        //default value = 0
        short shortVar = 30_000;
        System.out.println("The short var is " + shortVar);

        //------------------------------------------------------------------------------------------
        //int: occupies 4 bytes: values between -2,147,483,648 and 2,147,483,647
        //this is the most used primitive in java. Other than the cases when you explicitly want to use byte or short, use this one
        //default value = 0
        int intVar = 213;
        System.out.println("The int value is " + intVar);

        //------------------------------------------------------------------------------------------
        //long: occupies 8 bytes: values between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807
        // use this when you think int won't be enough.
        //default value = 0
        long longVar = 1328094381;
        System.out.println("The long value is " + longVar);

        //------------------------------------------------------------------------------------------
        //float: occupies 4 bytes :  values between 3.4e−038 and 3.4e+038
        //used for decimal low numbers. By default the decimal literal is double, so you have to specify you want a float by adding F at the end of the number
        //default value = 0
        float floatVar = 444.51F;
        System.out.println("Float var is " + floatVar);

        //------------------------------------------------------------------------------------------
        //double: occupies 8 bytes :  values between 1.7e−308 and 1.7e+038
        //this type is used usually for numbers with decimals. Use float only if you have specific reasons to do it
        //default value = 0
        double doubleVar = 444.51;
        System.out.println("Double var is " + doubleVar);

        //------------------------------------------------------------------------------------------
        //double: occupies 1 bit: true or false
        //default value = false
        boolean booleanVar = true;
        System.out.println("Boolean var is " + booleanVar);

        //------------------------------------------------------------------------------------------
        //char: occupies 2 bytes: value that represents a character
        //default value = 0
        char charVar = 'A';
        System.out.println("Char value is " + charVar);
        charVar = 123;
        System.out.println("If you give char a numeric value, the output will still be a character: " + charVar);
    }
}
