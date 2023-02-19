public class Person {
    private String firstName, lastName, gender, phoneNumber;
    private int age;

    public Person(){}

    public Person(String firstName, String lastName, String gender, String phoneNumber, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // A method to return the full name of the person (first name + last name)
    public String getFullName(){
        return firstName + " " + lastName;
    }

    // A method to return the age of the person.
    public int getAge(){
        return age;
    }

    // 	A method to return the gender of the person.
    public String getGender(){
        return gender;
    }

    // 	A method to return the phone number of the person.
    public String getPhoneNumber(){
        return phoneNumber;
    }

    // A method to set the first name of the person.
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // A method to set the last name of the person.
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // 	A method to set the age of the person.
    public void setAge(int age){
        this.age = age;
    }

    // 	A method to set the phone number of the person.
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public static void main(String[] args){

        Person person1 = new Person("Daniel", "Kissiedu", "Male", "0554989558", 20);

        System.out.println("Full Name: " + person1.getFullName());
        System.out.println("Gender: " + person1.getGender());
        System.out.println("Phone Number: " + person1.getPhoneNumber());
        System.out.println("Age: " + person1.getAge());
    }
}
