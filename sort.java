package Arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class sort {
    public static void main(String args []){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


    }
}
