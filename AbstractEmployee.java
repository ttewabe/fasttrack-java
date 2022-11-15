public abstract class AbstractEmployee {

    public abstract void setSalary(int salary);

    public abstract int  getSalary();

    public abstract void setGrade(String grade);

    public abstract String  getGrade();

     void label(String grade, int salary)
    {
        System.out.println("Employee's data :"+ " \n Grade: "+grade +" \n Salary: " +salary);
    }
}
