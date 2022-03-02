import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        int n;//khai bao mang 1 chieu
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
        }
        while (n<0);
        int a[] = new int [n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for(int i=0; i<n;i++){
            System.out.print("Nhap phan tu thu " +i+": ");
        
        a[i] = sc.nextInt();
    }
    //tinh tong so chan
      double Tong=0;
      for (int i=0; i<n;i++){
          if(a[i] %  2 == 0){
              Tong+=a[i];
          }
      }  
        System.out.println("Tong cua cac so chan trong mang : "+ Tong);
        
    }
}
