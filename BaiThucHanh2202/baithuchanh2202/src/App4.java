import java.util.Scanner;
public class App4 {
    public static void main(String[] args) throws Exception {
  System.out.println("Nhap so nguyen duong n: ");
  int n;
  Scanner scanner = new Scanner(System.in);
  n = scanner.nextInt();
  System.out.printf("Tat ca cac so nguyen to nho hon %d la: \n ",n);
  if(n>=2){
      System.out.print(2);
  }
  for(int i = 3; i<n; i+=2 ){
    if(songuyento(i)){
        System.out.print(" " + i);
    } 
  }
}
public static boolean songuyento(int n){
    if(n<2){
         return false;
    }
    int canbac2 = (int) Math.sqrt(n);
    for ( int i = 2; i<= canbac2; i++){
        if(n % i == 0 ){
            return false;
        }
    }
    return true;
    }
}
