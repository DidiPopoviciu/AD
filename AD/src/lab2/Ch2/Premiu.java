package lab2.Ch2;

public class Premiu {
    private String nume;
    private Integer an;

    public Premiu(String nume, Integer an){
        this.nume = nume;
        this.an = an;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Premiu{" +
                "nume='" + nume + '\'' +
                ", an=" + an +
                '}';
    }
}
