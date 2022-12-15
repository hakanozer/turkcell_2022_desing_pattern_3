package _6_observer;

public class Person implements IPerson{

    private String name;
    private String email;

    public Person( String name, String email ) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void remove(INews iNews) {
        iNews.removePerson(this);
    }

    @Override
    public void sendNews(INews iNews) {
        System.out.println( iNews.toString() +" Push News:" + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
