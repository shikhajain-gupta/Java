package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(1);
        list.add("aa");
        list.add("bb");
        list.add("4");
        System.out.println(list);

        for (Object o : list) {
            System.out.println(o);
        }

        //System.out.println(list.get(3));
        list.add("cc");
        System.out.println(list);


        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        ll.add(1, 10);
        System.out.println(ll);
        ll.set(1, 20);
        System.out.println(ll);
    }


}

