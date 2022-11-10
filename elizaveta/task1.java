class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private int year_of_birth;


    public Person(String name, String surname, String patronymic, String gender, int year_of_birth) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.year_of_birth = year_of_birth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getGender() {
        return gender;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }
    public void getInfo() {
        System.out.println("Person!");
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("patronymic: " + patronymic);
        System.out.println("gender: " + gender);
        System.out.println("year_of_birth: " + year_of_birth);
    }
}
class Student extends Person{
    private int number_school;
    private String name_school;
    private int number_class;
    private String love_subject;

    public Student(String name, String surname, String patronymic, String gender, int year_of_birth, int number_school, String name_school, int number_class, String love_subject)
    {
        super(name, surname, patronymic, gender, year_of_birth);
        this.number_school = number_school;
        this.name_school = name_school;
        this.number_class = number_class;
        this.love_subject = love_subject;
    }

    public void getInfoAboutStudent() {
        super.getInfo();
        System.out.println("number_school: " + number_school);
        System.out.println("name_school: " + name_school);
        System.out.println("number_class: " + number_class);
        System.out.println("love_subject: " + love_subject);
        System.out.println("------------------------------------");

    }
}

class Employee extends Person{
    private String name_company;
    private String post;
    private int salary;
    private String love_day_week;

    public Employee(String name, String surname, String patronymic, String gender, int year_of_birth, String name_company, String post, int salary, String love_day_week) {
        super(name, surname, patronymic, gender, year_of_birth);
        this.name_company = name_company;
        this.post = post;
        this.salary = salary;
        this.love_day_week = love_day_week;
    }

    public void getInfoAboutEmployee() {
        super.getInfo();

        System.out.println("name_company: " + name_company);
        System.out.println("post: " + post);
        System.out.println("salary: " + salary);
        System.out.println("love_day_week: " + love_day_week);
        System.out.println("------------------------------------");

    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Roma", "Ivanov", "Petrovich", "man", 2001, 49,
                "technical", 11, "math");
        student.getInfoAboutStudent();

        Employee employee = new Employee("Egor", "Romanov", "Pavlovich", "man", 1997, "Exp",
                "Devops", 150000, "saturday");
        employee.getInfoAboutEmployee();

    }
}
