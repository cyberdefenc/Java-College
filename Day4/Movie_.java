// P8. Create a class Movie with name, rating, and releaseYear. 
// Create 5 movie objects and display movies released after 2020.

package Day4;

class Movie {
    String name;
    double rating;
    int releaseYear;

    void displayIfRecent() {
        if (releaseYear > 2020) {
            System.out.println("Name: " + name);
            System.out.println("Rating: " + rating);
            System.out.println("Release Year: " + releaseYear);
           
        }
    }
}

public class Movie_ {
    public static void main(String[] args) {
        Movie[] movies = new Movie[5];

        movies[0] = new Movie(); movies[0].name = "RRR"; movies[0].rating = 8.5; movies[0].releaseYear = 2022;
        movies[1] = new Movie(); movies[1].name = "Pathaan"; movies[1].rating = 7.0; movies[1].releaseYear = 2023;
        movies[2] = new Movie(); movies[2].name = "Pushpa"; movies[2].rating = 7.6; movies[2].releaseYear = 2021;
        movies[3] = new Movie(); movies[3].name = "3 Idiots"; movies[3].rating = 9.0; movies[3].releaseYear = 2009;
        movies[4] = new Movie(); movies[4].name = "KGF 2"; movies[4].rating = 8.3; movies[4].releaseYear = 2022;

        System.out.println("Movies Released After 2020:");
        for (Movie m : movies) {
            m.displayIfRecent();
        }
    }
}
