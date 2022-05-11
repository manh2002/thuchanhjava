import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;;
public class App60{
public static void main (String[] args) {
    int n;
    String a;
    Set<String> manh = new LinkedHashSet<>();
    Scanner sc = new Scanner(System.in);
   
    manh.add("Java");
    manh.add("C++");
    manh.add("JavaSrcirpt");
    manh.add("PHP");
    
    System.out.println("Vui long nhap so phan tu : " );
    n = sc.nextInt();
    // show set
   
    for(int i=1; i<=n; i++){
        System.out.println("Vui long nhap phan tu thu:" +i );
        a= sc.nextLine();
        manh.add(a);
    }
    for (String str : manh ){
        System.out.println(str) ;
    }
}
    }