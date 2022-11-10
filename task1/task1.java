package com.company;

class Person{
    private String name;
    private String surname;
    private String patronymic;
    private  String gender;
    private  int born;

    public Person(String name, String surname, String patronymic,
                  String gender, int born){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.born = born;
    }

    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getGender(){
        return gender;
    }
    public int getBorn(){
        return  born;
    }
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Patronymic: "  + getPatronymic());
        System.out.println("Gender: " + getGender());
        System.out.println("Born: " + getBorn());
    }
}

class Student extends Person{
    private int numSchool;
    private String nameSchool;
    private int numClass;
    private String favSub;


    public Student(String name, String surname, String patronymic, String gender, int born, int numSchool, String nameSchool, int numClass, String favSub) {
        super(name, surname, patronymic, gender, born);
        this.numSchool = numSchool;
        this.nameSchool = nameSchool;
        this.numClass = numClass;
        this.favSub = favSub;
    }
    public int getNumSchool(){
        return numSchool;
    }

    public int getNumClass() {
        return numClass;
    }

    public String getFavSub() {
        return favSub;
    }

    public String getNameSchool() {
        return nameSchool;
    }
    public void  getInfoAboutStudent(){
        System.out.println("Name School: " + getNameSchool());
        System.out.println("Number School" + getNumSchool() );
        System.out.println("Class: " + getNumClass()        );
        System.out.println("Favorite subject: " + getFavSub());
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Name School: " + getNameSchool());
        System.out.println("Number School" + getNumSchool() );
        System.out.println("Class: " + getNumClass()        );
        System.out.println("Favorite subject: " + getFavSub());
    }
}
class Employee extends Person {
    private  String nameComp;
    private String post;
    private int money;
    private int favDay;

    public Employee(String name, String surname, String patronymic, String gender, int born, String nameComp,
                    String post, int money, int favDay) {
        super(name, surname, patronymic, gender, born);
        this.nameComp = nameComp;
        this.post= post;
        this.money = money;
        this.favDay = favDay;
    }
    public String getNameComp(){
        return nameComp;
    }

    public String getPost() {
        return post;
    }

    public int getMoney() {
        return money;
    }

    public int getFavDay() {
        return favDay;
    }
    public void getInfoAboutEmployee(){
        System.out.println("Company name: " + getNameComp());
        System.out.println("Post: " + getPost());
        System.out.println("Money: " + getMoney());
        System.out.println("Favorite day " + getFavDay());
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Company name: " + getNameComp());
        System.out.println("Post: " + getPost());
        System.out.println("Money: " + getMoney());
        System.out.println("Favorite day " + getFavDay());
    }


}




public class Main {

    public static void main(String[] args) {
        Person person = new Person("Pedro", "Eleseivich", "Virinov", "Shark", 2000);
        person.getInfo();

        Student student = new Student("Pedron", "Eleseivichin", "Varinov", "Plane", 2000, 121, "Dialog", 13, "Math");
        student.getInfo();

        Employee employee = new Employee("Pedro", "Jovani", "None", "Sy21", 1995, "Volteck", "Stranger", 10, 5);
        employee.getInfoAboutEmployee();


    }
    public static void ln(String a){
        System.out.println(a);
    }
}
