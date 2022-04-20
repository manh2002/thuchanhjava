public class Tiger extends Animal {
    void eat(){
        System.out.println("hổ ăn thịt");
    }
    void sleep(){
        System.out.println("ho di ngu");
    }
    void walk(){
        System.out.println("ho di bo");
    }
    void run(){
        System.out.println("ho chay san moi");
    }
    void roar(){
        System.out.println("ho gam gu");
    }
    public static void main(String[] args) {
        Animal Manh = new Tiger();
        Manh.eat();
        Manh.walk();
        Manh.run();
        Manh.roar();
    }
}
