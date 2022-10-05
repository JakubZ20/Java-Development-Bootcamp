public class Main {
  
    public static void main(String[] args) {
        Employee zack = new Employee("Zack", "Programmer");
        Employee gio = new Employee("Gio", "Analyst");
        Employee thomas = new Employee("Zack", "Specialist");
        System.out.println(Employee.getHiredCount());
    }
  
}
