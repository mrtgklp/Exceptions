package exception01;

import java.util.Scanner;

public class CheckLicense {
    public static void main(String[] args) throws AgeFault {
        System.out.println("License take ages control to apply");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please you are age entry: ");
        int age = scan.nextInt();
        checkAge(age);
        System.out.println("End of to apply again wait you...");
    }

    public static void checkAge(int age) throws AgeFault {
        if(age<18){
            throw new AgeFault("Can't get driver license...");
        }
    }

}
