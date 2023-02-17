/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
package HWL3;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(21);
        list.add(125);
        list.add(12);
        list.add(34);
        list.add(10);
        list.add(48);
        list.add(65);

        System.out.println(list);

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            int x = (Integer)itr.next();
            if (x % 2 == 0) {
                itr.remove();
            }
        System.out.println(list);

        }

    }
}
