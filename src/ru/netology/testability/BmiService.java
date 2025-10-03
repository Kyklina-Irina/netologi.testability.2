package ru.netology.testability;

public class BmiService {
    public int calculate(double weightKg, double heightMeters) {
        double bmi = weightKg / (heightMeters * heightMeters);
        return (int) bmi;
    }
}