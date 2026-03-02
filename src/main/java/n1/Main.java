package n1;

public class Main {
    public static void main() {
        OnSiteEmployee onSiteEmployee = new OnSiteEmployee("Em1", "Su1", 8, 50);
        System.out.println(onSiteEmployee.calculateSalary(60));

        OnlineEmployee onlineEmployee = new OnlineEmployee("Em2", "Su2", 8, 25);
        System.out.println(onlineEmployee.calculateSalary(60));
    }
}
