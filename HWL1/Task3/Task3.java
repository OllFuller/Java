package Task3;
import  java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number_1;
        int number_2;
        int answer;
        int i;
        String a;
        char sum;

        System.out.print("Введите операцию(+,-,*,/) :");
        a = scan.next();
        sum = a.charAt(0);
        System.out.print("Введите первое число: ");
        number_1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        number_2 = scan.nextInt();
        if (sum == '+') {
            answer = number_1 + number_2;
            System.out.println("Ответ: " + answer);
        }
        else if (sum == '-') {
            answer = number_1 - number_2;
            System.out.println("Ответ: " + answer);
        } else if (sum == '*') {
            answer = number_1 * number_2;
            System.out.println("Ответ: " + answer);
        }
        else if (sum == '/') {
            answer = number_1 / number_2;
            System.out.println("Ответ: " + answer);
        }
        else  {
            System.out.println("Неверная операция");

        }
    }
    }

