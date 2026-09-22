package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int newCourse = 2222;
        int[] updatedCourses = new int[registeredCourses.length+1];
        for(int i=0;i<registeredCourses.length;i++){
            updatedCourses[i]=registeredCourses[i];
        }
        updatedCourses[updatedCourses.length-1]=newCourse;

        for(int i=0;i<updatedCourses.length-1;i++){
            System.out.print(updatedCourses[i]);
            System.out.print(" | ");
        }
        System.out.println(updatedCourses[updatedCourses.length-1]);


    }
}
