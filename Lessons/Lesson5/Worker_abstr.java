// Это родительский класс для класса Developer

package Lesson5;

public abstract class Worker_abstr {

    private float salary;

    public Worker_abstr(float salary) {
        this.salary = salary;
    }

    public void addToSalary(float x) {
        this.salary += x;
    }

// Абстрактный метод без реализации:
    public abstract void addAgeCoefficient(float y);

    // G&S для ЗП
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


}
