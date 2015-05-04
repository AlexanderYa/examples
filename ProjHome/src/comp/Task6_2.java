package comp;

import java.util.Arrays;
import java.util.Random;

/*
//2. Написать свой вариант ф-и Arrays.equals для short[].
 */
public class Task6_2 {

    public static boolean myFuncEqual(short[] firstArray, short[] secondArray){
        if (firstArray.length != secondArray.length){
            return false;
        }
        for (int i = 0; i < firstArray.length; i++){
            if (firstArray[i] != secondArray[i]){
                return false;
            }
        }
        return true;
    }

    public static short[] formRandomArray(){
        Random rnd = new Random();
        int lenArray = rnd.nextInt(10);
        short [] myArray = new short[lenArray];

        for (int i = 0; i < lenArray; i++) {
            myArray[i] = (short)rnd.nextInt(100);
            //elements of the array take meanings from 0 to 99. Form short from int would not have problems
        }
        return myArray;
    }

    public static short[] formArray(){

        int lenArray = 10;
        short [] myArray = new short[lenArray];

        for(int i = 0; i < lenArray; i++){
            myArray[i] = (short)i;
        }
        return myArray;
    }

    public static void main(String [] args){

        boolean result;
        short [] array1 = formRandomArray();
        short [] array2 = formRandomArray();

        result = myFuncEqual(array1, array2);

        System.out.println("My kind of equal() from arrays");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("get result");
        System.out.println(result);

        short [] array3 = formArray();
        short [] array4 = formArray();

        result = myFuncEqual(array3, array4);
        System.out.println("My kind of equal() from arrays");
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println("get result");
        System.out.println(result);
    }
}
