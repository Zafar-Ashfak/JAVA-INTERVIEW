package Abstraction;

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.schoolName = "NSUT";

        Student s2 = new Student();
        System.out.println(Student.schoolName);

        float myMarks = Student.getMarks(90, 88, 95, 79, 89);
        System.out.println("You have got: " + myMarks + "%");
    }
}

class Student {
    public static String schoolName;
    String name;
    int roll;

    public static float getMarks(int phy, int che, int math, int hindi, int eng) {
        return (phy + che + math + hindi + eng) / 5.0f;
    }


}
