package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }
    public void add (int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }
    public int[] getTransactions() {
        return transactions;
    }


    public int numberOfTransactions() {
        return transactions.length;
    }
    public int getBalance() {
        int sum = 0;
        for( int i = 0; i < transactions.length; i++) {
            sum = sum + transactions[i];
        }
        return sum;
    }
    public int getNumberOfOutcomes() {
        int sum = 0;
        for( int i = 0; i < transactions.length; i++) {
            if( transactions[i] < 0) {
                sum++;
            }
        }
        return sum;
    }
    public int getNumberOfIncomes() {
        int sum = 0;
        for( int i = 0; i < transactions.length; i++) {
            if( transactions[i] > 0) {
                sum++;
            }
        }
        return sum;
    }
    public double getAverageOfOutcomes() {
        double sum = 0;
        for(int i = 0; i < transactions.length; i++) {
            if(transactions[i] < 0) {
                sum = sum + transactions[i];
            }
        }
        return sum / this.getNumberOfOutcomes();
    }
    public double getAverageOfIncomes() {
        double sum = 0;
        for( int i = 0; i < transactions.length; i++) {
            if(transactions[i] > 0) {
                sum = sum + transactions[i];
            }
        }
        return sum / this.getNumberOfIncomes();
    }
}
