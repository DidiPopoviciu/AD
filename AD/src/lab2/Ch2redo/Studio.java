package lab2.Ch2redo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    public int count(){
        int count = 0;
        for (Film film:this.filme){
            if (film!=null){
                count ++;
            }
        }
        return count;
    }


    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", filme=" + Arrays.toString(filme) +
                '}';
    }

    public boolean hasActor(String actorName){
        for (Film currentFilm: this.filme){
            if (currentFilm != null && currentFilm.getActorByName(actorName) != null){
                return true;
            }
        }
        return false;
    }

    public String[] getFilmNameWithActorAboveAge(int age){
        String[] toReturn = new String[10];
        int i =0;
        for (Film film:filme){
            if( film != null && film.hasActorsAboveAge(age)){
                toReturn[i++] = film.getNume();
            }
        }
        return toReturn;
    }
}
