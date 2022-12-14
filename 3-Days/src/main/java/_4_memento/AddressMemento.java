package _4_memento;

import java.util.HashSet;
import java.util.Set;

public class AddressMemento {

    private Set<IAddress> set = new HashSet<>();

    public void save( IAddress  iAddress ) {
        set.add(iAddress);
    }

    public IAddress version( int index ) throws ClassNotFoundException {
        if ( set.size() > index ) {
            IAddress[] addresses = set.toArray(new IAddress[set.size()]);
            return addresses[index];
        }else {
            throw new ClassNotFoundException("Class Not Found");
        }
    }

    public IAddress undo() throws ClassNotFoundException {
        if ( set.size() > 0 ) {
            int index = set.size() - 1;
            IAddress[] addresses = set.toArray(new IAddress[set.size()]);
            //set.remove(addresses[index]);
            return addresses[index];
        }else {
            throw new ClassNotFoundException("Class Not Found");
        }
    }


}
