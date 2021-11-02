package day02;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int creationYear;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int premierYear) {
        this.title = title;
        this.creationYear = premierYear;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public int actorsInTheirTwenties(){
        int c=0;
        for (Actor a :
                actors) {
            if(creationYear-a.getYear()>19&&creationYear-a.getYear()<30){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Actor actor = new Actor("Jakab",1970);
        Actor actor1 = new Actor("Jakab",1972);
        Actor actor2 = new Actor("Jakab",1980);
        Actor actor3 = new Actor("Jakab",1990);
        Movie movie = new Movie("Test",2000);
        movie.addActor(actor);
        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);
        System.out.println(movie.actorsInTheirTwenties());
    }
}
