import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i;
        i = scanner.nextInt();
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for ( i = 0; i < 100; i++) {
            if (songuyento(i)) {
                System.out.print(i + " ");
            }
        }
    }
        public static boolean songuyento (int n) {
            // so nguyen n < 2 khong phai la so nguyen to
            if (n < 2) {
                return false;
            }
            // check so nguyen to khi n >= 2
            int canbac2 = (int) Math.sqrt(n);
            for (int i = 2; i <= canbac2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

