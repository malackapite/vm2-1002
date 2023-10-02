package proba;

import java.util.Scanner;

public class Pakli {

    Scanner sc = new Scanner(System.in);

    String[] ertekek = {"VII", "IIX", "IX", "X", "XI", "XII"};
    String[] mintak = {"T", "SZ", "M", "L"};
    Lap[] lapok = new Lap[22];

    Pakli() {
        int db = 1;
        for (String minta : mintak) {
            for (int ix = 0; ix < ertekek.length && db <= 21; ix++) {
                lapok[db++] = new Lap(ertekek[ix] + "_" + minta);
            }
        }
        jatek();
    }

    private void kiIr() {
        System.out.println("");
        for (int ix = 1; ix < lapok.length; ix++) {
            System.out.print("%-8s".formatted(lapok[ix]));
            if (ix % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println("");
    }

    private void jatek() {
        for (int ix = 0; ix < 3; ix++) {
            kiIr();
            kever(melyik());
        }
        System.out.println("ez volt: " + ezVolt());
    }

    private int melyik() {
        System.out.print("Válasz oszlopot: ");
        int szam = sc.nextInt();
        while (szam > 3 || szam < 1) {
            System.out.print("Nem jó! Egytől háromig adj meg egy számot: ");
            szam = sc.nextInt();
        }
        return szam;
    }

    private void kever(int melyik) {
        Lap[] tmp = new Lap[22];

        switch (melyik) {
            case 1:
                for (int ix = 1; ix <= 7; ix++) {
                    tmp[ix] = lapok[20 - (ix - 1) * 3];
                    tmp[ix + 7] = lapok[19 - (ix - 1) * 3];
                    tmp[ix + 14] = lapok[21 - (ix - 1) * 3];
                }
                break;
            case 2:
                for (int ix = 1; ix <= 7; ix++) {
                    tmp[ix] = lapok[19 - (ix - 1) * 3];
                    tmp[ix + 7] = lapok[20 - (ix - 1) * 3];
                    tmp[ix + 14] = lapok[21 - (ix - 1) * 3];
                }
                break;
            case 3:
                for (int ix = 1; ix <= 7; ix++) {
                    tmp[ix] = lapok[19 - (ix - 1) * 3];
                    tmp[ix + 7] = lapok[21 - (ix - 1) * 3];
                    tmp[ix + 14] = lapok[20 - (ix - 1) * 3];
                }
                break;
            default:
                throw new AssertionError();
        }

        lapok = tmp;
    }

    private Lap ezVolt() {
        return lapok[11];
    }
}
