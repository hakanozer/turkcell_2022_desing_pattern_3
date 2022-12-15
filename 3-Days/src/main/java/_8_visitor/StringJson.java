package _8_visitor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringJson implements IExportVisitor{

    @Override
    public void accept( Object obj ) {
        if ( obj instanceof String ) {
            String stData = (String) obj;
            ObjectMapper mapper = new ObjectMapper();
            Customer customer = null;
            try {
                customer = mapper.readValue(stData, Customer.class);
                System.out.println( customer.getEmail() );
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

        }
    }

}
