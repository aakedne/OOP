package com.codewithabdi;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);



}
public void setBaseSalary(int baseSalary) throws IllegalAccessException {
    if(baseSalary <=0)
        throw new IllegalAccessException("Salary can not be 0 or less");
    this.baseSalary = baseSalary;

}
private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) throws IllegalAccessException {
        if(hourlyRate <=0)
            throw new IllegalAccessException("HourLY rate cannot be 0 or negative");
        this.hourlyRate = hourlyRate;
    }
}
