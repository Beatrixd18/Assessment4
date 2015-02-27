package za.ac.cput.chapter4.Inheritance;


public class EmployeeI extends PersonEncapsulation {
    private String work;

    public EmployeeI(String name, int age, String address, String work)
    {
        super(name, age, address);
        this.work = work;
    }

    public void setWork(String work)
    {
        this.work = work;
    }

    public String getWork()
    {
        return work;
    }
}
