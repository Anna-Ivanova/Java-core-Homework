public class MainShapes {

    public static void main(String[] args) {
    Shapes shape[]=new Shapes[3];

	shape[0]=new Triangle(3,2,3,"", "");
    shape[1]=new Rectangle(6,4,0, "", "");
    shape[2]=new Elips(10,5,0, "", "");


        for (int i=0; i<shape.length;i++){
            System.out.println("Фигура "+shape[i].getName()+" цвет "+shape[i].getColor());

            System.out.println("Периметр " + "=" + shape[i].getPerimetr());
            System.out.println("Площадь " + "=" + shape[i].getSquare());
        }
    }
}