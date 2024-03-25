package org.example.lessions.lession1;

public class BankRefill {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static String ownerName = "Ann";
    static double withdrawal = 100;

    public static void bankRefill(String[] ownerNames, int[] balances, String ownerName, double withdrawal) {
        int ownerNumber = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                ownerNumber = i;
                break;
            }
        }
        double balanse = balances[ownerNumber];
        balanse = balanse + withdrawal;
        balances[ownerNumber] = (int) balanse;
        System.out.println(ownerName + " " + balanse);
    }

    public static void main(String[] args) {
        bankRefill(ownerNames,balances,ownerName,withdrawal);
    }
}

