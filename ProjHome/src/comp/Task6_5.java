package comp;

import java.util.Scanner;

/*
 5. Ввести с консоли число в бинарном формате. Перевести
 его в int и вывести на экран (“10” -> 2).
 */
public class Task6_5 {

    public static void main (String [] args){

        int result = 0;
        int numSystem = 2;
        int numSystenRes = 10;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в бинароном формате: ");
        int binNumber = scan.nextInt();

        int count = 0;
        while (binNumber != 0){
            int temp = binNumber % numSystenRes;
            if(temp >= numSystem){
                System.out.println("Wrong input number.");
                break;
            }
            binNumber = binNumber / numSystenRes;
            result = result + temp * (int)Math.pow(numSystem, count);
            //Expected work only with int
            count +=1;
        }
        System.out.println(result);

        scan.close();
    }
}
