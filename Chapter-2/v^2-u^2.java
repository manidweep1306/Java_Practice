import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter v:");
            double v = s.nextDouble();
            System.out.println("Enter u:");
            double u = s.nextDouble();
            System.out.println("Enter a:");
            double a = s.nextDouble();
            System.out.println("Enter s:");
            double sa = s.nextDouble();
            double e = ((v*v)-(u*u))/(2*a*sa);
            System.out.println(e);
    }
}
