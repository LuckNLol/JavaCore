package Тимофей_Коваленко_JavaCourse;

public class Teacher extends People implements FirstInterface {

    private String subject;
    private String TeachID;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeachID() {
        return TeachID;
    }

    public void setTeachID(String teachID) {
        TeachID = teachID;
    }

    @Override
    public String getPeople() {
        return "Teacher";
    }

    @Override
    public String getUniverName() {
        return "222";
    }
}
