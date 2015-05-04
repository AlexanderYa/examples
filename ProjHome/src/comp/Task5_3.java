package comp;

/*
// 5.3. Написать ф-ю, которая принимает на вход массив чисел и
//возвращает его длину в байтах как результат.
*/

import java.util.Arrays;
import java.util.Random;

public class Task5_3 {
    public static int myFunc(int[] elements){
        int sizeInt = 4; // Размер Int - 4 байта
        return elements.length * sizeInt;
    }

    public static void main(String[] args){

        Random rnd = new Random();

        int lenArray = 1 + rnd.nextInt(9);
        // Array must have 1 or more elements
        int [] myArray = new int [lenArray];

        for (int i = 0; i < lenArray; i++){
            myArray[i] = rnd.nextInt(100);
        }

        int sizeOfArray = myFunc(myArray);
        System.out.println("Array is");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Size of my array is");
        System.out.print(sizeOfArray);
        System.out.println(" bytes");
    }
}
