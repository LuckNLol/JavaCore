package Lesson5;

public class Designer extends Worker_abstr {

    public Designer(float salary) {
        super(salary);
    }

    @Override
    public void addAgeCoefficient(float y) {
        System.out.println("Дизайнерам процент не добавляется");
    }
}
