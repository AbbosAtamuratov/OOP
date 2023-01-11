import java.util.Scanner;

public class Sums {

    static int ReadInt (String msg){
        System.out.println(msg);
        Scanner numy = new Scanner(System.in);
        int a = numy.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int num1 = ReadInt("Insert 1st number: ");
        int num2 = ReadInt("Insert 2nd number: ");
        System.out.printf("%d + %d = %d", num1, num2, num1+num2);
    }
}
