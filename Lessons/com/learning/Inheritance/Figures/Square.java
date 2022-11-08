package com.learning.Inheritance.Figures;
import com.learning.Inheritance.Inheritance.Figurers;
import java.math.*;

public class Square extends Figurers {
    private double squareSquare;

    public Square(int side_a) {
        super(side_a);
        squareSquare = Math.pow(side_a, 2);
    }

    public double getSquareSquare() {
        return squareSquare;
    }

    @Override
    public double getSquare() {
        return squareSquare + 3; // Это перегрузка функции. Для квадртатов добавлены доп. 3см. к площади
    }
}
