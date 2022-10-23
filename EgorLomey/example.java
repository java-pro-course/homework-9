class Person{
    private String name;
    private String surname;
    private String patronymic;
    private String floor;
    private int date;

    public Person(String name, String surname, String patronymic, String floor, int date) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.floor = floor;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public void getInfo() {
        System.out.println("Person");
        System.out.println("name: " +  name);
        System.out.println("surname: " + surname);
        System.out.println("patronymic: " + patronymic);
        System.out.println("floor: " + floor);
        System.out.println("date: " + date);

    }
}

class Student extends Person{
    private int school_number;
    private String school_name;
    private int clas;
    private String favorite_subject;


    public Student(String name, String surname, String patronymic, String floor, int date,
                   int school_number,String school_name,int clas,String favorite_subject) {
        super(name, surname, patronymic, floor, date);
        this.school_number = school_number;
        this.school_name = school_name;
        this.clas = clas;
        this.favorite_subject = favorite_subject;
    }
    public void getInfoAboutStudent() {
        super.getInfo();

        System.out.println("Student!");
        System.out.println("school_number: " + school_number);
        System.out.println("school_name: " + school_name);
        System.out.println("clas: " + clas);
        System.out.println("favorite_subject: " + favorite_subject);
    }

}




public class Main {
    public static void main(String[] args) {
        // Создание объекта без подвоха
        Student new_student = new Student("Egor","Lomey","Romanovich","male",12,1329,"Gori",6,"matesha");

        new_student.getInfoAboutStudent();



    }
}
