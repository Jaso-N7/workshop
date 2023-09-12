package com.mindfulengineering.learn.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Introduction to working with Maps.
 * 
 * @author jason
 * @version 0.1, 09/11/23
 */
public class Example15 {
    public static void main(String[] args) {
        
        Map map = new HashMap();
        map.put("number", 1);
        map.put("text", "hola");
        map.put("decimal", 5.7D);
        
        System.out.println(map.get("text"));
        
        if(!map.containsKey("byte")) {
            System.out.println("There are no bytes here!");
        }
        
        System.out.println( map.entrySet() );
        System.out.println( map.keySet() );
    }
}
