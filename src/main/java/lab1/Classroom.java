package lab1;

public class Classroom {


    public static void main(String[] args) {
    Students student1 = new Students();
    student1.name = "Jehovah ";
    student1.age = 17;
    student1.letterGrade = 'A';

    Students student2 = new Students();
    student2.name = "Elias ";
    student2.age = 16;
    student2.letterGrade = 'C';



    student1.printStudentInfo();

    student2.printStudentInfo();


    }
}
