public class Sitka {
    double width;
    double length;
    double height;

    public Sitka(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    double area(){
        double s3;
        s3 = length * width;
        return  s3;
    }
    void height(){
        double q = height - 0.19;
        System.out.println(height);
        System.out.println(q);
    }
}
