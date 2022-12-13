package _5_facade;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Jsoup;

import java.util.HashMap;
import java.util.Map;

public class OrderControl {

    public boolean order(String userID, String productID) {
        boolean status = false;
        try {
            String url = "https://www.jsonbulut.com/json/orderForm.php";
            Map<String, String> hm = new HashMap<>();
            hm.put("ref", "d1becef32825e5c8b0fc1b096230400b");
            hm.put("customerId", userID);
            hm.put("productId", productID);
            hm.put("html", productID);
            String data = Jsoup.connect(url).data(hm).ignoreContentType(true).timeout(15000).get().body().text();

            Gson gson = new Gson();
            JsonObject obj = gson.fromJson(data, JsonObject.class);
            status = obj.getAsJsonArray("order").get(0).getAsJsonObject().get("durum").getAsBoolean();
        }catch (Exception ex) {
            System.err.println("Order Error :" + ex);
        }
        return status;
    }
}
