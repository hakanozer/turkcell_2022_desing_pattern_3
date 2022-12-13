package _2_objectpool;

import org.jsoup.Jsoup;

import java.util.ArrayList;
import java.util.List;

public class ServicePool {

    private static List<String> list = new ArrayList<>();

    public ServicePool() {
        long start = System.currentTimeMillis();
        init();
        long end = System.currentTimeMillis();
        long bettween = end - start;
        System.out.println("Service : " + bettween);
    }

    private void init() {
        String[] urls = {
        "https://dummyjson.com/products",
        "https://dummyjson.com/carts",
        "https://dummyjson.com/users"
        };
        if ( list.size() < urls.length + 1 ) {
            for (String url : urls) {
                try {
                    String data = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().body().text();
                    list.add(data);
                }catch (Exception ex) {
                    System.err.println("Servis Error : " + ex);
                }
            }
        }
    }


    public static String get(int index) {
        if ( index < list.size() ) {
            return list.get(index);
        }
        return "Empty!";
    }

}
