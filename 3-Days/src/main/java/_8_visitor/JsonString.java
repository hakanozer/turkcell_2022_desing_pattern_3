package _8_visitor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonString implements IExportVisitor {

    @Override
    public void accept(Object obj) {
        if ( obj instanceof Customer ) {
            Customer customer = (Customer) obj;
            ObjectMapper mapper = new ObjectMapper();
            try {
                String st = mapper.writeValueAsString(customer);
                System.out.println(st);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }

}
