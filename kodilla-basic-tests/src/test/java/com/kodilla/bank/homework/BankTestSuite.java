package com.kodilla.bank.homework;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class BankTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(300);
        cashMachine.add(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(300, transactions[0]);
        assertEquals(-100, transactions[1]);
    }

    @Test
    public void averageShouldBeZeroIfThereIsNoTransaction() {
        Bank bank = new Bank();
        assertEquals(0, bank.getTotalAverageOfIncomes(), 0.001);
    }

    @Test
    public void shouldCalculateNumberOfIncomes() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(300);
        cashMachine.add(-200);
        assertEquals(2, cashMachine.getNumberOfIncomes());
    }
}