import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception { 
        int sothunhat, sothuhai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat la: ");
        sothunhat = scanner.nextInt();
        System.out.println("Nhap so thu hai la: ");
        sothuhai = scanner.nextInt();
        int sonhonhat = sothunhat;
        if(sonhonhat>sothuhai)
            sonhonhat = sothuhai;
                System.out.println("So nho nhat trong 2 so la; " + sothunhat + " va " + sothuhai + " la: " + sonhonhat);
        
}
}
