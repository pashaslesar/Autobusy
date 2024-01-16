package autobusy;

public class Spoj {
    private String id;
    private Cas casVyjezdu;
    private Cas casDojezdu;

    public Spoj(String id, Cas casVyjezdu, Cas casDojezdu) {
        this.id = id;
        this.casVyjezdu = casVyjezdu;
        this.casDojezdu = casDojezdu;
    }

    public String getId() {
        return id;
    }

    public Cas getCasVyjezdu() {
        return casVyjezdu;
    }

    public Cas getCasDojezdu() {
        return casDojezdu;
    }

    @Override
    public String toString() {
        return "Spoj{" + "id=" + id + ", casVyjezdu=" + casVyjezdu + ", casDojezdu=" + casDojezdu + '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCasVyjezdu(Cas casVyjezdu) {
        this.casVyjezdu = casVyjezdu;
    }

    public void setCasDojezdu(Cas casDojezdu) {
        this.casDojezdu = casDojezdu;
    }
    
    public int casJizdyMinuty() {
        return casVyjezdu.SpocitejRozdilMinuty(casDojezdu);
    }
}
