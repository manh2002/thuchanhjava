import java.util.Scanner;
public class AppBai8 {
    public static void main(String[] args) {
        int n;
        try (Scanner m = new Scanner(System.in)) {
            do{
              System.out.println("Nhap so nguyen tu ban phim: ");
              n = m.nextInt();
            }while (n<=0); 
            int a[] = new int[n];
            float sum=0;
            for(int i=0;i<n;i++){
              System.out.println("a["+i+"]= ");
              a[i] = m.nextInt();
              sum+=a[i];
            }
            float average=sum/n;
            System.out.println("Trung binh cong cua n so nguyen = " + average);
        }
    }
}
