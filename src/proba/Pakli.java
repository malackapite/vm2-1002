package proba;

import java.util.Scanner;

public class Pakli {
    Scanner sc = new Scanner(System.in);
    
    String[] ertekek={"VII","IIX","IX","X","XI","XII"};
    String[] mintak={"T", "SZ", "M", "L"};
    Lap[] lapok=new Lap[22];
    
    Pakli(){
        int db=1;
        for (String minta : mintak) {
            for (int ix=1;ix<ertekek.length&&db<=21;ix++) {
                lapok[db++]=new Lap(ertekek[ix]+"_"+minta);
            }
        }
        jatek();
    }
    
    private void kiIr(){
        for (int ix = 1; ix < lapok.length; ix++) {
            System.out.print("%-8s".formatted(lapok[ix]));
            if(ix%3==0)
                System.out.println();
        }
        System.out.println("");
    }
    
    private void jatek(){
        for (int ix = 0; ix < 3; ix++) {
            kiIr();
        }
    }
    
    private int melyik(){
        int szam= sc.nextInt();
        while (szam>3&&szam<1) {            
            szam= sc.nextInt();
        }
        return szam;
    }
    
    private void kever(int melyik){
        Lap[] tmp = lapok;
        switch (melyik) {
            case 1:
                for (int ix = 0; ix <= 7; ix++) {
                    
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
