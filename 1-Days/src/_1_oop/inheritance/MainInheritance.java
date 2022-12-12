package _1_oop.inheritance;


import java.util.ArrayList;
import java.util.RandomAccess;

public class MainInheritance {

    public static void main(String[] args) {

        ArrayList<String> ls = new ArrayList<>();
        RandomAccess lsx = new ArrayList<>();

        PDF pdfx = new PDF();
        call(pdfx);

        Base pdf = new PDF();
        Base word = new WORD();
        Base excel = new EXCEL();

        call(pdf);
        call(word);
        call(excel);

    }

    public static void call( Base base ) {
        if (base instanceof PDF) {
            PDF pdf = (PDF) base;
            pdf.action();
        }
        base.print();
    }


}
