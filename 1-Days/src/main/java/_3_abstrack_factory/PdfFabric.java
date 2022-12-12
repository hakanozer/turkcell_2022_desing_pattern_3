package _3_abstrack_factory;

import java.util.List;

public class PdfFabric implements IFabric {

    @Override
    public void create(EPrint ePrint, List<String> ls) {
        switch (ePrint) {
            case pdfA:
                PdfA pdfA = new PdfA();
                pdfA.print(ls);
                break;
            case pdfB:
                PdfB pdfB = new PdfB();
                pdfB.print(ls);
                break;
            default:
                System.out.println("PDF Empty");
        }
    }

}
