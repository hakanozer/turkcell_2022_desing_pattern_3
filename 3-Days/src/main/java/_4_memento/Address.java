package _4_memento;

public class Address implements IAddress{

    private StringBuilder sb = new StringBuilder();

    @Override
    public void addressLines(String... lines) {
        for( String line : lines ) {
            sb.append(line);
            sb.append(" ,");
        }
    }

    @Override
    public void addressReport() {
        System.out.println( sb.toString() );
    }


}
