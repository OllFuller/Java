/*
Написать метод который приводит сторку к нормальному виду

строка на вход:
Добрый день Как дела Все хорошо

выход:
Добрый день. Как дела. Все хорошо.
 */
package HWL2;

public class StrChanger {
    public static void main (String args[]) {
    StringBuffer  sb = new StringBuffer ("Добрый день Как дела Все хорошо");
    sb.insert(11, ".");
    sb.insert(21, ".");
    sb.insert(33, ".");
    System.out.println(sb);
    }

}
