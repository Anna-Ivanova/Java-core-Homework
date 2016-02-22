abstract class Shapes {
    private double side_a;
    private double side_b;
    private double side_c;
    private String name;
    private String color;

    Shapes() {
        side_a = side_b = side_c = 0;
        name = "none";
        color = "none";
    }

    Shapes(double a, double b, double c, String n, String col) {
        side_a = a;
        side_b = b;
        side_c = c;
        name = n;
        color = col;
    }

    public double getSide_a() {
        return side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public double getSide_c() {
        return side_c;
    }

    void setSide_a(double a) {
        side_a = a;
    }

    void setSide_b(double b) {
        side_b = b;
    }

    void setSide_c(double c) {
        side_c = c;
    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    void show() {
        System.out.println();
    }

    abstract double getSquare();

    abstract double getPerimetr();
}