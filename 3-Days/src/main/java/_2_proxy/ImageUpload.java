package _2_proxy;

public class ImageUpload implements IImage{

    @Override
    public void uploadImage(String path) {
        System.out.println("Upload :" + path);
    }

}
