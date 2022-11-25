package com.juaracoding.rizkihidayatullah.ujianmingguandua;

public class Amount {
    double CheckBalance(Account account) {
        double resultCheckBalance = 0;

        if ( account.amount > 50000){
            double resultWitdraw = account.amount;
            resultCheckBalance = resultWitdraw;

        }else{
            resultCheckBalance = account.amount;

        }
        return resultCheckBalance;

    }
}
