package BASICS;

public class classCreationInSameFile {
    public static class Student{
        // Data Members
        String name;
        int facultyNo;
        int enrollmentNo;
    }
    public static void display(Student s){
        System.out.println("Student name is = " + s.name);
        System.out.println("Student enrollment number = " + s.enrollmentNo);
        System.out.println("Student faculty number is "+ s.facultyNo);
    }

    public static void main(String[] args) {
        // Object Creation
        Student s = new Student();
        s.name = "Yatharth Kumar Saxena";
        s.enrollmentNo = 1;
        s.facultyNo = 1;
        display(s);
        Student s1 = new Student();
        System.out.println("If values are not assigned to the data members of the objects");
        System.out.println("Then Java give them default values as given below :-");
        display(s1);
        // Using the class outside this file but in the same package i.e BASICS
        Cars C = new Cars();
        C.name = "Maruti200";
        C.cost = 1234000;
        C.mileage = 15;
        C.ModelNo = "GP45B23146";
        C.yearOfManufacture = 2024;
        // C.specialDetectNo = 90; // Cannot be accessed as it is private data member
        System.out.println("Name of the Car is "+C.name);
        System.out.println("Model Number of the car is "+C.ModelNo);
        System.out.println("Cost of the car in Rupees is "+C.cost);
        System.out.println("Mileage of the car is "+C.mileage+" km/l");
        System.out.println(C.getYearOfManufacture());
    }
}
