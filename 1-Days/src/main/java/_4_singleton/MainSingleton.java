package _4_singleton;

import java.sql.Connection;

public class MainSingleton {
    public static void main(String[] args) {

        DB d1 = DBSingle.singleton();

        Connection c1 = d1.conn();
        System.out.println(c1.hashCode());
        d1.close();

        Connection c2 = d1.conn();
        System.out.println(c2.hashCode());
        d1.close();

        Connection c3 = d1.conn();
        System.out.println(c3.hashCode());
        d1.close();

        Connection c4 = d1.conn();
        System.out.println(c4.hashCode());
        d1.close();

    }
}
