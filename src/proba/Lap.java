package proba;

public class Lap {
    
    String ertek;
    
    public Lap(String ertek) {
        this.ertek=ertek;
    }
    
    public String getLap(){
        return ertek;
    }

    @Override
    public String toString() {
        return ertek;
    }
}
