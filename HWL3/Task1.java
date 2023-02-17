/*
 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */
package HWL3;

import java.util.ArrayList;



public class Task1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(21);
        list.add(125);
        list.add(12);
        list.add(34);
        list.add(10);
        list.add(48);
        list.add(65);

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0,avg;

        for (int i = 0; i < list.size(); i++)
            sum = sum + list.get(i);
            avg = sum / list.size();



        for (Integer i : list) {

            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }


        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("Среднее арифетическое: " + avg);

    }
}

