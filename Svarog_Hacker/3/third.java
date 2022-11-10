package com.company;

import java.util.Scanner;

class Person{
    private String name;
    private String surname;
    private String mName;
    private int age;
    private int bYear;

    public void happyBirthday(){
        this.age = age + 1;
    }
    public void setName(String name2){
        this.name = name2;
    }
	
    public void setSurname(String surname2){
        this.surname = surname2;
    }
	
    public void setMiddleName(String mName2){
        this.mName = mName2;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getMdlName() {
        return mName;
    }

    public int getBirthYear() {
        return bYear;
    }

    public Person(String name, String surname, String mName, int bYear) {
        this.name = name;
        this.surname = surname;
        this.mName = mName;
        this.bYear = bYear;
        this.age = 2022 - bYear;
    }
    public void getInfo(){
        System.out.println("The name is " + name);
        System.out.println("The surname is " + surname);
        System.out.println("The middle name is " + mName);
        System.out.println("The age is " + age);
        System.out.println("The year of birth is " + bYear);
    }
}

class Student extends Person{
    private int nOfSchool;
    private String tOfSchool;
    private int form;
    private String fSubject;

    public Student(String name, String surname, String mName, int bYear, int nOfSchool, String tOfSchool, int form, String fSubject) {
        super(name, surname, mName, bYear);
        this.nOfSchool = nOfSchool;
        this.tOfSchool = tOfSchool;
        this.form = form;
        this.fSubject = fSubject;
    }

    public void getInfoAboutStudent(){
        super.getInfo();
        System.out.println("The number of school is " + nOfSchool);
        System.out.println("The title of school is " + tOfSchool);
        System.out.println("The form is " + form);
        System.out.println("The favorite subject is " + fSubject);
        System.out.println("");
    }
}

class Employee extends Person{
    private String tOfCompany;
    private String Pos;
    private int Salary;
    private String fWeekDay;

    public Employee(String name, String surname, String mName, int bYear, String tOfCompany, String Pos, int Salary, String fWeekDay) {
        super(name, surname, mName, bYear);
        this.tOfCompany = tOfCompany;
        this.Pos = Pos;
        this.Salary = Salary;
        this.fWeekDay = fWeekDay;
    }
    public void getInfoAboutE(){
        super.getInfo();
        System.out.println("The title of company is " + tOfCompany);
        System.out.println("The position is " + Pos);
        System.out.println("The salary is " + Salary + " victims a month");
        System.out.println("The favorite day of the week is " + fWeekDay);
        System.out.println("");
    }
}
class SchoolClass{
    int n;
    Student[] students = new Student[n];
    String NSMofTeacher;
    int aRating;

    public SchoolClass(Student[] students, String NSMofTeacher, int aRating) {
        this.students = students;
        this.NSMofTeacher = NSMofTeacher;
        this.aRating = aRating;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getNSMofTeacher() {
        return NSMofTeacher;
    }

    public void setNSMofTeacher(String NSMofTeacher) {
        this.NSMofTeacher = NSMofTeacher;
    }

    public int getAvRating() {
        return aRating;
    }

    public void setAvRating(int aRating) {
        this.aRating = aRating;
    }
    public void getInfo(){
        System.out.println("The name, surname and middle name of teacher is "+ NSMofTeacher);
        System.out.println("The average rating is " + aRating);
        System.out.println("Information about students: \n");
        for (Student st: students) {
            System.out.println(st.getName() + " " + st.getSurname());
            st.getInfo();
            System.out.println("\n");
        }
    }
}

public class Main {

    public static int findAvRating(int[] sumOfRating, int n){
        int aRating = 0;
        for (int i = 0; i < n; i++) {
            aRating += sumOfRating[i];
        }
        return aRating /= n;
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp;
		
        System.out.println("If nothing happened in the program, then repeat");
        System.out.println("What is teacher's name, surname and middle name?");
        String NSM = in.nextLine();
		
        System.out.println("How many students are in your class?");
        int n = in.nextInt();
		
        System.out.println("Please, enter your form");
        int form = in.nextInt();
		
        System.out.println("What is number of school of your class?");
        int numSchool = in.nextInt();
		
        System.out.println("What is title of school of your class?");
        temp = in.nextLine();
        String  titSchool = in.nextLine();
        Student[] student = new Student[n];
		
        int[] rat = new int[n];
		
        for (int i = 0; i < n; i++) {
            System.out.println("What is student's name, student's surname and student's middle name?");
            System.out.println("Enter with a space, please");
            temp = in.nextLine();
            String[] nsm = in.nextLine().split(" ");
			
            System.out.println("What is student's year of birth?");
            int bYear = in.nextInt();
			
            System.out.println("What is student's favorite subject?");
            temp= in.nextLine();
            String fSubj = in.nextLine();
			
            System.out.println("What is student's rating?");
            rat[i] = in.nextInt();
			
            student[i] = new Student(nsm[0], nsm[1], nsm[2], bYear, numSchool, titSchool, form, fSubj);
        }
		
        int avRating = findAvRating(rat, n);
		
        SchoolClass schoolClass = new SchoolClass(student, NSM, avRating);
        schoolClass.getInfo();
    }
}