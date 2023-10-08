import java.util.HashMap;
import java.util.Set; // import Set

public class MapTrackList {

	public static void main(String[] args) {
		MapTrackList.trackList();
	}


	public static void trackList() {

		HashMap<String, String> userTrackList = new HashMap<String, String>();

		userTrackList.put("Orelsan - Civilisation", "J'sais pas comment sauver l'monde Et si j'savais j'suis pas sûr qu'j'le ferai ...");
		userTrackList.put("Orelsan - Shonen", "J'ai fait des erreurs et j'en referai, j'espère juste ce sera pas les mêmes ...");
		userTrackList.put("Orelsan - L'Odeur de l'essence", "la nostalgie leur faire miroiter la grandeur d'une France passée qu'ils ont fantasmée ...");
		userTrackList.put("Orelsan - Jour meilleur", "Laisse-moi dire deux-trois conneries, avant que t'en fasses une ...");

		String Track_shonen = userTrackList.get("Orelsan - Shonen");

        System.out.println("\nTrack_shonen : " + Track_shonen + "\n");

		// iteration avec keySet()
		Set<String> keys = userTrackList.keySet();
        for(String key : keys) { 
            System.out.println(key + " : ");  //clé  // pistes
            System.out.println(userTrackList.get(key));  // valeur  // paroles
		}
	}

}