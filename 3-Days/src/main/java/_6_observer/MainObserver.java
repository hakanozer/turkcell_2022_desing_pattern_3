package _6_observer;

public class MainObserver {
    public static void main(String[] args) {

        Person p1 = new Person("Erkan Bilsin", "erkan@mail.com");
        Person p2 = new Person("Serkan Bil", "serkan@mail.com");
        Person p3 = new Person("Zehra Bilki", "zehra@mail.com");

        NewsA newsA = new NewsA();

        newsA.addPerson(p1);
        newsA.addPerson(p2);
        newsA.addPerson(p3);
        newsA.sendNews();

        System.out.println("===================");
        //newsA.removePerson(p2);
        p2.remove(newsA);
        newsA.sendNews();

        System.out.println("---------------------");
        NewsB newsB = new NewsB();
        newsB.addPerson(p1);
        newsB.addPerson(p2);
        newsB.sendNews();

    }
}
