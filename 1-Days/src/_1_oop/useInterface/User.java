package _1_oop.useInterface;

import java.util.List;

public class User implements IProfile, IUserProduct{

    @Override
    public String profileName(int userID) {
        userNameCharSize("");
        return null;
    }

    @Override
    public int userID(String email) {
        return 0;
    }

    @Override
    public List<String> userProduct(int userID) {
        return null;
    }
}
