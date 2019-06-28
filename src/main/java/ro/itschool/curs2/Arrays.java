package ro.itschool.curs2;

/**
 * Arrays are a collection of elements of a specific type
 */
public class Arrays {
    public static void main(String[] args) {
        //Defining an array
        //On the type
        int[] array;

        //Intializing an array:
        //You can initialize an array by specifying its length. The array element will all be the java default for that type
        array = new int[10];

        //You can initialize the array by specifying its content. No length should be specified!
        array = new int[]{1, 2, 4, 5};//this will initialize an array with length 4 that contains 1,2,4,5

        //You can define and intialize the array in the same line:
        double[] initializedArray = new double[]{5, 6, 7.1, 3.14, 3.4};

        //Accessing the element from an array
        //To access the element from an array you need to specify the desired position between [ and ]
        System.out.println("In order to access the 2nd element from array array you write array[1] " + array[1]);
        //NOTE: the first element in an array will be on position 0. The last one on position length-1

        //Change a value in an array:
        //In order to change a value in an array, you need to access that element and assign a new value
        array[2] = 55;
        System.out.println("Now the value of array[2] is " + array[2]);

        //Length of an array: can be retrieved with array.length
        System.out.println("The length of the array is " + array.length);
    }
}
