/*
 * Chapter 6  Generic Programming
 * Sec 4  Type Variance and Wildcards
 *
 */
package impatient.ch06.sec04;

/**
 *
 * @author emaphis
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
