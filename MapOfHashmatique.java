import java.util.HashMap;
import java.util.Set;



public class MapOfHashmatique {
    public static void main (String [] args){

        HashMap <String, String> Songs= new HashMap<String, String>();

        Songs.put("SongBird","This is a sample lyric for SongBird");
        Songs.put("Acquiese","This is a sample lyric for Acquiese");
        Songs.put("Slide Away","This is a sample lyric for Slide Away");
        Songs.put("Some Might Say","This is a sample lyric for Some Might Say");


        String song= Songs.get("Acquiese");
        System.out.println("The song name is:"+song);

        Set<String> tracks=Songs.keySet();
        for (String track :tracks){
            System.out.println(track);
            System.out.println(Songs.get(track));

        }

    }
    
}
