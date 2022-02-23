import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        System.out.println("\n Nhap vao 1 so bat ky de kiem tra: ");
        n = sc.nextInt();
        for(int i=1;i<=n/2;i++){
          if(n%i==0) 
            sum+=i;
        }
        if(sum==n){
          System.out.println(n + " la 1 so hoan thien");
        }
        else {
          System.out.println(n + " ko phai la 1 so hoan thien");
        }
      }
}
