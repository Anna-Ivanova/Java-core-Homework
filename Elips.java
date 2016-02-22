public class Elips extends Shapes{
    // a - большая полуось
    // b - малая полуось
    double pi=3.14;
    Elips(){
        super();
    }
    Elips (double a, double b, double c, String n, String col){
        super(a,b,c, "эллипс","зеленый");
    }
    double getSquare() {
        return pi*getSide_a()*getSide_b();
    }

    @Override
    double getPerimetr() {
        return 4*(pi*getSide_a()*getSide_b()+(getSide_a()-getSide_b())*(getSide_a()-getSide_b()))/(getSide_a()+getSide_b());
    }

}