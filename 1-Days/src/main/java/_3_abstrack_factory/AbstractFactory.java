package _3_abstrack_factory;

import java.util.List;

public class AbstractFactory {

    EPrint ePrint;
    List<String> ls;
    IFabric fabric;
    public AbstractFactory(EPrint ePrint, List<String> ls) {
        this.ePrint = ePrint;
        this.ls = ls;
    }

    public void action() {
        if ( ePrint == EPrint.pdfA || ePrint == EPrint.pdfB ) {
            fabric = new PdfFabric();
        }
        if ( ePrint == EPrint.wordA || ePrint == EPrint.wordB ) {
            fabric = new WordFabric();
        }
        fabric.create(ePrint, ls);
    }



}
