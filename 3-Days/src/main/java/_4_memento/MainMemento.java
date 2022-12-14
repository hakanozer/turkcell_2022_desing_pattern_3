package _4_memento;

public class MainMemento {

    public static void main(String[] args) throws ClassNotFoundException {

        AddressMemento memento = new AddressMemento();

        IAddress ad1 = new Address();
        ad1.addressLines("İstanbul", "Beşiktaş", "No: 2");
        memento.save(ad1);

        IAddress ad2 = new Address();
        ad2.addressLines("Ankara", "Yeni Mah", "No: 5", "Benziklik Yanı");
        memento.save(ad2);

        IAddress ad3 = new Address();
        ad3.addressLines("Adana", "Eski Mah");
        memento.save(ad3);

        IAddress endAddress = memento.version(2);
        endAddress.addressReport();

        endAddress = memento.version(1);
        endAddress.addressReport();


    }

}
