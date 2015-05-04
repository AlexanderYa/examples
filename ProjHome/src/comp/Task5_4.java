package comp;

/*
// 4. Написать ф-ю для объединения 2-х массивов в один. Вывести
// результат на консоль.
*/

import java.util.Arrays;
import java.util.Random;

public class Task5_4 {

    public static int[] formArray(){
        Random rnd = new Random();
        int lenArray = 2 + rnd.nextInt(9); // Array must have 2 or more elements
        int [] myArray = new int [lenArray];

        for (int i = 0; i < lenArray; i++) {
            myArray[i] = rnd.nextInt(100);
        }

        return myArray;
    }

    public static int[] joinArray(int[] arrayFirst, int[] arraySecond){

        int myArrayLen = arrayFirst.length + arraySecond.length;
        int [] myArray = new int[myArrayLen];

        for(int i = 0; i < myArrayLen; i++){
            if(i < arrayFirst.length){
                myArray[i] = arrayFirst[i];
            } else {
                myArray[i] = arraySecond[i - arrayFirst.length];
            }
        }
    return myArray;
    }

    public static void main(String [] args){

        int [] array1 = formArray();
        int [] array2 = formArray();

        int [] result = joinArray(array1, array2);

        System.out.println("Arrays before connection:");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("New Array is:");
        System.out.println(Arrays.toString(result));
    }
}
