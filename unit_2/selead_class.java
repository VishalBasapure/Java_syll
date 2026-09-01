public class  selead_class {
    public static void main(String[] args) {

        Student s1 = new UgStudent();
        Student s2 = new PgStudent();
        Student s3 = new Diploma();

    }
}

sealed class Student permits UgStudent, PgStudent, Diploma {

    Student() {
        System.out.println("Student class sealed");
    }
}

final class UgStudent extends Student {

    UgStudent() {
        System.out.println("UG student");
    }
}

final class PgStudent extends Student {

    PgStudent() {
        System.out.println("PG student");
    }
}

final class Diploma extends Student {

    Diploma() {
        System.out.println("Diploma student");
    }
} 
    

