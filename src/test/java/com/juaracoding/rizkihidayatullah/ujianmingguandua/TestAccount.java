package com.juaracoding.rizkihidayatullah.ujianmingguandua;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestAccount {


    public class TestAmount {
        Account account;
        Amount amount;

        int a;
        String n;
        double amt;

        @BeforeMethod
        public void setUp() {
            account = new Account();
            amount = new Amount();
        }

        @Test
        public void testAmountwithdraw() {
            account.name = "rizki hidayatullah";
            account.acc_no = 121331323;
            account.amount = 500000000;
            account.withdraw(50000);
        }

        @Test
        @Parameters({"amt", "amount"})
        public void testDeposit(double amt, double amount) {
            account.deposit(amount + amt);
            Assert.assertEquals(amt, 100000.0);
            Assert.assertEquals(amount, 100000.0);
        }

        @Test
        public void Insert() {
            account.name = "rizki hidayatullah";
            account.acc_no = 121331323;
            account.amount = 500000000;
            account.display();
        }

        @Test
        @Parameters({"amount", "amt"})
        public void testCheckBalance(double amount, double amt) {

            double hasil = amount +amt;
            account.checkBalance(hasil);
            Assert.assertEquals(hasil, 2000.0);
        }

        @Test
        @Parameters
        public void Asserttrue(String text) {
            String actual = "Input Data Berhasil";
            String expect = "Input Data Berhasil";
            Assert.assertTrue(actual.equals(expect));
        }
    }
}
