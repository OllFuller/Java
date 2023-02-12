/*
Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/


package Task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите k: ");
        int k=in.nextInt();
        int n=1;
        for(int i=0;i<k;i++){
            System.out.println(n*(n+1)/2);
            n++;}
    }
}
