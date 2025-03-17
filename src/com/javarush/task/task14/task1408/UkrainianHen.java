package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    private int N = 1;

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return N;
    }
}
