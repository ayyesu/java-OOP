public class Employee {
    private String name;
    private double salary;
    private String position;
    private String email;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        // Set attributes for employee1
        employee1.setName("Daniel Kissiedu");
        employee1.setSalary(100000.0);
        employee1.setPosition("Manager");
        employee1.setEmail("iamdanielkissiedu@gmail.com");
        employee1.setPhone("+233554989558");

        // Set attributes for employee2
        employee2.setName("James Gart");
        employee2.setSalary(60000.0);
        employee2.setPosition("Director");
        employee2.setEmail("jgart90@gmail.com");
        employee2.setPhone("+2336785674356");

        // Demonstrate the use of each method for employee1
        System.out.println("Employee 1");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println("Email: " + employee1.getEmail());
        System.out.println("Phone: " + employee1.getPhone());

        // Demonstrate the use of each method for employee2
        System.out.println("Employee 2");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary: " + employee2.getSalary());
        System.out.println("Position: " + employee2.getPosition());
        System.out.println("Email: " + employee2.getEmail());
        System.out.println("Phone: " + employee2.getPhone());
    }
}

