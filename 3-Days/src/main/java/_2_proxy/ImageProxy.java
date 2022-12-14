package _2_proxy;

public class ImageProxy implements IImage {

    private FileControl fileControl = new FileControl();

    @Override
    public void uploadImage(String path) {
        boolean status = fileControl.control(path);
        if (status) {
            ImageUpload imageUpload = new ImageUpload();
            imageUpload.uploadImage(path);
        }else {
            System.err.println("UploadImage Fail");
        }
    }
}
