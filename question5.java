import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1, c;
        System.out.println("Enter your n term");
        n = sc.nextInt();
        System.out.println("This is your first " + n + "termsof the fibonacci series");
        for (int i = 1 ; i<=n ; i++){
            System.out.print(a +" ");
            c = a+b;
            a = b;
            b = c;
        }

    }
}
