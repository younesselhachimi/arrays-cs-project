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
        int count = 0;
        if(students.length==0){
            return 0; 
        }
        for(int i=0;i<students.length;i++){
            if(students[i].getAge()>=18){
                count++;
            }
        }
        return count;


    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        if(students.length==0 ){
            return  Double.NaN;
        }
        double sum =0;
        for(Student s : students){
            sum+=s.getGrade();
        }
        return  sum/students.length;
        
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student s: students){
            if(name!=null && name.equalsIgnoreCase(s.getName())){
                return s;
            }
        }
        return  null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students,(s1,s2)->Integer.compare(s2.getGrade(), s1.getGrade()));
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student s:students){
            if(s.getGrade()>=15){
                System.out.println(s.getName());
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for(Student s:students){
            if(s.getId()==id){
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for(int i=0;i<students.length;i++){
            for(int j=i+1;j<students.length;j++){
                if(students[i].getName().equals(students[j].getName())){
                    System.out.println("Duplicate found");
                    return true;
                }
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] new_arr = new Student[students.length+1];
        for(int i=0;i<students.length;i++){
            new_arr[i]=students[i];
        }
        new_arr[students.length]=newStudent;
        return new_arr;

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
        System.out.println("The oldest student is : "+ findOldest(arr));

        // 3) Count adults
        System.out.println("The number of adult students is : "+ countAdults(arr));


        // 4) Average grade
        System.out.println("The average grade is : "+ averageGrade(arr));


        // 5) Find by name
        Student exist = findStudentByName(arr, "Ali");
        System.out.println(exist==null?"No student with this name": "The student exist in the array");
        // 6) Sort by grade desc
        sortByGradeDesc(arr);
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        boolean updated = updateGrade(arr, 4, 12);
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        boolean duplicate_exist = hasDuplicateNames(arr);
        System.out.println(duplicate_exist?"No duplicate name in the array student":"The array contains duplicate names");


        // 10) Append new student
        Student new_s = new Student(6, "Nadia", 21, 16);
        appendStudent(arr, new_s);
    }
}

