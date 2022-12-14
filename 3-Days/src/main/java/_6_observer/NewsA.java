package _6_observer;

import java.util.ArrayList;
import java.util.List;

public class NewsA implements INews {

    private List<IPerson> list = new ArrayList<>();

    @Override
    public void addPerson(IPerson iPerson) {
        list.add(iPerson);
    }

    @Override
    public void removePerson(IPerson iPerson) {
        list.remove(iPerson);
    }

    @Override
    public void sendNews() {
        for ( IPerson person : list ) {
            person.sendNews();
        }
    }

}
