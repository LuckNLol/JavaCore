package Тимофей_Коваленко_JavaCourse;

public class Student extends People implements FirstInterface {
    private String spec;

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }


    @Override
    public String getPeople() {
        return "Student";
    }


    @Override
    public String getUniverName() {
        return "111";
    }
}
