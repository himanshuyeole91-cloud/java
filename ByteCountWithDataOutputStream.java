import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCountWithDataOutputStream {
    public static void main(String[] args) {
        String filePath = "data.bin";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            int before = dos.size();
            dos.writeUTF("Hello World");
            dos.writeInt(123);
            dos.writeDouble(45.67);
            int after = dos.size();

            System.out.println("Bytes written: " + (after - before));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
