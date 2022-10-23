public class Main {

    public static void main(String[] args) {

        Student student = new Student("John", "Doe", "Donald", "Male", "2000.10.09",27,
                34, "State school Num34", 8, "Math");

        Employee employee = new Employee("Jane", "Doe", "Robert", "Female", "1999.12.10", 25,
                "SpaceX", "Manager", 3000, "Tuesday");

        student.happyBirthday();
        student.happyBirthday();
        student.happyBirthday();

        employee.happyBirthday();
        employee.happyBirthday();
        employee.happyBirthday();

        student.getInfoAboutStudent();
        System.out.println();
        employee.getInfoAboutEmployee();
     }
}

class Person{
   private String name;
   private String lastName;
   private String patronymic;
   private String gender;
   private String birthday;
   private int age;

   Person (String name, String lastName, String patronymic, String gender, String birthday, int age){
       this.name = name;
       this.lastName = lastName;
       this.patronymic = patronymic;
       this.gender = gender;
       this.birthday = birthday;
       this.age = age;
   }

   public int happyBirthday(){
       age = age+1;
   return age;
   }

    public void setName(String name) {
       this.name = name;
     }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge(){return age;}
}

class Student extends Person {
    private int schoolNum;
    private String schoolName;
    private int schoolClass;
    private String favouriteSub;


    Student(String name, String lastName, String patronymic, String gender, String birthday, int age,  int schoolNum, String schoolName, int schoolClass, String favouriteSub) {
        super(name, lastName, patronymic, gender, birthday, age);
        this.schoolNum = schoolNum;
        this.schoolName = schoolName;
        this.schoolClass = schoolClass;
        this.favouriteSub = favouriteSub;
    }

    public void getInfoAboutStudent(){
        System.out.println("Name: " + getName() + "; " + "Lastname: " + getLastName() + "; " +  "Patronymic: " + getPatronymic() + "; "
                + "Gender: " + getGender() + "; " + "Birthday: " + getBirthday() + "; " + "Age: " + getAge() + "; "
                + "SchoolNum: " + schoolNum + "; " + "SchoolName: " + schoolName + "; "
                + "SchoolClass: " + schoolClass + "; " + "Favourite subject: " + favouriteSub);
    }
}
class Employee extends Person {
    private String companyName;
    private String post;
    private int salary;
    private String favouriteDay;

    Employee (String name, String lastName, String patronymic, String gender, String birthday, int age,  String companyName, String post, int salary, String favouriteDay){
        super(name, lastName, patronymic, gender, birthday, age);
        this.companyName = companyName;
        this.post = post;
        this.salary = salary;
        this.favouriteDay = favouriteDay;
    }

    public void getInfoAboutEmployee(){
        System.out.println("Name: " + getName() + "; " + "Lastname: " + getLastName() + "; " +  "Patronymic: " + getPatronymic() + "; "
                + "Gender: " + getGender() + "; " + "Birthday: " + getBirthday() + "; " + "Age: " + getAge() + "; "
                + "Company name: " + companyName + "; " + "Post: " + post + "; "
                + "Salary: " + salary + "; " + "Favourite day: " + favouriteDay);
    }
}
