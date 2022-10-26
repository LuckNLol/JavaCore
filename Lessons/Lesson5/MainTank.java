package Lesson5;

public class MainTank {
    public static void main(Shtring[] args) {
        // Задача 1: Создаем танк, перемещаем по осям координат, выводим местонахождение
//        Tank tank = new Tank();
//        tank.goForward(10);
//        tank.printPosition();
//        tank.turnRight();
//        tank.goForward(50);
//        tank.printPosition();
//        tank.turnLeft();
//        tank.goBackward(100);
//        tank.printPosition();


       // Задача 2:
        // At (0;0) fuel=100
        Tank justTank = new Tank();
        // At (10;10) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

//        // Задача 3
//
//        Tank tank = new Tank();
//        tank.x = 1000; // Ошибка компиляции: х = private
//        tank.y = 2000; // Ошибка компиляции: у = private
//        tank.printPosition();

    }
}
