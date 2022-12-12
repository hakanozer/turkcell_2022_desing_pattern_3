package _3_abstrack_factory;

import java.util.List;

public class PdfA implements IPrint{

    @Override
    public void print(List<String> rows) {
        for( String row : rows ) {
            System.out.println("PdfA :" + row);
        }
    }

}
