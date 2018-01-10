
/**
 * Write a description of class DirectorDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DirectorDriver
{
    public static void main(String[] args) {
        int filmography = 13;
        String name = "Chris";
        
        Director chris = new Director(name, filmography);
        Director steven = new Director(name, filmography);
        
        System.out.println(chris);
        
        changeIt(chris, steven);

        System.out.println(chris);
        System.out.println(steven);
    }
    
    public static void changeIt(Director obj1, Director obj2) {
        obj1.setName("Steven");
        obj1.setFilmography(22);
        
        Director obj3 = new Director("George", 10);
        obj2 = obj3;
        obj2.setFilmography(5);
        
    }
}
