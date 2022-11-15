public class Engineer extends AbstractEmployee {
    private int salary;
    private String grade;
    public void setSalary(int salary) {
        salary = this.salary;
    }

    public int  getSalary() {
        return  salary;
    }

    public void setGrade(String grade) {
    grade = this.grade;
    }

    public String getGrade() {
    return grade;
    }

    // public static void main(String args[])
    // {
    //     Engineer e1 = new Engineer();
    //     e1.label(50000,"Grade-B");

    // }
}