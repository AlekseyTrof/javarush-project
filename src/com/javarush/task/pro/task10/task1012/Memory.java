package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }


    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        int count = 0;
        for (String x : array) {
            if (x != null) {
                count++;
            }
        }
        String[] word = new String[count];
        int i = 0;
        int c = 0;
        for (String x : array) {
            if (x != null) {
                word[i] = array[c];
                i++;
            }
            c++;
        }
        int z = 0;
        for (int j = 0; j < array.length; j++) {

            if (word.length > z) {
                array[j] = word[z];
                z++;
            } else if (word.length <= z) {
                array[j] = null;
            }
        }
    }
}
