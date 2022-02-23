import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        int a , b;
        Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap so nguyen duong a:");
       System.out.println("Nhapp so nguyen duong b:");
       a = scanner.nextInt();
       b = scanner.nextInt();
     // Tinh ucln
     System.out.println("UCLN cua" + a + " va " + b + " la " + UCLN(a, b));
    }
public static int UCLN( int a, int b){
        if( b == 0) return a;
        return UCLN(b, a % b);
}

}
