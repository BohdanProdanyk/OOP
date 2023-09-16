public class Ball {
    int cost;
    String brand;
    public Ball(int cost, String brand) {
        this.cost = cost;
        this.brand = brand;
    }
    void many(){
        if (brand == "Mikasa"){
           double a = cost + 5;
            System.out.println(a);
        } else if (brand == "Mizuno") {
            double b  = cost + 10;
            System.out.println(b);
        }else {
            System.out.println("Не коректне значення");
        }

    }
}
