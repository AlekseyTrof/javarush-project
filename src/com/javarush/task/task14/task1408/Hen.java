package com.javarush.task.task14.task1408;

public abstract class Hen {
    private String country;
    private int N;

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я - курица.";
    }
}
