package _5_state;

import java.util.ArrayList;
import java.util.List;

public class XmlEngine implements IState {

    private Xml xml = new Xml();
    private List<Currency> ls;
    public XmlEngine() {
        ls = xml.currencies();
    }

    @Override
    public List<Currency> xmlCall() {
        return ls;
    }

}
