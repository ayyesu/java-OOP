
public class Employee extends Person {
    private double salary;
    private String jobTitle;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Daniel Kissiedu");
        employee.setAge(30);
        employee.setGender("Male");
        employee.setSalary(200000.0);
        employee.setJobTitle("Software Engineer");

        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Gender: " + employee.getGender());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Job Title: " + employee.getJobTitle());
    }
}