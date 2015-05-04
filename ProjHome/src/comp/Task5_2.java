package comp;

/*
// 5_2. Написать функцию, которая принимает массив чисел в качестве
// аргумента, увеличивает его первые 3 элемента на 1 и
// возвращает их сумму как результат. После изменения массив и
// сумму надо вывести на экран.
*/

import java.util.Arrays;
import java.util.Random;

public class Task5_2 {


    public static int myFuncSum(int [] someIntArray){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            someIntArray[i] += 1;
            sum = sum + someIntArray[i];
        }
        return sum;
    }

    public static void main(String [] args){

        Random rnd = new Random();

        int lenArray = 3 + rnd.nextInt(8);
        // Array must have 3 or more elements
        int [] myArray = new int [lenArray];

        for (int i = 0; i < lenArray; i++){
            myArray[i] = rnd.nextInt(100);
        }

        System.out.println("Array before change:");
        System.out.println(Arrays.toString(myArray));

        int result = myFuncSum(myArray);

        System.out.println("Array after change:");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Sum of the 3 elements of new Array:");
        System.out.println(result);
    }
}
