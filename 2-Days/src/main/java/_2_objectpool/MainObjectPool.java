package _2_objectpool;

import com.google.gson.Gson;

public class MainObjectPool {

    public static void main(String[] args) throws Exception {

        ServicePool pool = new ServicePool();

        Gson gson = new Gson();
        ProductData productData = gson.fromJson(ServicePool.get(0), ProductData.class);
        for( Product item : productData.getProducts() ) {
            System.out.println( item.getTitle() );
        }

    }

}
