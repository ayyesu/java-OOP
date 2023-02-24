public class Student {
    private String name;
    private int age;
    private double[] grades;

    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverage() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ali", 20, new double[]{3.9, 3.0, 3.2}),
                new Student("Mandy", 17, new double[]{4.0, 3.9, 3.0}),
                new Student("Prince", 21, new double[]{4.0, 3.5, 3.9})
        };

        for (Student student : students) {
            System.out.println(student.getName() + " grade average: " + student.getAverage());
        }
    }
}

