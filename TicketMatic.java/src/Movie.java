public class Movie 
{
    public String name;
    public String genre;
    public Double duration;

    public Movie generate_movie1() 
    {
        //Generates the movie1
        this.name = "The Batman";
        this.duration = 2.56;
        this.genre = "superhero";
        return this;
    }
    public Movie generate_movie2()
    {
        //Generates the movie2
        this.name = "Spider-Man 2";
        this.duration = 2.07;
        this.genre = "superhero";
        return this;
    }
}
