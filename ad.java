

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
//        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.print("divisible by 5");
        } else {
            System.out.println("not divisible by 5");
        }


    }
}
