package com.company;

import sun.security.util.Length;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        String otvet = palindromLi("madam");


        System.out.println(otvet);

    }

    static String palindromLi(String s){

        int ls= s.length();

        char[] cs = s.toCharArray();

        String s1="";

        int i = ls-1;
        while (i >= 0) {
            s1 = s1 + cs[i];


            i--;
        }

         if (s1.compareToIgnoreCase(s)==0) { s1 = "Yes"; } else { s1="No"; }

        return s1;
    }
}
