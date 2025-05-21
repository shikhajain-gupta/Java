package com.Collection;

import java.util.*;

public class map {
    public static void main(String[] args) {

        List<Object> ar = new ArrayList<Object>();
        List<String> ll = new LinkedList<String>();

        for (int i = 0; i < 10; i++) {
            ar.add(i);
        }
        System.out.println(ar);

        ll.add("Hello");
        ll.add("World");
        for (String s : ll) {
            System.out.println(s);
        }
        ll.set(1, "India");
        System.out.println(ll);
                System.out.println(ll.contains("India"));

                Iterator it = ll.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
        Map<Integer, String> hm = new HashMap<>();
                hm.put(1, "India");
                hm.put(2, "UAE");
                hm.put(3, "US");
                hm.put(4, "UK");

                System.out.println(hm);
                System.out.println(hm.get(1));
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());

        for (Map.Entry<Integer, String> entry : hm.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }



}

