package com.javarush.task.pro.task10.task1003;

/* 
Построим новый бизнес-комплекс JavaRush Business Center
*/

public class Skyscraper {
    private int floorsCount;
    private String developer;

    //напишите тут ваш код
    public Skyscraper() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Skyscraper(int floors, String dev) {
        this.floorsCount = floors;
        this.developer = dev;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
    }
}
