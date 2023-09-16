public class Field {
    double length;
    double width;
    double length_;

    public Field(double length, double width, double length_) {
        this.length = length;
        this.width = width;
        this.length_ = length_;
    }
    double area(){
        double s;
        s = length * width;
        return  s;
    }
    void area_(){
        double s1 = length_ * width;
        System.out.println(s1);
    }

}
