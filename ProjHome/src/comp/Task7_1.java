package comp;

/*
1. Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е
и 3-е слова местами и вывести на экран результат
*/

import java.util.Arrays;

public class Task7_1 {
    public static void main(String[] args){
        String inputTxt = "word1 word2 word3";
        System.out.println("Input text is:");
        System.out.println(inputTxt);

        String[] arrayTxt = inputTxt.split(" ");
        String temp;
        temp = arrayTxt[0];
        arrayTxt[0] = arrayTxt[arrayTxt.length-1];
        arrayTxt[arrayTxt.length-1] = temp;

        System.out.println(Arrays.toString(arrayTxt));

        for (int i = 0; i < arrayTxt.length; i++){
            System.out.print(arrayTxt[i]+ " ");
        }
    }
}
