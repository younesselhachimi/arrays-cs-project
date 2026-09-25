package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

        // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        if(students.length==0){
            return null;
        }
        Student oldest = students[0];
        int max_age = oldest.getAge();
        for(int i=0;i<students.length;i++){
            if(students[i].getAge()>=max_age){
                max_age = students[i].getAge();
                oldest = students[i];
            }
        }

        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {

    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {

    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {

    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {

    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {

    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {

    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {

    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {

    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr = {
            new Student(1, "Youness"),
            new Student(2, "Noura", 19, 17),
            new Student(3, "Ali", 20),
            new Student(4, "Adam", 21, 15),
            new Student(5, "Aziza", 23)

        };


        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest


        // 3) Count adults


        // 4) Average grade


        // 5) Find by name


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student

    }
}