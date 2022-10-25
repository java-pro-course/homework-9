
import java.util.Scanner;

class Person{
    private String name;
    private String surname;
    private String secName;
    private String gender;
    private int year;




    Person(String name, String surname, String secName, String gender, int year){
        this.name = name;
        this.surname = surname;
        this.secName = secName;
        this.gender = gender;
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecName() {
        return secName;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public void getInfo(){
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getSecName());
        System.out.println("Gender: " + getGender());
        System.out.println("Year of b-day: " + getYear());
    }
}
class SchoolClass{
    private Student[] students;
    private String teacher;
    private int mark;
    private int count;

    SchoolClass(Student[] students, String teacher, int count){
        this.students = students;
        this.teacher = teacher;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Student[] getStudents(){
        return students;
    }
    public String getTeacher(){
        return teacher;
    }
    public int getMark(){
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void getInfo(){
        for (int i = 0; i < getCount(); i++) {
            setMark(getMark() + students[i].getMark());
        }
        setMark(Math.round(getMark() / getCount()));

        System.out.println("~~Class~~");
        System.out.println("Teacher: " + getTeacher());
        System.out.println(students[0].getSchool() + " # " + students[0].getNum());
        System.out.println("Grade: " + students[0].getGrade());
        System.out.println("Mark: " + getMark());
        System.out.println();
        for (int i = 0; i < getCount(); i++) {
            setMark(getMark() + students[i].getMark());
            System.out.println(students[i].getName());
            System.out.println(students[i].getSurname());
            System.out.println(students[i].getSecName());
            System.out.println("Gender: " + students[i].getGender());
            System.out.println("Year of b-day: " + students[i].getYear());
            System.out.println("Favourite subject: " + students[i].getFav());
            System.out.println("Mark: " + students[i].getMark());
            System.out.println();
        }


    }

}

class Student extends Person{
    private int num;
    private String school;
    private String grade;
    private String fav;
    private int mark;



    public int getMark() {
        return mark;
    }

    public int getNum() {
        return num;
    }

    public String getSchool() {
        return school;
    }

    public String getGrade() {
        return grade;
    }

    public String getFav() {
        return fav;
    }



    public Student(String name, String surname, String secName, String gender, int year, int mark, int num, String school, String grade, String fav) {
        super(name, surname, secName, gender, year);
        this.num = num;
        this.school = school;
        this.grade = grade;
        this.fav = fav;
        this.mark = mark;
    }

    @Override
    public void getInfo(){
        System.out.println("\t`Student`");


        super.getInfo();

        System.out.println(getSchool() + " # " + getNum());
        System.out.println("Grade: " + getGrade());
        System.out.println("Favourite subject: " + getFav());
        System.out.println("Mark: " + getMark());
        System.out.println();
    }
}

public class task_3 {

    public static void main(String[] args) {

        System.out.println("Please, enter number of students:(integer) ");
        int count = in.nextInt();
        System.out.println("Now, teacher`s name, surname and second name:(string) ");
        String teacher = in.next();
        System.out.println("What`s your school name?(string) ");
        String school = in.next();
        System.out.println("School number?(integer) ");
        int num = in.nextInt();
        System.out.println("Grade?(string) ");
        String grade = in.next();
        System.out.println("Now you have to enter students information~>>(name, surname, second name, gender, year of birth, mark, favourite subject) \n");
        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            students[i] = new Student(in.next(), in.next(), in.next(), in.next(), in.nextInt(), in.nextInt(), num, school, grade, in.nextLine());
        }

        SchoolClass schoolClass = new SchoolClass(students, teacher, count);
        schoolClass.getInfo();
    }

    public static Scanner in = new Scanner(System.in);
}