package org.example.lessions.lession2.task4;

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;
    public User (String name, int balanse, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balanse;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }
    //Getters
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void sallary(int sallary){
        setBalance(getBalance()+sallary);
    }
    public void withdraw(int summ){
        if (summ<1000) {
            if (getBalance()>summ+summ*0.1) {
                setBalance((int) (getBalance()-(summ+summ*0.1)));
            }
            else {
                System.out.println("Not enough funds");
            }
        }
        else {
            if (getBalance()>summ+summ*0.05) {
                setBalance((int) (getBalance()-(summ+summ*0.1)));
            }
            else {
                System.out.println("Not enough funds");
            }
        }
    }
    public int companyNameLenght() {
        return getCompanyName().length();
    }
    public void increaseEmploymentMonth(int addMonth) {
        setMonthsOfEmployment(getMonthsOfEmployment()+addMonth);
    }
}
