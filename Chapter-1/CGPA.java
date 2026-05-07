import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects: ");
        float a = s.nextInt();
        float b = s.nextInt();
        float c = s.nextInt();
        float gpa = ((a + b + c)/300)*10;
        System.out.println("CGPA: " + gpa);
    }
}
