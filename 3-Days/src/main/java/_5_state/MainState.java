package _5_state;

import java.util.List;

public class MainState {
    public static void main(String[] args) {

        XmlEngine xmlEngine = new XmlEngine();
        List<Currency> ls = xmlEngine.xmlCall();
        ls = xmlEngine.xmlCall();
        ls = xmlEngine.xmlCall();
        ls = xmlEngine.xmlCall();
        ls = xmlEngine.xmlCall();
        ls = xmlEngine.xmlCall();
        ls = xmlEngine.xmlCall();

        System.out.println( ls.get(0).getForexSelling() );

    }
}
