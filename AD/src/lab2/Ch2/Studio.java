package lab2.Ch2;

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

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    public boolean hasActor(String actorName){
        Actor currentActor;
        Film currentFilm;
        int filmIndex, actorIndex;
        for (filmIndex=0; filmIndex< this.getFilme().length; filmIndex++){
            currentFilm = this.filme[filmIndex];
            for (actorIndex = 0; actorIndex < currentFilm.getActori().length; actorIndex++){
                currentActor = currentFilm.getActori()[actorIndex];
                if (currentActor.getNume() == actorName){
                    return true;
                }
            }
        }
        return false;
    }

    public List<String> getMoviesForActorMinimumAge(Integer minimumActorAge) {
        List<String> movies = new ArrayList<>();
        Actor currentActor;
        Film currentFilm;
        int filmIndex, actorIndex;
        for (filmIndex=0; filmIndex< this.getFilme().length; filmIndex++){
            currentFilm = this.filme[filmIndex];
            for (actorIndex = 0; actorIndex < currentFilm.getActori().length; actorIndex++){
                currentActor = currentFilm.getActori()[actorIndex];
                if (currentActor.getVarsta() > minimumActorAge){
                    movies.add(currentFilm.getNume());
                    break;
                }
            }
        }
        return movies;
    }
    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", filme=" + Arrays.toString(filme) +
                '}';
    }

    public int getNumberOfMovies(){
        return this.filme.length;
    }
}
