package com.company;

class Person{
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private int birthdate;
    private int age;

    Person(String name, String surname, String patronymic, String gender, int birthdate, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthdate = birthdate;
        this.age = age;
    }

    void getInfo(Person person){
        System.out.println("Main information: ");
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Patronymic: " + patronymic);
        System.out.println("Gender: " + gender);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Age: " + age);
    }

    void setName(String name){
        this.name = name;
    }
    void setSurname(String surname){
        this.surname = surname;
    }
    void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    void setGender(String gender){
        this.gender = gender;
    }
    void setBirthdate(int birthdate){
        this.birthdate = birthdate;
    }

    String getName(){
        return this.name;
    }
    String getSurname(){
        return this.surname;
    }
    String getPatronymic(){
        return this.patronymic;
    }
    String getGender(){
        return this.gender;
    }
    int getBirthdate(){
        return this.birthdate;
    }

    public void happyBirthday(Person person){
        this.age+=1;
    }
}
class Student extends Person {
    private int schoolNumber;
    private String schoolName;
    private int classNumber;
    private String favLesson;

    public Student(String name, String surname, String patronymic, String gender, int birthdate, int age, int schoolNumber, String schoolName, int classNumber, String favLesson) {
        super(name, surname, patronymic, gender, birthdate, age);
        this.schoolNumber = schoolNumber;
        this.schoolName = schoolName;
        this.classNumber = classNumber;
        this.favLesson = favLesson;
    }
    public void getInfoAboutStudent(){
        System.out.println("Student information: ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("School number: " + schoolNumber);
        System.out.println("School name: " + schoolName);
        System.out.println("Favourite lesson: " + favLesson);
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
    public void setFavLesson(String favLesson) {
        this.favLesson = favLesson;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public int getClassNumber() {
        return classNumber;
    }
    public String getFavLesson() {
        return favLesson;
    }
}
class Employee extends Person{
    private String companyName;
    private String jobPlace;
    private int salary;
    private String favouriteDayOfWeek;

    public Employee(String name, String surname, String patronymic, String gender, int birthdate, int age, String companyName, String jobPlace, int salary, String favouriteDayOfWeek){
        super(name, surname, patronymic, gender, birthdate, age);
        this.companyName = companyName;
        this.jobPlace = jobPlace;
        this.salary = salary;
        this.favouriteDayOfWeek = favouriteDayOfWeek;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setJobPlace(String jobPlace) {
        this.jobPlace = jobPlace;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setFavouriteDayOfWeek(String favouriteDayOfWeek) {
        this.favouriteDayOfWeek = favouriteDayOfWeek;
    }

    public String getFavouriteDayOfWeek() {
        return favouriteDayOfWeek;
    }
    public String getCompanyName() {
        return companyName;
    }
    public String getJobPlace() {
        return jobPlace;
    }
    public int getSalary() {
        return salary;
    }

    public void getEmployeeInfo(Employee employee){

        System.out.println("Employee information: ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Company Name: " + companyName);
        System.out.println("Job Place: " + jobPlace);
        System.out.println("Salary: " + salary);
        System.out.println("Favourite day of week: " + favouriteDayOfWeek);
    }

}

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Людмила", "Осадова", "Валерьевна", "жен", 2005, 17, 3, "МОУ СОШ №3", 7, "Алгебра");
        Employee employee = new Employee("Олег", "Павлов", "Алиханович", "муж", 1995, 37, "Орешек", "Чистельщик орехов", 25000, "Выходной");
        student.getInfo(student);
        student.getInfoAboutStudent();
        System.out.println("");

        employee.getInfo(employee);
        employee.getEmployeeInfo(employee);

        System.out.println("");

        student.happyBirthday(student);
        student.happyBirthday(student);
        student.happyBirthday(student);

        employee.happyBirthday(employee);
        employee.happyBirthday(employee);
        employee.happyBirthday(employee);
        employee.happyBirthday(employee);
        employee.happyBirthday(employee);

        student.getInfo(student);
        System.out.println("");
        employee.getInfo(employee);
    }
}
