package comp;

import java.util.Arrays;
import java.util.Random;

/*
 3. Дано 3 массива чисел. С помощью 1-2-х циклов найти
 сумму элементов во всех массивах.
 */
public class Task7_3 {
    static void fillArray(int[] inputArray){
        Random rnd = new Random();
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i] = rnd.nextInt(100);
        }
    }

    public static void main(String[] args){
        Random rnd = new Random();

        int lenArray1 = 1 + rnd.nextInt(99);
        int lenArray2 = 1 + rnd.nextInt(99);
        int lenArray3 = 1 + rnd.nextInt(99);

        int [] arraysArray = {lenArray1, lenArray2, lenArray3};
        Arrays.sort(arraysArray);
        //System.out.println(Arrays.toString(arraysArray));
        int maxLen = arraysArray[arraysArray.length - 1];

        int[] firstArray = new int[lenArray1];
        int[] secondArray = new int[lenArray2];
        int[] thirdArray = new int[lenArray3];

        fillArray(firstArray);
        fillArray(secondArray);
        fillArray(thirdArray);

        //System.out.println(Arrays.toString(firstArray));
        //System.out.println(Arrays.toString(secondArray));
        //System.out.println(Arrays.toString(thirdArray));

        int sumArray1 = 0;
        int sumArray2 = 0;
        int sumArray3 = 0;

        for(int i =0; i < maxLen; i++){
            if (i < lenArray1){
                sumArray1 = sumArray1 + firstArray[i];
            }
            if (i < lenArray2){
                sumArray2 = sumArray2 + secondArray[i];
            }
            if (i < lenArray3){
                sumArray3 = sumArray3 + thirdArray[i];
            }
        }

        System.out.println("Sum of elements in first array:");
        System.out.println(sumArray1);
        System.out.println("Sum of elements in second array:");
        System.out.println(sumArray2);
        System.out.println("Sum of elements in third array:");
        System.out.println(sumArray3);
    }
}
