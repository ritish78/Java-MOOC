
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nickname = new HashMap<>();
        nickname.put("matt", "matthew");
        nickname.put("mix", "michael");
        nickname.put("artie", "arthur");
        System.out.println(nickname.get("matt"));
    }

}
