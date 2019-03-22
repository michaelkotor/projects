package ru.kotor.spring;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Something Classic";
    }
}
