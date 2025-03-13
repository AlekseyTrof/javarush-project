package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer x = new StringTokenizer(query, delimiter);
        int a = x.countTokens();
        String[] tokene = new String[a];
        int i = 0;
        while (x.hasMoreTokens()) {
            String token =  x.nextToken();
            tokene[i] = token;
            i++;
        }
        return tokene;
    }
}
