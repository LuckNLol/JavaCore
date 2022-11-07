package com.learning.Inheritance.Inheritance;

public abstract class Figurers {
// Свойства
    private double side_a;
    private int radius;
    private int height;
    private int groung;

// Абстрактный метод
    public abstract double getSquare();

// Конструкторы
    public Figurers(double side_a) {
        this.side_a = side_a;
    }

    public Figurers(int radius) {
        this.radius = radius;
    }

    public Figurers(int height, int groung) {
        this.height = height;
        this.groung = groung;
    }


// Геттеры и Сеттеры (не использовали)

}

