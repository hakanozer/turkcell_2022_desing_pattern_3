package _1_oop.useInterface;

public interface IProfile {

    String profileName(int userID);
    int userID(String email);

    default int userNameCharSize(String userName) {
        return userName.length();
    }

}
