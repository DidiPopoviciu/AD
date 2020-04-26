package lab2.Ch2;

import java.util.ArrayList;
import java.util.List;

public class StudioDatabase {
    public static List<String> getStudioWithNumberOfMoviesCriteria(Studio[] database, Integer moviesNumber){
        List<String> studios = new ArrayList<>();
        int i;
        for(i = 0; i < database.length; i ++) {
            if (database[i].getNumberOfMovies() > moviesNumber) {
                studios.add(database[i].getNume());
            }
        }
        return studios;
    }

    public static List<String> getStudiosForActor(Studio[] database, String actorName){
        List<String> studios = new ArrayList<>();
        int i;
        for(i = 0; i < database.length; i ++) {
            if (database[i].hasActor(actorName)) {
                studios.add(database[i].getNume());
            }
        }
        return studios;
    }

    public static List<String> getMoviesForMinimumActorAge(Studio[] database, Integer minimumActorAge) {
        List<String> movies = new ArrayList<>();

        int i;
        for(i = 0; i < database.length; i ++) {
            movies.addAll(database[i].getMoviesForActorMinimumAge(minimumActorAge));
        }
        return movies;

    }
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

//        System.out.println(oscar1990.toString());
//        System.out.println(oscar2000.toString());
//        System.out.println(oscar2010.toString());
//        System.out.println(oscar2018.toString());

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

//        System.out.println(actorOscar1990.toString());
//        System.out.println(actorOscar2010.toString());
//        System.out.println(actorOscar2018.toString());
//        System.out.println(actorFaraPremii01.toString());
//        System.out.println(actorFaraPremii02.toString());
//        System.out.println(actorFaraPremii03.toString());

        Film film1 = new Film(1990,"film cu actori de oscar", new Actor[]{actorOscar1990,
                actorFaraPremii01});
        Film film2 = new Film(2010,"film cu actori fara premii2", new Actor[]{actorFaraPremii01,
                actorFaraPremii02});
        Film film3 = new Film(2010,"film cu actori fara premii3", new Actor[]{actorFaraPremii01,
                actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018,"film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018,
                actorFaraPremii02});
        Film film5 = new Film(2018,"film cu actori fara premii5", new Actor[]{actorFaraPremii02,
                actorFaraPremii03});

//        System.out.println(film1.toString());
//        System.out.println(film2.toString());
//        System.out.println(film3.toString());
//        System.out.println(film4.toString());
//        System.out.println(film5.toString());

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        System.out.println("Studiouri care au publicat mai mult de 2 filme: " +
                String.join(", ", getStudioWithNumberOfMoviesCriteria(studioDatabase, 2)));

        System.out.println("Studiouri pentru actor 'actor cu 2 oscaruri': " +
                String.join(", ", getStudiosForActor(studioDatabase, "actor cu 2 oscaruri")));

//        System.out.println("Studiouri pentru actor 'actor fara oscar 02': " +
//                String.join(", ", getStudiosForActor(studioDatabase, "actor fara oscar 02")));

        System.out.println("File cu actori de peste 50 de ani: " +
                String.join(", ", getMoviesForMinimumActorAge(studioDatabase, 50)));

    }
}
