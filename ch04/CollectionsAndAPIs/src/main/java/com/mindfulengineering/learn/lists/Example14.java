package com.mindfulengineering.learn.lists;

import java.util.*;

public class Example14 {

    public static void main(String[] a) {
        List<String> list = new ArrayList<>();
        list.add("No");
        list.add("matter");
        list.add("what");
        list.add("you");
        list.add("do");
        System.out.println(list);
        
        List<String> sub = list.subList(2, 4);
        System.out.println(sub);
        
        list.subList(2, 4).clear();
        System.out.println(list);
        
        
    }
}
