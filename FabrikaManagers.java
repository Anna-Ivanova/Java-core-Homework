public class FabrikaManagers extends Employee {

    private double bonus = 500;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " Manager [bonus=" + bonus + "]";
    }

    public FabrikaManagers(long inn, String surname, String name, double salary) {
        super(inn, surname, name, salary);
    }
}
