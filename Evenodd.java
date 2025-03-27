import java.util.Scanner;

public class Evenodd {
    public static int isEven(int n) {
        if ((n & 1) == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number=");
        int num = sc.nextInt();
        int x = isEven(num);
        if (x == 1) {
            System.out.println("this is even num");
        } else {
            System.out.println("odd");
        }
        sc.close();

    }

}
