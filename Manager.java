public class Manager extends AbstractEmployee {

    private int salary;
    private String grade;

    public void setSalary(int salary) {
        salary = this.salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setGrade(String grade) {
        grade = this.grade;
    }

    public String getGrade() {
        return grade;
    }

    // public static void main(String args[]) {
    //     Manager m1 = new Manager();
    //     m1.label(70000,"Grade-A");
    // }
}
