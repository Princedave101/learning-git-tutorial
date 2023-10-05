import java.io.*;
import java.util.Arrays;
import java.util.Date;
public class Main{
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        try{
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.dat", true))) {
                Integer n = Integer.valueOf(9);
                
                Date d = new Date();
                out.writeObject(n);
                out.writeObject(n);
                out.writeObject(d);
                out.writeObject(d);
                out.writeObject(Integer.valueOf(7));
                System.out.println("hello world!!");
            } 

            try( ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.dat"))){
                byte[] b = new byte[]{19, 9, 6};
                in.read(b);
                System.out.println(Arrays.toString(b));
                Integer n1 = (Integer)in.readObject();
                Integer n2 = (Integer)in.readObject();
                Date d1  = (Date)in.readObject();
                Date d2  = (Date)in.readObject();
                Integer n3 = (Integer)in.readObject();
                System.out.println(d1 + " "+ " "+ d2 );
                //  test

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
        
}