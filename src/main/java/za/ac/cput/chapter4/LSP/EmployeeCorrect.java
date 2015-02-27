package za.ac.cput.chapter4.LSP;


public class EmployeeCorrect extends Person{

    //this class can replace the parent class
    private String name;
    private String job;

    public EmployeeCorrect(String name,String job)
    {
        this.name = name;
        this.job = job;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setJob(String job)
    {
        this.job = job;
    }

    public String getJob()
    {
        return job;
    }

}
