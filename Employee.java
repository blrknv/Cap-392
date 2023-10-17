public class Employee {

    private String name;
    private double salary;

    // Constructor for Employee class
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display employee details
    public void displayEmployee() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }

    // Nested Bonus class
    public class Bonus {
        private double bonusPercentage;

        // Constructor for Bonus class
        public Bonus(double bonusPercentage) {
            this.bonusPercentage = bonusPercentage;
        }

        // Calculate and display bonus
        public void calculateBonus() {
            double bonusAmount = salary * (bonusPercentage / 100);
            System.out.println("Bonus: " + bonusAmount);
        }
    }

    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee("krishnadas", 5000000);

        // Display employee details
        employee.displayEmployee();

        // Create an instance of Bonus (nested class)
        Employee.Bonus bonus = employee.new Bonus(10); // Assuming a 10% bonus

        // Calculate and display bonus
        bonus.calculateBonus();
    }
}