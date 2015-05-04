package comp;


import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args){
        /*
        int[] a = new int[] {1,1,1};
        a[a[1]++] = 7;
        a[a[a[0]++]] = 7;
//        a[a[0]--] = 8;
//        a[++a[0]] = 9;
        System.out.println(Arrays.toString(a));
        */

        /*
        int u = 13;
        u += 2; u %= 4;
        u >>= 1; u = ~u;
        System.out.println(u);

        char[] a = "abcdefghijk".toCharArray();
        for (char c : a)
            System.out.print((c > 'e') ? c : 'a');

        System.out.println();


        long n = 3;
        do {
            n = (n * n) % 135;
        } while (n < 27);
        System.out.println(n);

        */

        for (char alpha ='A'; alpha <= 'z'; alpha++){
            System.out.print(alpha + " ");
        }



        int openSymbol = 0;
        int closeSymbol = 0;
        int flag = 0;

        char[] myTxt = "(((43+34)-31)))))".toCharArray();
        for(char ch: myTxt){
            if (ch == '('){
                flag +=1;
                openSymbol += 1;
            } else if (ch == ')') {
                flag -=1;
                closeSymbol +=1;
            }
            if (flag < 0) {
                System.out.println("Баланс круглых скобок не верен!");
                break;
            }
        }

        if (flag > 0){
            System.out.println("Баланс круглых скобок не верен!");
        }
        System.out.println("Количество открывающих скобок:");
        System.out.println(openSymbol);
        System.out.println("Количество закрывающих скобок:");
        System.out.println(closeSymbol);





    }
}
