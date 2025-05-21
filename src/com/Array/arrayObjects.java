package com.Array;
 //implementing array object concepts inside inner class
public class arrayObjects {

    private String movieType;

    private class movie {
        private String Title;
        private String director;
        private int releaseYear;
        private int rating;

        movie(String movie, String Title, String director, int releaseYear, int rating) {
            this.Title = Title;
            this.director = director;
            this.releaseYear = releaseYear;
            this.rating = rating;
            movieType = movie;

        }

        void displayInfo() {
            System.out.println("Movie Type: " + movieType);
            System.out.println("Title: " + Title);
            System.out.println("Director: " + director);
            System.out.println("Release Year: " + releaseYear);
            System.out.println("Rating: " + rating);
        }
    }
    public static void main(String[] args) {
        arrayObjects obj = new arrayObjects();

        arrayObjects.movie[] movies = new arrayObjects.movie[3];

        movies[0] = obj.new movie("Action", "Inception", "Nolan", 2010, 9);
        movies[1] = obj.new movie("Drama", "The Pursuit of Happyness", "Muccino", 2006, 8);
        movies[2] = obj.new movie("Sci-Fi", "Interstellar", "Nolan", 2014, 10);

        for(arrayObjects.movie m:movies){
            m.displayInfo();
            System.out.println();
        }
       // arrayObjects.movie movie = obj.new movie("Movie", "Title", "Director", 1995, 5);
        //movie.displayInfo();
    }
}
