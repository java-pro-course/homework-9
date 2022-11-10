public class Main {

    public static void main(String[] args) {

        Student student = new Student("John", "Doe", "Donald", "Male", "2000.10.09",
                34, "State school Num34", 8, "Math");

        Employee employee = new Employee("Jane", "Doe", "Robert", "Female", "1999.12.10",
                "SpaceX", "Manager", 3000, "Tuesday");

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


   Person (String name, String lastName, String patronymic, String gender, String birthday ){
       this.name = name;
       this.lastName = lastName;
       this.patronymic = patronymic;
       this.gender = gender;
       this.birthday = birthday;

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
}

class Student extends Person {
    private int schoolNum;
    private String schoolName;
    private int schoolClass;
    private String favouriteSub;


    Student(String name, String lastName, String patronymic, String gender, String birthday, int schoolNum, String schoolName, int schoolClass, String favouriteSub) {
        super(name, lastName, patronymic, gender, birthday);
        this.schoolNum = schoolNum;
        this.schoolName = schoolName;
        this.schoolClass = schoolClass;
        this.favouriteSub = favouriteSub;
    }

    public void getInfoAboutStudent(){
        System.out.println("Name: " + getName() + "; " + "Lastname: " + getLastName() + "; " +  "Patronymic: " + getPatronymic() + "; "
                + "Gender: " + getGender() + "; " + "Birthday: " + getBirthday() + "; "
                + "SchoolNum: " + schoolNum + "; " + "SchoolName: " + schoolName + "; "
                + "SchoolClass: " + schoolClass + "; " + "Favourite subject: " + favouriteSub);
    }
}
class Employee extends Person {
    private String companyName;
    private String post;
    private int salary;
    private String favouriteDay;

    Employee (String name, String lastName, String patronymic, String gender, String birthday, String companyName, String post, int salary, String favouriteDay){
        super(name, lastName, patronymic, gender, birthday);
        this.companyName = companyName;
        this.post = post;
        this.salary = salary;
        this.favouriteDay = favouriteDay;
    }

    public void getInfoAboutEmployee(){
        System.out.println("Name: " + getName() + "; " + "Lastname: " + getLastName() + "; " +  "Patronymic: " + getPatronymic() + "; "
                + "Gender: " + getGender() + "; " + "Birthday: " + getBirthday() + "; "
                + "Company name: " + companyName + "; " + "Post: " + post + "; "
                + "Salary: " + salary + "; " + "Favourite day: " + favouriteDay);
    }
}
