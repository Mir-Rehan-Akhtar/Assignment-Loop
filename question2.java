import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numkber");
        int n = sc.nextInt();
        System.out.println("The table of "+ n + " is ");
        for (int i = 1; i<=10 ; i++ )
            System.out.println(n*i);

    }
}
