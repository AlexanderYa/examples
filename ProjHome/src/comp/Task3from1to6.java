package comp;
/*
Задачи Урока 3
Задача 1  - Сортировка чисел в массиве
1. Задать массив целых чисел длинной 10 эл.
2. Отсортировать числа в массиве
3. Вывести на экран результат.
4. Сделать возможность наполнения массива с клавиатуры*.
Задача 2 - Замена первого и последного элементов массива
1. Задать массив целых чисел длинной N эл.
2. Поменять 1-й и последний элемент местами.
3. Вывести массив на экран.
Задача 3 - Разбиение массива на 2 равной длинны, сортировка каждой из половинок и вывод на экран
1. Ввести с клавиатуры массив из 10 чисел.
2. Разбить его на 2 массива равной длинны.
3. Отсортировать каждую из половинок и вывести их содержимое на экран.
Задача 4 - Среднее арифметическое элемнтов массива
1. Среднее арифметическое элементов массива.
Задача 5 - Зеркальный переворот массива
1. Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
Задача 6 - Вывод элементов массива по его индексу на консоль.
1. Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
элементами, а затем выводить нужный элемент по его индексу на консоль.
*/



/**
 * Created by AlexY on 02.05.2015.
 */


import java.util.Arrays;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Random;
        import java.util.Scanner;

public class Task3from1to6 {

    public static void main(String[] args) {

        int num = 10;                   // Количество элементов массива
        boolean flagRnd = false;        // Способ формирования массива (либо вручную, либо случайные числа)
        byte option;                    // Флаг выбора задачи
        int[] myArray;

        // String[] menuArray = {"inputText"};
        // Предполагалось собрать тексты для меню, чтобы использовать их повторно. Варинат с массивом выглядел не удобно
        // Наиболее полно задаче создания меню соответствовал словарь или map в Java

        Map<String, String> dic = new HashMap<String, String>();
        dic.put("Welcome text", "Выберите задачу:");
        dic.put("Task №1", "(1) Задача 1 - Сортировка чисел в массиве ");
        dic.put("Task №2", "(2) Задача 2 - Замена первого и последнего элемента ");
        dic.put("Task №3", "(3) Задача 3 - Разбиение массива пополам и сортировка этих половинок ");
        dic.put("Task №4", "(4) Задача 4 - Среднее арифметическое элементов массива ");
        dic.put("Task №5", "(5) Задача 5 - Зеркальный переворот массива ");
        dic.put("Task №6", "(6) Задача 6 - Вывод элементов массива по его индексу ");
        dic.put("Choose Task Number", "Для выбора задачи - введите соответствующий номер задачи (от 1 до 6)");
        dic.put("Number of Elements", "(8) Выбор количества элементов массива (по умолчанию 10) (8)");
        dic.put("Enter Array Option", "(9) Выбор случайного варианта заполнения элементов массива - нажмите (9)");
        dic.put("Exit text", "(0) Для завершения работы введите ноль (0)");
        dic.put("Exit text-1", "(-1) Для завершения работы введите минус 1 (-1)");
        dic.put("Enter number of elements", "Введите количество элементов массива");
        dic.put("Actual flag", "Текущий выбор  ");
        dic.put("Attention!", "С этим выбором вам придется вручную вводить массив элементов в количестве ");
        dic.put("Wrong Num", "Количество элементов следует выбрать больше одного");
        dic.put("Random or not", "Для выбора ввода вручную нажмите 1, для случайного выбора - 2");
        dic.put("Input element", "Введите значение элемента массива");
        dic.put("First state", "Первоначальная форма массива");
        dic.put("Last state", "Форма массива после обработки");
        dic.put("Wrong Array", "В данной задаче массив должен состоять из четного количества элементов");


        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        do {
            //Окно приглашения:
            System.out.println(dic.get("Welcome text") + "\n" + dic.get("Task №1") + "\n" + dic.get("Task №2") + "\n" + dic.get("Task №3") + "\n" + dic.get("Task №4") + "\n" + dic.get("Task №5") + "\n" + dic.get("Task №6"));
            System.out.println(dic.get("Choose Task Number") + "\n" + dic.get("Number of Elements") + "\n" + dic.get("Actual flag") + num + "\n" + dic.get("Enter Array Option") + dic.get("Actual flag") + flagRnd + "\n" + dic.get("Exit text") + "\n");

            //Считывание ввода варианта от пользователя:
            option = sc.nextByte();

            myArray = new int[num];

            if(flagRnd == true){
                for(int i = 0; i < num; i++){
                    myArray[i] = rnd.nextInt();
                }
            }

            switch (option){
                case 8:{ //Выбор количества элементов массива (по умолчанию - 10)
                    System.out.println(dic.get("Enter number of elements"));
                    int var;
                    var = sc.nextInt();
                    if (var <= 1) {
                        System.out.println(dic.get("Wrong Num"));
                        break;
                    }
                    num = var;
                    if (num > 99 && flagRnd == false) System.out.println(dic.get("Attention!") + num);
                    break;
                }

                case 9:{
                    System.out.println(dic.get("Random or not"));
                    int var;
                    var = sc.nextInt();
                    //if(var != 1 || var != 2) {System.out.println(dic.get("Random or not")); break;}
                    if (var == 2){flagRnd = true;} else {flagRnd = false;}
                    if (num > 99 && flagRnd == false) System.out.println(dic.get("Attention!") + num + "\n");
                    System.out.println(flagRnd);
                    break;
                }

                case 1:{
                    System.out.println("\n" + dic.get("Task №1") + dic.get("Actual flag") + num  + " " + flagRnd);
                    if(flagRnd != true){
                        for(int i=0; i<myArray.length; i++){
                            System.out.println(dic.get("Input element") + "[" + i + "]");
                            myArray[i] = sc.nextInt();
                        }
                    }
                    System.out.println(dic.get("First state") +"\n" + Arrays.toString(myArray));
                    Arrays.sort(myArray);
                    System.out.println(dic.get("Last state") +"\n" + Arrays.toString(myArray));
                    break;
                }

                case 2:{
                    System.out.println("\n" + dic.get("Task №2") + dic.get("Actual flag") + num  + " " + flagRnd);
                    if(flagRnd != true){
                        for(int i=0; i<myArray.length; i++){
                            System.out.println(dic.get("Input element") + "[" + i + "]");
                            myArray[i] = sc.nextInt();
                        }
                    }
                    System.out.println(dic.get("First state") +"\n" + Arrays.toString(myArray));
                    int temp;
                    temp = myArray[0];
                    myArray[0] = myArray[myArray.length];
                    myArray[myArray.length] = temp;
                    System.out.println(dic.get("Last state") +"\n" + Arrays.toString(myArray));
                    break;
                }

                case 3: {
                    System.out.println("\n" + dic.get("Task №3") + dic.get("Actual flag") + num  + " " + flagRnd);
                    if(flagRnd != true){
                        for(int i=0; i<myArray.length; i++){
                            System.out.println(dic.get("Input element") + "[" + i + "]");
                            myArray[i] = sc.nextInt();
                        }
                    }
                    System.out.println(dic.get("First state") +"\n" + Arrays.toString(myArray));
                    if (myArray.length%2 != 0) {System.out.println(dic.get("Wrong Array")); break;}
                    int[] halfArray1 = new int[(myArray.length / 2)];
                    int[] halfArray2 = new int[(myArray.length / 2)];
                    for (int i=0; i <(myArray.length / 2); i++){
                        halfArray1[i] = myArray[i];
                        halfArray2[i] = myArray[i+(myArray.length / 2)];
                    }
                    Arrays.sort(halfArray1);
                    Arrays.sort(halfArray2);
                    System.out.println(dic.get("Last state") +"\n" + Arrays.toString(halfArray1)+"\n"+Arrays.toString(halfArray2));
                    break;
                }

                case 4: {
                    System.out.println("\n" + dic.get("Task №4") + dic.get("Actual flag") + num  + " " + flagRnd);
                    if(flagRnd != true){
                        for(int i=0; i<myArray.length; i++){
                            System.out.println(dic.get("Input element") + "[" + i + "]");
                            myArray[i] = sc.nextInt();
                        }
                    }
                    int average = 0;
                    // Возможно использовать float если нужна большая точность.
                    for (int i=0; i < num; i++){
                        average = average + myArray[i];
                    }
                    System.out.println(dic.get("First state") +"\n" + Arrays.toString(myArray));
                    average = average / num;
                    System.out.println(dic.get("Task №4") + " = " + average);
                }

                case 5: {
                    System.out.println("\n" + dic.get("Task №5") + dic.get("Actual flag") + num  + " " + flagRnd);
                    if(flagRnd != true){
                        for(int i=0; i<myArray.length; i++){
                            System.out.println(dic.get("Input element") + "[" + i + "]");
                            myArray[i] = sc.nextInt();
                        }
                    }
                    int temp;
                    System.out.println(dic.get("First state") +"\n" + Arrays.toString(myArray));
                    for (int i = 0; i < myArray.length/2; i++){
                        temp = myArray[i];
                        myArray[i] = myArray[num -1 - i];
                        myArray[num -1 - i] = temp;
                    }
                    System.out.println(dic.get("Last state") +"\n" + Arrays.toString(myArray));
                    break;
                }

                case 6: {
                    System.out.println("\n" + dic.get("Task №6") + dic.get("Actual flag") + num  + " " + flagRnd);
                    if(flagRnd != true) {
                        for (int i = 0; i < myArray.length; i++) {
                            System.out.println(dic.get("Input element") + "[" + i + "]");
                            myArray[i] = sc.nextInt();
                        }
                    }
                    int temp = 0;
                    while (true){
                        System.out.println(dic.get("Input element"));
                        System.out.println(dic.get("Exit text-1"));
                        temp = sc.nextInt();
                        if (temp == -1) break;
                        System.out.println(dic.get("Actual flag") + "[" + temp + "] = " + Integer.toString(myArray[temp]));
                    }
                    break;
                }
            }
        }
        while (option != 0);
        sc.close();
    }
}