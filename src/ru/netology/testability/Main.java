package ru.netology.testability;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        // Пример из условия: рост 1.87 м, вес 98 кг → ожидаем 28
        int bmi = service.calculate(98, 1.87);
        System.out.println("Ваш ИМТ: " + bmi);
    }
}