package day31;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
  public   String country,title,genre,releaseDay,director;
  public ArrayList<String> casts=new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDay, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDay = releaseDay;
        this.director = director;

    }
    public void addCast(String cast){
        casts.add(String.valueOf(cast));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDay='" + releaseDay + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }

    public void addCasts(String[] cast){
        casts.addAll(Arrays.asList(cast));

    }
}
