import models.Employee;
import models.Store;

//import models.*;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Paul", "stocker");
        Employee assisManager = new Employee("Nicholas", "Assistant");
        Employee manager = new Employee("Demien", "Manager");

        Store store = new Store();
        store.setEmployees(0, stocker);
        store.setEmployees(1, assisManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        store.open();
    }
}
