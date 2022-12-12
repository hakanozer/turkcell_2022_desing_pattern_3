package _3_abstrack_factory;

import java.util.List;

public class WordFabric implements IFabric {

    @Override
    public void create(EPrint ePrint, List<String> ls) {
        switch (ePrint) {
            case wordA:
                WordA wordA = new WordA();
                wordA.print(ls);
                break;
            case wordB:
                WordB wordB = new WordB();
                wordB.print(ls);
                break;
            default:
                System.out.println("Word Empty");
        }
    }

}
