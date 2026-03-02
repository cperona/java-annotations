package n1;

public class OnSiteEmployee extends Employee{
    private static int oil;

    public OnSiteEmployee(String name, String surname, int pricePerHour, int oil) {
        super(name, surname, pricePerHour);
        this.oil = oil;
    }

    @Override
    public int calculateSalary(int numHoursWorked) {
        return numHoursWorked*super.getPricePerHour()+oil;
    }
}
