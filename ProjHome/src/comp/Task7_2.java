package comp;

/*
 2. Дано текст и определенное слово. Посчитать сколько раз
 заданное слово встречается в тексте.
 */

import java.util.Arrays;

public class Task7_2 {
    public static void main(String[] args){
        String inputTxt = "word1 word2, word3. Word1";
        String findTxt = "word";
        String tempTxt = inputTxt.toLowerCase();
        tempTxt = tempTxt.replace(".","");
        tempTxt = tempTxt.replace(",","");
        System.out.println(tempTxt);
        String[] arrayTxt = tempTxt.split(" ");

        System.out.println(Arrays.toString(arrayTxt));

        int sum = 0;
        for(int i = 0; i < arrayTxt.length; i++){
            if(findTxt.equals(arrayTxt[i])){
                sum +=1;
            }
        }

        System.out.println("Искомый текст " + findTxt + " встречается " + sum + " раз");

    }
}
