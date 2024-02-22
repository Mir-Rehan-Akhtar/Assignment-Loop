import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Number");
        int n1 = sc.nextInt();
        System.out.println("Enter your second Number");
        int n2 = sc.nextInt();
       int gcd = 1;
      for (int i = 1; i<=n1 && i<=n2;i++){
           if (n1%i==0 && n2%i==0)
           gcd = i;

       }
        System.out.println("GCD of "+ n1 + " and "+ n2 +" is "+gcd );


    }
}
