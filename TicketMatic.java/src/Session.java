import java.time.LocalTime;

public class Session 
{
    public int number;
    public char subtitle; // Y = yes | N = no
    public LocalTime time;
    public Movie movie;
    public Hall hall;

    public Session generate_session1()
    {
        Session session1 = new Session();
        session1.number = 1;
        session1.subtitle = 'N';
        session1.time = LocalTime.of(19, 0);

        Movie movie1 = new Movie().generate_movie1();
        session1.movie = movie1;

        Hall hall1 = new Hall().generate_hall1();
        session1.hall = hall1;
        return session1;
    }
    public Session generate_session2()
    {
        Session session2 = new Session();
        session2.number = 2;
        session2.subtitle = 'Y';
        session2.time = LocalTime.of(23, 0);

        Movie movie2 = new Movie().generate_movie1();
        session2.movie = movie2;

        Hall hall1 = new Hall().generate_hall1();
        session2.hall = hall1;
        return session2;
    }
    public Session generate_session3()
    {
        Session session3 = new Session();
        session3.number = 3;
        session3.subtitle = 'N';
        session3.time = LocalTime.of(19, 0);

        Movie movie3 = new Movie().generate_movie1();
        session3.movie = movie3;

        Hall hall2 = new Hall().generate_hall2();
        session3.hall = hall2;
        return session3;
    }
    public Session generate_session4()
    {
        Session session4 = new Session();
        session4.number = 4;
        session4.subtitle = 'Y';
        session4.time = LocalTime.of(23, 0);

        Movie movie4 = new Movie().generate_movie1();
        session4.movie = movie4;

        Hall hall2 = new Hall().generate_hall2();
        session4.hall = hall2;
        return session4;
    }
    public Session generate_session5()
    {
        Session session5 = new Session();
        session5.number = 5;
        session5.subtitle = 'N';
        session5.time = LocalTime.of(19, 0);

        Movie movie2 = new Movie().generate_movie2();
        session5.movie = movie2;

        Hall hall3 = new Hall().generate_hall3();
        session5.hall = hall3;
        return session5;
    }
    public Session generate_session6()
    {
        Session session6 = new Session();
        session6.number = 6;
        session6.subtitle = 'Y';
        session6.time = LocalTime.of(23, 0);

        Movie movie2 = new Movie().generate_movie2();
        session6.movie = movie2;

        Hall hall3 = new Hall().generate_hall3();
        session6.hall = hall3;
        return session6;
    }
    public Session generate_session7()
    {
        Session session7 = new Session();
        session7.number = 7;
        session7.subtitle = 'N';
        session7.time = LocalTime.of(19, 0);

        Movie movie2 = new Movie().generate_movie2();
        session7.movie = movie2;

        Hall hall4 = new Hall().generate_hall4();
        session7.hall = hall4;
        return session7;
    }
    public Session generate_session8()
    {
        Session session8 = new Session();
        session8.number = 8;
        session8.subtitle = 'Y';
        session8.time = LocalTime.of(23, 0);

        Movie movie2 = new Movie().generate_movie2();
        session8.movie = movie2;

        Hall hall4 = new Hall().generate_hall4();
        session8.hall = hall4;
        return session8;
    }
}
