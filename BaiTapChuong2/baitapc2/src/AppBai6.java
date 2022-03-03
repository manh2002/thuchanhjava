import java.util.Scanner;
public class AppBai6 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
          System.out.println("Nhap so nguyen tu ban phim: ");
          n = sc.nextInt();
        }while (n<=0); 
        int giaithua=1;
        if(n==1||n==0)
          System.out.println(n+"!= "+giaithua);
        else {
          for(int i=2;i<=n;i++)
            giaithua*=i;
        }
        System.out.println("Giai thua cua " +n+"!= "+giaithua);
    }
    
}
