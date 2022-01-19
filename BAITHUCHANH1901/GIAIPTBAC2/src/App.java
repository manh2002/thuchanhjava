import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double hesoA, hesoB, hesoC, delta, x1, x2  ;
        System.out.print("Nhap hesoA " );
        Scanner scan = new Scanner(System.in);
        hesoA = scan.nextDouble();
        System.out.print("Nhap hesoB =" );
        hesoB = scan.nextDouble(); 
        System.out.print("Nhap hesoC =" );
        hesoC = scan.nextDouble();
        delta =hesoB*hesoB-4*hesoA*hesoC;
        if(delta < 0){
            System.out.println("PT vô no");
        }
        else if ( delta == 0){
            x1 =- hesoB / (2*hesoA);
            System.out.println("PT có 1 no la x1, x2 = " +x1);
        }else{
            x1 = (-hesoB +  Math.sqrt(delta)) / (2*hesoA);
            x2 = (-hesoB -  Math.sqrt(delta)) / (2*hesoA);
            System.out.println("PT co 2 nghiem x1 = " + x1 +" va x2 = " +x2);
        }   
        
     scan.close();
        

    }
}
