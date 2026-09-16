import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet(String title, double duration, Director director,
                  ArrayList<Actor> listOfActors, Person musicAuthor, Person choreographer, String librettoText) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

}
