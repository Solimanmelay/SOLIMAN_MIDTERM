import java.util.Scanner;

// Base class for a Person
class Person {
    private String name;
    private int age;

    // Constructor to set name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display person's info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student class extending Person
class Student extends Person {
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000; // Fee per unit

    // Constructor for Student
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call to Person's constructor
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Calculate total fees
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Display student info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Person's displayInfo
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.printf("Total Fee: $%.2f%n", calculateFees());
        System.out.println(); // For spacing
    }
}

// Instructor class extending Person
class Instructor extends Person {
    private String employeeID;
    private String department;
    private double salary;

    // Constructor for Instructor
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call to Person's constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Display instructor info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Person's displayInfo
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.printf("Salary: $%.2f%n", salary);
        System.out.println(); // For spacing
    }
}

// Main class to run the program
public class EnrollmentSystem {
    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student("Melissa", 19, "231005165", "Computer Engineering", 4);
        Student student2 = new Student("Jomel", 20, "231001439", "Computer Engineering", 4);

        // Creating instructors
        Instructor instructor1 = new Instructor("Engr. Tanya", 25, "I do not know", "Engineering", 20000);
        Instructor instructor2 = new Instructor("Engr. Sarah", 48, "I do not know", "Engineering", 36000);

        // Displaying info for each person
        System.out.println("Student Details:");
        student1.displayInfo();
        student2.displayInfo();

        System.out.println("Instructor Details:");
        instructor1.displayInfo();
        instructor2.displayInfo();
    }
}
