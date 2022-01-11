package day31;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "Silicon Valley", "Comedy", "April 6,2014 – December 8,2019", "John Altschuler - Mike Judge - Dave Krinsky");
        movie1.addCast("Thomas Middleditch");
        String[] casts = {"T.J. Miller", "Josh Brener", "Martin Starr", "Kumail Nanjiani", "Christopher Evan Welch", "Amanda Crew"};
        movie1.addCasts(casts);
        System.out.println(movie1);
    }
}
