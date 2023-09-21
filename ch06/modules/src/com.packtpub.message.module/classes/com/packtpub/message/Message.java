package com.packtpub.message;

import com.packtpub.day.Today;
/**
 *
 * @author jason
 */
public class Message {
    public static void main(String[] args) {
        Today t = new Today();
        System.out.println("Today is " + t.getToday());
    }
}
