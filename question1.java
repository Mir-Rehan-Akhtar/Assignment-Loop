import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n;i++){
            sum +=i;
    }
        System.out.println("Sum of the natural number up to "+ n +" is "+sum);
}
    }
