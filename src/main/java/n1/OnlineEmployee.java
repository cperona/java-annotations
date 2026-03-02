package n1;

public class OnlineEmployee extends Employee{

    private int internetBill;

    public OnlineEmployee(String name, String surname, int pricePerHour, int internetBill) {
        super(name, surname, pricePerHour);
        this.internetBill = internetBill;
    }

    @Override
    public int calculateSalary(int numHoursWorked) {
        return numHoursWorked * super.getPricePerHour() + internetBill;
    }
}
