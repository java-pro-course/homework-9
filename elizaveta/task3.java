import java.util.*;

class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private int year_of_birth;
    private int age;


    public Person(String name, String surname, String patronymic, String gender, int year_of_birth) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.year_of_birth = year_of_birth;
        this.age = 2022 - getYear_of_birth();    }

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

    public void happyBirthday() {
        this.age += 1;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setOtchestvo(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void getInfo() {
        System.out.println("Person!");
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("patronymic: " + patronymic);
        System.out.println("gender: " + gender);
        System.out.println("year_of_birth: " + year_of_birth);
        System.out.println("age: " + age);

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
    @Override
    public void getInfo() {
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
    @Override
    public void getInfo() {
        super.getInfo();

        System.out.println("name_company: " + name_company);
        System.out.println("post: " + post);
        System.out.println("salary: " + salary);
        System.out.println("love_day_week: " + love_day_week);
        System.out.println("------------------------------------");

    }
}

class SchoolClass{
    private List<Student> students;
    private String fio_teacher;
    private int mark;

    SchoolClass(List<Student> students, String fio_teacher, int mark){
        this.students = students;
        this.fio_teacher = fio_teacher;
        this.mark = mark;

    }
    public List<Student> getStudents(){
        return students;
    }
    public String getFIO_teacher(){
        return fio_teacher;
    }
    public int getMark(){
        return mark;
    }
    public void getInfo(){
        System.out.println("School_Class:");
        for (int i = 0; i<= students.size(); i++) {
            students.get(i).getInfo();
        }
        System.out.println("students: " + students);
        System.out.println("fio_teacher: " + fio_teacher);
        System.out.println("mark: " + mark);

    }
}


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Roma", "Ivanov", "Petrovich", "man", 2001, 49,
                "technical", 11, "math");
        for (int i = 1; i<=3;i++){
            student.happyBirthday();}
        student.getInfo();

        Employee employee = new Employee("Egor", "Romanov", "Pavlovich", "man", 1997, "Exp",
                "Devops", 150000, "saturday");
        for (int i = 1; i<=5;i++){
            employee.happyBirthday();}
        employee.getInfo();


        Scanner in = new Scanner(System.in);
        System.out.println("Count students:");
        int count = in.nextInt();
        System.out.println("ФИО учителя: ");
        String teacher = in.next();
        System.out.println("Название школы: ");
        String name_school = in.next();
        System.out.println("Номер школы: ");
        int number_school = in.nextInt();
        System.out.println("number_class");
        int number_class = in.nextInt();
        System.out.println("Средняя оценка (целочисленная) ");
        int mark = in.nextInt();
        System.out.println("Now you have to enter students information~>>(name, surname, second name, gender, year of birth,favourite subject) \n");

        // здесь совсем запуталась с объявлением списка, пока не разобралась
        List<Student> students = new Student();
        for (int i = 0; i < count; i++) {
            students.get(i) = new Student(in.next(), in.next(), in.next(), in.next(), in.nextInt(), number_school, name_school, number_class, in.nextLine());
        }

        SchoolClass schoolClass = new SchoolClass(students, teacher, mark);
        schoolClass.getInfo();
    }
}
