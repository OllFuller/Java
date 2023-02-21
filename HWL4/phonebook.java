package HWL4;

import java.io.InputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phonebook {
    public static void main(String[] args) {
        Map<String, String> phone_number = new HashMap<String, String>();
        phone_number.put("1", "+375365874 " +
                "+375365877 " +
                "+375365878 ");
        phone_number.put("2", "+89687745 " +
                "+897455686");
        phone_number.put("3", "+75486264");
        for(Map.Entry<String, String> entry: phone_number.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Логин=");
        String login = sc.next().toUpperCase();

        if (phone_number.containsKey(login)) {
            System.out.println(login + "= " + phone_number.get(login));
        }
        System.out.println("До удаления: ");
        for(Map.Entry<String, String> entry: phone_number.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        phone_number.remove("2");
        System.out.println("\nПосле удаления: ");
        for(Map.Entry<String, String> entry: phone_number.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());






    }
}



