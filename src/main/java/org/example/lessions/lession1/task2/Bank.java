package org.example.lessions.lession1.task2;

public class Bank {
    static double withdrawal = 5;

    public static void bank(double withdrawal) {
        double balanse = 100;
        double comission = withdrawal*0.05;
        if (balanse - withdrawal - comission > 0) {
            balanse = balanse - withdrawal - comission;
            System.out.println("OK " +comission + " " +balanse);
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        bank(withdrawal);
    }
}
