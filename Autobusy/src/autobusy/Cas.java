package autobusy;

public class Cas {
    private int hodina;
    private int minuty;

    public Cas(int hodina, int minuty) {
        this.hodina = hodina;
        this.minuty = minuty;
    }

    public int getHodina() {
        return hodina;
    }

    public int getMinuty() {
        return minuty;
    }

    @Override
    public String toString() {
        return "Cas{" + "hodina=" + hodina + ", minuty=" + minuty + '}';
    }
    
    public int prevedNaMinuty() {
        return hodina * 60 + minuty;
    }
    
    public int SpocitejRozdilMinuty(Cas cas) {
        int rozdil = this.prevedNaMinuty() - cas.prevedNaMinuty();
        return rozdil >= 0 ? rozdil : - rozdil;
    }
}
