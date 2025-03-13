package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

import org.xml.sax.ext.Locator2Impl;

public class Solution {
    public static class Los implements Businessman {
        @Override
        public void workHard() {

        }
    }

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Los implements Businessman {

    }
}
