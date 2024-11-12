package Collection;

import java.util.*;

public class LinkedList1 {
    public static void main(String args[]){
        LinkedList<String> data =new  LinkedList<String>();
        data.add("manoj");
        data.add("ujwal");
        System.out.println(data);
        data.add(1,"rahul");
        System.out.println(data);
        data.addLast("ujwal");
        data.addFirst("satish");
        data.remove(2);
        System.out.println(data);
        Iterator<String> itr = data.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
