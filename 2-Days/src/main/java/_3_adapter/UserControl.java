package _3_adapter;

public class UserControl {

    public boolean control( String userName ) {
        boolean status = false;
        if ( userName.equals("ali@mail.com") ) {
            status = true;
        }
        return status;
    }

}
