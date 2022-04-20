public class TaxiCar implements Car {
    public void Move(){
        System.out.println("Xe TaXi di chuyen");
    }
    public void Stop(){
        System.out.println("Xe TaxI dung lai");
    }
    
    public void TurnRight(){
        System.out.println("Xe TaxI sang phai");
    }
    
    public void TurnLeft(){
        System.out.println("Xe TaxI sang trai");
    }
    
    public void Reverse(){
        System.out.println("Xe TaxI di nguoc");
    }
    public static void main(String[] args) {
        Car Manh = new TaxiCar();
        Manh.Move();
        Manh.Stop();
        Manh.TurnRight();
        Manh.TurnLeft();
        Manh.Reverse();
    }
}
