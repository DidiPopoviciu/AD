package lab2.Ch2redo;

import java.util.Arrays;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }

    @Override
    public String toString() {
        return "Film{" +
                "anAparitie=" + anAparitie +
                ", nume='" + nume + '\'' +
                ", actori=" + Arrays.toString(actori) +
                '}';
    }


    public Actor getActorByName(String name)
    {
        for(Actor actor: this.actori){
            if (actor != null && actor.getNume().equals(name)){
                return actor;
            }
        }
        return null;
    }

    public boolean hasActorsAboveAge(int age)
    {
        for(Actor actor: this.actori){
            if (actor != null && actor.getVarsta() > age){
                return true;
            }
        }
        return false;
    }
}
