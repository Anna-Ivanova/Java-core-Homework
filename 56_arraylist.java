import java.util.*;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.*;

class 56_arraylist {
    public static void main(String[] args) {

        Employee[] empl = new Employee[10];
        List<Employee> emplist = new ArrayList<>();


        emplist.add(new Employee(12352, "KOMAROVA", "SVETA", 500));
        emplist.add(new Employee(12345, "BRUS", "SERGEY", 1500));
        emplist.add(new Employee(12346, "BRUS", "ANDREY", 1600));
        emplist.add(new Employee(12347, "SVYAZHIN", "GLEB", 3000));
        emplist.add(new Employee(12348, "ZARITSKIY", "OLEG", 1000));
        emplist.add(new FabrikaManagers(12349, "KORNEEV", "ALEXEY", 1200));
        emplist.add(new Employee(12352, "KOMAROVA", "ALLA", 500));
        emplist.add(new Employee(12353, "BOYKO", "VADIM", 2000));
        emplist.add(new Employee(12354, "VASILIEVA", "VIKA", 1500));
        emplist.add(new Employee(12355, "KOSTIN", "LEV", 1000));
        System.out.println("INN   " + " FAMILIYA    " + " IMYA   " + "ZARPLATA   ");

        for (Employee e : emplist) {
            e.show();
        }
        int maxz = maxzp(emplist);
        System.out.println("Mazhor nayden - eto ");
        emplist.get(maxz).show();

        int minz = minzp(emplist);
        System.out.println("Fond zarplaty= " + Sumcount(emplist));

        System.out.println("Bednyazhka nayden - eto ");
        emplist.get(minz).show();
        System.out.println(" ");

Collections.sort(emplist,new SortedByInn());
        for (Employee e : emplist) {
            e.show();
        }
         System.out.println(" ");
        Collections.sort(emplist,new SortedBySur_name());
        for (Employee e : emplist) {
            e.show();
        }
        System.out.println(" ");
        Collections.sort(emplist,new SortedByName());
        for (Employee e : emplist) {
            e.show();
        }
        System.out.println(" ");
        System.out.println(" ");
        Collections.sort(emplist,new SortedBySalary());
        for (Employee e : emplist) {
            e.show();
        }

    }

    public static double Sumcount(List<Employee> empl) {
        double sum = 0;
        for (int i = 0; i < empl.size(); i++) {
            sum += empl.get(i).getSalary();
        }
        return sum;
    }

    public static int maxzp(List<Employee> empl) {
        double max = empl.get(0).getSalary();
        int indexmax = 0;
        for (int i = 1; i < empl.size(); i++) {
            if (empl.get(i).getSalary() > max) {
                max = empl.get(i).getSalary();
                indexmax = i;

            }
        }
            return indexmax;
        }


public static int minzp(List<Employee> empl) {
        int indexmin = 0;
        double min = empl.get(0).getSalary();
        for (int i = 1; i < empl.size(); i++) {
        if (empl.get(i).getSalary() < min) {
        min = empl.get(i).getSalary();
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


