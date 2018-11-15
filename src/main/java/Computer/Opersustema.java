package Computer;

public abstract class Opersustema {
    private String nazva;
    public Opersustema(String nazva){this.nazva=nazva;}

    public String getNazva() {
        return nazva;
    }

    public void setNazva(String nazva) {
        this.nazva = nazva;
    }
}
