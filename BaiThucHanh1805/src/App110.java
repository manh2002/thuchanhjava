import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Comparator;;
public class App110 {
    public static void main(String[] args) throws Exception {
        String name;
        ArrayList<Integer> manh = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;//ptu cuar mang
        
        System.out.println("Nhap phan tu cua ArrayList: ");
        int n = sc.nextInt();
        // nhap phan tu cho arraylist
        for(int i=0; i<n;i++){
            System.out.println("Nhap phan tu thu"+ i + ":");
            number= sc.nextInt();
            manh.add(number);
        }
        System.out.println("Cac phan tu trong mang: ");
        for(int i=0; i<manh.size();i++){
            System.out.println(manh.get(i)+"\t");
        }
        
        int max= manh.get(0);
        for (int i = 1; i<manh.size();i++){
          
            if( manh.get(i).compareTo(max)>0){
                max = manh.get(i);
            }
        }
        System.out.println("So nguyen co gia tri lon nhat trong mang manh la :"+ max);
        
        int x;
        System.out.println("Nhap so nguyen can xoa: ");
        x = sc.nextInt();
        for(int i=0; i< manh.size(); i++){
            if(manh.get(i) == x){
                manh.remove(i);
            }
        }
        System.out.println("Sau khi xoa: ");
        for(int i=0; i<manh.size();i++){
            System.out.println(manh.get(i)+"\t");
        }

        manh.sort(Comparator.naturalOrder());
        System.out.println("Sau khi sap xep tang dan: ");
        for(int i=0; i<manh.size();i++){
            System.out.println(manh.get(i)+"\t");
        }

    
    }
}
