import java.util.Comparator;
import java.lang.*;
import java.util.Arrays;

public class dz56{

  public static void main(String[] args) {

        Employee[] empl = new Employee[10];
        empl[0] = new FabrikaManagers(12345, "IVANOV", "SERGEY", 1500);
        empl[1] = new FabrikaManagers(12346, "BRUS", "SERGEY", 1600);
        empl[2] = new FabrikaManagers(12347, "SVYAZHIN", "GLEB", 3000);
        empl[3] = new FabrikaManagers(12348, "ZARITSKIY", "OLEG", 1000);
        empl[4] = new FabrikaManagers(12349, "KORNEEV", "ALEXEY", 1200);
        empl[5] = new Employee(12351, "PETROVA", "ELENA", 800);
        empl[6] = new Employee(12352, "KOMAROVA", "ALLA", 500);
        empl[7] = new Employee(12353, "BRUS", "ANDREY", 2000);
        empl[8] = new Employee(12354, "VASILIEVA", "VIKA", 1500);
        empl[9] = new Employee(12355, "KOSTIN", "LEV", 1000);
        System.out.println("INN   " + " FAMILIYA    " + " IMYA   " + "ZARPLATA   ");

        for (int i = 0; i < empl.length; i++) {
            empl[i].show();
        }
        int maxz = maxzp(empl);
        int minz = minzp(empl);
        System.out.println("Fond zarplaty= " + Sumcount(empl));
        System.out.println("Mazhor nayden - eto ");
        empl[maxz].show();
        System.out.println("Bednyazhka nayden - eto ");
        empl[minz].show();
        System.out.println(" ");
        Arrays.sort(empl, new SortedByInn());

        for (Employee i : empl) {
            i.show();
        }
        System.out.println(" ");
        Arrays.sort(empl,new SortedBySurname());
        for(Employee i:empl) {
            i.show();
        }
        System.out.println(" ");
        Arrays.sort(empl, new SortedByName());
        for (Employee i:empl){
            i.show();
        }
        System.out.println(" ");
        Arrays.sort(empl,new SortedBySalary());

        for (Employee i : empl) {
            i.show();
    }
	System.out.println(" ");
        Arrays.sort(empl,new SortedBySur_name());

        for (Employee i : empl) {
            i.show();
    }
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

    static class SortedByInn implements Comparator<Employee> {

        public int compare(Employee o1, Employee o2) {

            double inn1 = o1.getInn();
            double inn2 = o2.getInn();

            if (inn1 > inn2) {
                return 1;
            } else if (inn1 < inn2) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    static class SortedByName implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            String str1 = o1.getName();
            String str2 = o2.getName();

            return str1.compareTo(str2);
        }

    }

    static class SortedBySurname implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            String str1 = o1.getSurname();
            String str2 = o2.getSurname();

            return str1.compareTo(str2);
        }

    }
static class SortedBySur_name implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2) {
        String str3 = o1.getSurname();
        String str4 = o2.getSurname();
        int result = str3.compareTo(str4);
        if (result == 0)
            return o1.getName().compareTo(o2.getName());
        return result;
    }

}
   
   static class SortedBySalary implements Comparator<Employee> {

        public int compare(Employee o1, Employee o2) {

            double zp1 = o1.getSalary();
            double zp2 = o2.getSalary();

            if (zp1 > zp2) {
                return 1;
            } else if (zp1 < zp2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}


