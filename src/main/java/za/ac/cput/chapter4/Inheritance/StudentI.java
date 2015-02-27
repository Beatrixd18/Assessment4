package za.ac.cput.chapter4.Inheritance;


public class StudentI extends PersonEncapsulation {
    private String school;

    public StudentI(String name, int age, String address, String school)
    {
        super(name, age, address);
        this.school = school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public String getSchool()
    {
        return school;
    }
}
