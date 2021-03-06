
public class buhuchet {

    public static void main(String[] args) {

        Employee[] empl = new Employee[10];
        empl[0] = new Employee(12345, "IVANOV", "SERGEY", 1500);
        empl[1] = new Employee(12346, "BRUS", "ANDREY", 1600);
        empl[2] = new Employee(12347, "SVYAZHIN", "GLEB", 3000);
        empl[3] = new Employee(12348, "ZARITSKIY", "OLEG", 1000);
        empl[4] = new Employee(12349, "KORNEEV", "ALEXEY", 1200);
        empl[5] = new Employee(12351, "PETROVA", "ELENA", 800);
        empl[6] = new Employee(12352, "KOMAROVA", "ALLA", 500);
        empl[7] = new Employee(12353, "BOYKO", "VADIM", 2000);
        empl[8] = new Employee(12354, "VASILIEVA", "VIKA", 1500);
        empl[9] = new Employee(12355, "KOSTIN", "LEV", 1000);
        System.out.println("INN   " + " FAMILIYA    " + " IMYA   " + "ZARPLATA   ");

        for (int i = 0; i < empl.length; i++) {
            empl[i].show();
        }
        int maxz=maxzp(empl);
        int minz=minzp(empl);
        System.out.println("Fond zarplaty= "+ Sumcount(empl));
        System.out.println("Mazhor nayden - eto ");
        empl[maxz].show();
        empl[minz].show();
    }

    public static double Sumcount(Employee[] empl) {
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            sum += empl[i].getSalary();
        }
        return sum;
    }

    public static int maxzp(Employee[] empl) {
        double max = empl[0].getSalary();
        int indexmax = 0;
        for (int i = 1; i < empl.length; i++) {
            if (empl[i].getSalary() > max) {
                max = empl[i].getSalary();
                indexmax = i;

            }
        }
        return indexmax;
    }

    public static int minzp(Employee[] empl) {
        int indexmin = 0;
        double min = empl[0].getSalary();
        for (int i = 1; i < empl.length; i++) {
            if (empl[i].getSalary() < min) {
                min = empl[i].getSalary();
                indexmin = i;
            }
        }
        return indexmin;
    }
}