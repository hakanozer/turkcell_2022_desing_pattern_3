package _3_abstrack_factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAbstractFactory {
    public static void main(String[] args) {

        List<String> ls = Arrays.asList("32", "56", "5");
        AbstractFactory factory = new AbstractFactory(EPrint.wordB, ls);
        factory.action();

    }
}
