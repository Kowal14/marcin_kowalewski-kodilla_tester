package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank() {

        this.cashMachines = new CashMachine[2];
    }

    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public int getTotalNumberOfOutcomes() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getNumberOfOutcomes();
        }
        return sum;
    }

    public int getTotalNumberOfIncomes() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getNumberOfIncomes();
        }
        return sum;
    }

    public double getTotalAverageOfOutcomes() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i].getAverageOfOutcomes() < 0) {
                sum = sum + cashMachines[i].getAverageOfOutcomes();
            }
        }
        return sum / this.getTotalNumberOfOutcomes();
    }

    public double getTotalAverageOfIncomes() {
        double sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachines[i].getAverageOfIncomes() > 0) {
                sum = sum + cashMachines[i].getAverageOfIncomes();
            }
        }
        return sum / this.getTotalNumberOfIncomes();

    }
}

