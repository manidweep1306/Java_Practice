import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double g = s.nextDouble();
        double e = g+8;
        System.out.println("Encrypt:"+(e));
        double d = e-8;
        System.out.print("Decrypt:"+(d));
    }
}
