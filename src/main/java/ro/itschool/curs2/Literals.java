package ro.itschool.curs2;

/**
 * Literals help us represent fixed values of different types in the language
 */
public class Literals {
    public static void main(String[] args) {
        //String literal: are any words, numbers or characters between double quote:". eg: "this is a string literal"
        System.out.println("This is a string literal. A string literal will be between \" character");

        //integer number literals are a series of figures. You can split the zeros with _ to identify better the number (1_000)
        //the number literals will have implicit type of int
        System.out.println("This is an int literal " + 123);
        System.out.println("Int literal with separator: " + 1_235_332);

        //float literals: You suffix the number with letter F or f (F recommended)
        System.out.println("This is a float literal: " + 123.2F);

        //double literals: You suffix the number with letter D or d (D recommended)
        System.out.println("This is a double literal: " + 123.2D);

        //long literals: You suffix the number with letter L or l (L recommended)
        System.out.println("This is a long literal: " + 123L);

        //hexa literal: a way to represent hexadecimal numbers. You need to prefix the number with 0x
        System.out.println("This is the evaluation of hexa literal 0x2A: " + 0x2A);

        //octal literal: a way to represent ocatal numbers. You need to prefix the number with 0
        System.out.println("This is the evaluation of octal literal 021: " + 021);

        //binary literal: a way to represent binary numbers. You need to prefix the number with 0B
        System.out.println("This is the evaluation of binary literal 0B0011: " + 0B0011);


    }
}
