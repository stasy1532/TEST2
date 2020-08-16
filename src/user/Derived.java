package user;

public class Derived extends User {

    public double salary;
    public int years;

    public Derived(String email, String password, int years, double salary) {
        super(email, password);
        this.years = years;
        this.salary = salary;
    }

    public double getSalary () {
        return this.salary;
    }
    public void salaryUp() {
        if(this.years < 2) {
            this.salary = this.salary*0.05+this.salary;
        }else if(this.years >5) {
            this.salary = this.salary*0.15+this.salary;
        }else {
            this.salary = this.salary*0.10+this.salary;
        }
    }


}
