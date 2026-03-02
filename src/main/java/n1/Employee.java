package n1;

public abstract class Employee {
    private String name;
    private String surname;
    private int pricePerHour;

    public Employee(String name, String surname, int pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public int calculateSalary(int numHoursWorked) {
        return numHoursWorked*this.pricePerHour;
    }
}
