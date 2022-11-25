package com.juaracoding.rizkihidayatullah.ujianmingguandua;

public class NomorSatu {
        public static void main(String[] args) {
            int x = 1;
            for (int i = 9; i >= 0; i--){
                for(int j = x; j <=i; j++) {
                    if(j % 2 == 1){
                        System.out.print(j);
                    } else {
                        System.out.print("_");
                    }
                }
                x++;
                System.out.println();
        }
    }
}
