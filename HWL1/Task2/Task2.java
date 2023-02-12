/*
Вывести все простые числа от 1 до 1000
 */
package Task2;

import java.util.Scanner;

public class Task2 {
    public static void  main(String[] args) {
        try (Scanner tru = new Scanner(System.in)) {
            int number;
            System.out.println("Введите число");

            for (int i = 2; i <= 1000; i++) {
                if (i % 1 == 0 || i % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
