package proba;

public class Pakli {
    String[] ertekek={"VII","IIX","IX","X","XI","XII"};
    String[] mintak={"T", "SZ", "M", "L"};
    Lap[] lapok=new Lap[22];
    
    Pakli(){
        for (String minta : mintak) {
            int db=1;
            for (int ix=1;ix<ertekek.length&&db<=21;ix++) {
                lapok[db++]=new Lap(ertekek[ix]+"_"+minta);
            }
        }
        jatek();
    }
    
    private void kiIr(){
        for (int ix = 0; ix < lapok.length; ix+=2) {
            
        }
    }
    
    private void jatek(){
        
    }
}
