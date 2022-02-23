import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2, reversed = 0;
        System.out.println("Nhap so can dao nguoc thu tu la: ");
        num1 = sc.nextInt();
        num2 = num1;
        while(num1 != 0) {
          int digit = num1 % 10;
          reversed = reversed * 10 + digit;
          num1 /= 10;
        }
        System.out.printf("Số "+ num2 +" sau khi dao nguoc thu tu la: " + reversed);
      }
}
