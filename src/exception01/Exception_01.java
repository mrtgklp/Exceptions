package exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entry pres a number: ");
        int num = 0;
        try {
            System.out.println("Try blog welcome...");
            num = input.nextInt();
        } catch (Exception e) {
            throw new InputMismatchException("you need entry a number only==> (0,1,2,3,4,5,6,7,8,9)");
        }finally {
            System.out.println("Here is always working...");
        }
        System.out.println(num);
    }
}
