package comp;

/*
//        5_1. Написать функцию, которая принимает в качестве аргументов
//        одну строку X, целое число Y и число с плавающей точкой Z и
//        возвращает как результат строку в виде
//        S = x + y + z.
*/

import java.util.Scanner;

public class Main {

    static String myFunction(String x, int y, double z){
        return x+y+z;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some string:");
        String inputTxt = scan.nextLine();
        System.out.println("Enter some integer:");
        int inputInt = scan.nextInt();
        System.out.println("Enter some double:");
        double inputDouble = scan.nextDouble();

        String result = myFunction(inputTxt, inputInt, inputDouble);
        System.out.println("Result of the function is:");
        System.out.println(result);

        scan.close();
    }
}
