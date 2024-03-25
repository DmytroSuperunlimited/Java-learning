package org.example.lessions.lession1;

public class Bank_v2 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static String ownerName = "Ann";
    static double withdrawal = 100;

    public static void bank2(String[] ownerNames, int[] balances, String ownerName, double withdrawal) {
        int ownerNumber = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                ownerNumber = i;
                break;
            }
        }
        double balanse = balances[ownerNumber];
        double comission = withdrawal * 0.05;
        if (balanse - withdrawal - comission > 0) {
            balanse = balanse - withdrawal - comission;
            System.out.println(ownerName + " OK " + comission + " " + balanse);
        } else {
            System.out.println(ownerName + " NO");
        }
    }
    public static void main(String[] args) {
        bank2(ownerNames,balances,ownerName,withdrawal);
    }
}

