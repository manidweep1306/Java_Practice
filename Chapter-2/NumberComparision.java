import java.util.*;

class Main {
    public static void main(String[] args) {
        double n = 4;
        Scanner s = new Scanner(System.in);
        double e = s.nextDouble();
        if(n>e){
            System.out.printf("%.1f is greater than %.1f\n",n,e);
        }
        else{
            System.out.printf("%.1f is smaller than %.1f\n",n,e);
        }
    }
}
