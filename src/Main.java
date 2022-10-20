import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double i =-1;
        double a = 0;
        double b = 0;
        double c = 0;

        do {
            b = sc.nextInt();
            a += b;
            c = a;
            i++;

        }while ( b != 0  );
        System.out.println( c / i);



    }
}
