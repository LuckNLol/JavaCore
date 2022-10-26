// Это наследуемый класс от класса Worker_abstr

package Lesson5;

public class Developer extends Worker_abstr {
    private String name;
    private String progLanguage;


    private float salary;

    public Developer(String name, String progLanguage, float salary) {
        super(salary);
        this.name = name;
        this.progLanguage = progLanguage;
    }

    public void sayHi() {
        System.out.println("- Hi, I am " + name + " I'm " + progLanguage + " developer" + " my salary is " + salary + "$.");
    }

// G&S
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
        this.progLanguage = progLanguage;
    }

// Реализуем все абстрактные методы из каласса Worker_abstr (ПКМ -> Generate -> Implement Methods -> выбрать все из списка -> Ок)
    @Override
    public void addAgeCoefficient(float y) {
        super.setSalary(super.getSalary() * y);

    }
}
