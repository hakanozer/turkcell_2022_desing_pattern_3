package _5_facade;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Jsoup;

import java.util.HashMap;
import java.util.Map;

public class UserControl {

    public String userID ( String email, String password ) {
        String userID = "";
        try {
            String url = "https://www.jsonbulut.com/json/userLogin.php";
            Map<String, String> hm = new HashMap<>();
            hm.put("ref", "d1becef32825e5c8b0fc1b096230400b");
            hm.put("userEmail", email);
            hm.put("userPass", password);
            hm.put("face", "no");
            String data = Jsoup.connect(url).data(hm).ignoreContentType(true).timeout(15000).get().body().text();

            Gson gson = new Gson();
            JsonObject obj = gson.fromJson(data, JsonObject.class);
            boolean status = obj.getAsJsonArray("user").get(0).getAsJsonObject().get("durum").getAsBoolean();
            if (status) {
                userID =  obj.getAsJsonArray("user").get(0).getAsJsonObject().get("bilgiler").getAsJsonObject().get("userId").getAsString();
            }
        }catch (Exception ex) {
            System.err.println("userID Error :" + ex);
        }
        return userID;
    }

}
