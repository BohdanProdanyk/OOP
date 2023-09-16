public class Main {
    public static void main(String[] args){
        Ball x = new Ball(2100,"Mikasa");
        Ball x1 = new Ball(1500,"Mizuno");
        Field y = new Field(18,9,9);
        Sitka z = new Sitka(1,9,2.43);

        System.out.println("Площа:");
        System.out.println(y.area());
        y.area_();
        System.out.println(z.area());
        System.out.println("Для чоловіков та жінок:");
        z.area();
        z.height();

        x.many();
        x1.many();
    }
}