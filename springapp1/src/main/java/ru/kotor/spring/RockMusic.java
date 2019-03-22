package ru.kotor.spring;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Something from Rock";
    }
}
