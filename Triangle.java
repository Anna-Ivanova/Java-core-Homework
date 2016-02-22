public class Triangle extends Shapes {

    Triangle(){
        super();
    }
    Triangle(double a, double b, double c, String n,String col){
        super(a,b,c,"треугольник", "синий");
    }

    @Override
    double getSquare() {
        double p=getPerimetr()/2;
        return Math.sqrt(p*((p -getSide_a())*(p-getSide_b())*(p-getSide_c())));
    }

    @Override
    double getPerimetr() {
        return getSide_a()+getSide_b()+getSide_c();
    }
}
