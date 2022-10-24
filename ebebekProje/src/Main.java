public class Main {
    public static void main(String[] args) {

        Employee e1= new Employee("Ahmet Koç",1500,48,2009);
        e1.toString();

    }
}
class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        double tax = 0.0;
        if (this.salary < 1000) {
            System.out.println("Vergi ödemesi bulunmamaktadır.");
        } else {
            tax = (this.salary) * 0.03;
        }
        return tax;
    }

    int bonus() {
        int bonus = 0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        } else {
            System.out.println("Bonus ödemesi bulunmamaktadır. !");
        }
        return bonus;
    }

    double raiseSalary() {
        double year = 0.0;
        if ((2021 - this.hireYear) < 10) {
            year = this.salary * 0.05;
        } else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
            year = this.salary * 0.1;
        } else {
            year = this.salary * 0.15;
        }
        return year;
    }

    public String toString() {

        double toplam = this.salary + bonus() - tax();
        double total = this.salary - tax() + bonus() + raiseSalary();

        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + toplam);
        System.out.println("Toplam Maaş: " + total);

        return null;
    }

}