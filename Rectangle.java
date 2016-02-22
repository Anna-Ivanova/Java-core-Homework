public class Rectangle extends Shapes {

    Rectangle(){
        super();
    }
    Rectangle(double a, double b, double c, String n, String col){
        super(a,b,c,"прямоугольник","красный");
    }

    @Override
    double getSquare() {
        return getSide_a()*getSide_b();
    }

    @Override
    double getPerimetr() {
        return 2*(getSide_a()+getSide_b());
    }

}