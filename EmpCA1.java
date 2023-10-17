public class EmpCA1 {
    private String name;
    private long salary;

    public EmpCA1(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }
      public String getname() {
        return name;
    }

    public void print() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void printEmpSameSal(EmpCA1[] employees) {
        for (int i= 0; i < employees.length; i++) {
            for (int n = i + 1; n < employees.length; n++) {
                if (employees[i].getSalary() == employees[n].getSalary()) {
                    employees[i].print();
                    employees[n].print();
                }
            }
        }
    }

    public static void main(String[] args) {
        EmpCA1[] employees = new EmpCA1[5];
        employees[0] = new EmpCA1("Subham", 9750);
        employees[1] = new EmpCA1("Aman Singh", 2100);
        employees[2] = new EmpCA1("Deepak", 8950);
        employees[3] = new EmpCA1("Ishwar", 9750);
        employees[4] = new EmpCA1("Jayvardhan", 2100);

        printEmpSameSal(employees);
    }
}
