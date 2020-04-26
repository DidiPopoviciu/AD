package lab2.Ch2;

import java.util.Arrays;

public class Actor {
    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", premii=" + Arrays.toString(premii) +
                '}';
    }
}
