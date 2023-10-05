import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("out.dat"))) {
            outputStream.writeDouble(10.97);
        }
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("out.dat"))) {
            System.out.println(inputStream.readDouble());
        //justing adding 
        // hello
        }
    }
}
