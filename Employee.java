

public class Employee{

    private String name;
    private String surname;
    private double salary;
    private long inn;

    public Employee(long inn, String surname, String name, double salary){
        this.inn = inn;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    public long getInn() {
        return inn;
    }
    public void setInn(long inn){
        this.inn = inn;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void show() {

        System.out.print(getInn()+"   ");
        System.out.print(getSurname()+"   ");
        System.out.print(" "+getName()+ "    ");
        System.out.println(getSalary()+" ");
    }
}