package com.javarush.task.pro.task15.task1506;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        FileReader in = new FileReader(sc.nextLine());
        BufferedReader reader = new BufferedReader(in);
        String line = reader.readLine();
        System.out.println(line);
    }
}


