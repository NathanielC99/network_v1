import java.util.ArrayList;
/**
 * Write a description of class Post here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Post
{
    // instance variables - replace the example below with your own
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class Post
     */
    public Post(String author)
    {
        username = author;
        timestamp = System.currentTimeMillis();
        likes=0;
        comments = new ArrayList<>();
    }
}
