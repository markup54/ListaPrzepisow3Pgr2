package com.example.ksiazkakucharska;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    public static final Przepis[] przepisy = {
      new Przepis("mufinki",3,"mąka, cukier, mleko, kakao",R.drawable.muf),
      new Przepis("pierniczki",3,"mąka, cukier, mleko, kakao, miód",R.drawable.pierniczki),
      new Przepis("ptyś",3,"mąka, cukier, mleko, kakao, śmietana",R.drawable.ptys),
      new Przepis("gofry",2,"mąka, cukier, mleko, jajko",R.drawable.gofr),
      new Przepis("lody",2," cukier, śmietana, jajko",R.drawable.lody),
    };
    public static ArrayList<Przepis> wybierzPrzepisy (int kategoria){
        ArrayList<Przepis> wybrane = new ArrayList<>();
        for (Przepis przepis:przepisy){
            if(przepis.getKateoria() == kategoria){
                wybrane.add(przepis);
            }
        }

        return wybrane;
    }
}
