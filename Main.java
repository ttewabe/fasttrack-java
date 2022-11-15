//import java.util.Scanner;
public class Main {

     public static void main(String args[]) {
        //Scanner input = new Scanner(System.in);
    	//System.out.println(" ");
        
        // String inp = input.next();
    	//System.out.println(inp + "\n Engineer" + "B "+ 5000);
         
        Engineer e1 = new Engineer();
        e1.label("B", 50000);
         
        Manager m1 = new Manager();
        m1.label("A", 70000); 
    }

   // public static void main(String [] args) {
   //    Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
   //    Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
   //    System.out.println("Call mailCheck using Salary reference --");
   //    s.mailCheck();
   //    System.out.println("\n Call mailCheck using Employee reference--");
   //    e.mailCheck();
   // }
}

