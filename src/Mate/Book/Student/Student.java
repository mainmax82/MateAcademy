package Mate.Book.Student;

public class Student {
    String firstName;
    String lastName;
    int age;
    boolean isEmployed;

    Student(String firstName, String lastName, int age, boolean isEmployed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    public static void main(String[] args) {

        Student[] studentsInfo = new Student[6];
        double employed = 0;
        double afterThirty = 0;
        studentsInfo[0] = new Student("Alina", "Ivanova", 30, true);
        studentsInfo[1] = new Student("Ivan", "Petrov", 26, false);
        studentsInfo[2] = new Student("Irina", "Stetsenko", 35, true);
        studentsInfo[3] = new Student("Yurii", "Shvets", 40, true);
        studentsInfo[4] = new Student("Daria", "Kovalchyk", 33, false);
        studentsInfo[5] = new Student("Olha", "Kulyk", 22, true);
        for (int i = 0; i < studentsInfo.length; i++) {

            if (studentsInfo[i].isEmployed == true && studentsInfo[i].age>= 30) {
                employed++;
            }
            if ( studentsInfo[i].age>= 30) {
                afterThirty++;
            }
        }
        System.out.println(employed);
        System.out.println(afterThirty);
        System.out.println(employed/afterThirty);
    }
}