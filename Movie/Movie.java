public class Movie {
    private String title, director;

    private int releaseYear, duration;

    private double rating;

    public Movie(){};

    public Movie(String title, String director, int releaseYear, int duration, double rating){
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rating = rating;
    }

    // methods that allow you to retrieve
    public String getTitle(){
        return title;
    }

    // method to set the value of the title field
    public void setTitle(){
        this.title = title;
    }

    // method that allows you to retrieve director
    public String getDirector(){
        return director;
    }

    // method to set director
    public void setDirector(){
        this.director = director;
    }

    // method to retrieve the release year of a movie
    public int getReleaseYear(){
        return releaseYear;
    }

    // method to set Release Year of movies
    public void setReleaseYear(){
        this.releaseYear = releaseYear;
    }

    // method to get duration of movie
    public int getDuration(){
        return duration;
    }

    // method to set duration of movie
    public void setDuration(){
        this.duration = duration;
    }

    // method to get ratings of movie
    public double getRating(){
        return rating;
    }

    // method to set rating of movie
    public void setRating(){
        this.rating = rating;
    }

    // method to check if movie is a Long movie
    public boolean isLongMovie(){
        return this.duration > 120;
    }

    // method to check if movie is highly rated
    public boolean isHighlyRated(){
        return this.rating > 4.0;
    }
    public static void main(String[] args){

        Movie movie1 = new Movie("The Last of Us", "Greg Spence", 2023, 300, 9.5);
        Movie movie2 = new Movie("Snowfall", " Nicolas Stern, Karen Mayeda Vranek, Evan Silverberg", 2023, 200, 7.5);
        Movie movie3 = new Movie("Mac & Devin Go to High School", "Dylan C. Brown", 2012, 75, 4.3);

        // retrieving and displays all the fields of movie1
        System.out.println("Title of Movie: " + movie1.getTitle());
        System.out.println("Movie Director: " + movie1.getDirector());
        System.out.println("Release Year: " + movie1.getReleaseYear());
        System.out.println("Duration: " + movie1.getDuration());
        System.out.println("Rating: " + movie1.getRating());
        System.out.println("Is movie long: " + movie1.isLongMovie());
        System.out.println("Is movie highly rated: " + movie1.isHighlyRated());

        // retrieving and displays all the fields of movie2
        System.out.println("Title of Movie: " + movie2.getTitle());
        System.out.println("Movie Director: " + movie2.getDirector());
        System.out.println("Release Year: " + movie2.getReleaseYear());
        System.out.println("Duration: " + movie2.getDuration());
        System.out.println("Rating: " + movie2.getRating());
        System.out.println("Is movie long: " + movie2.isLongMovie());
        System.out.println("Is movie highly rated: " + movie2.isHighlyRated());

        // retrieving and displays all the fields of movie3
        System.out.println("Title of Movie: " + movie3.getTitle());
        System.out.println("Movie Director: " + movie3.getDirector());
        System.out.println("Release Year: " + movie3.getReleaseYear());
        System.out.println("Duration: " + movie3.getDuration());
        System.out.println("Rating: " + movie3.getRating());
        System.out.println("Is movie long: " + movie3.isLongMovie());
        System.out.println("Is movie highly rated: " + movie3.isHighlyRated());

    }
}
