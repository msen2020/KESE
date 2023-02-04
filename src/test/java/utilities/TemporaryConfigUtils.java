package utilities;


import org.jetbrains.annotations.Nullable;
//import com.sun.istack.Nullable;
import java.io.*;
import java.util.Properties;

public class TemporaryConfigUtils {
    @Nullable
    public static void writeDataToTemporaryFile(String tip, String id) { // room=123123
        try (OutputStream output = new FileOutputStream("temporary.properties", true)) {

            Properties prop = new Properties();
            prop.setProperty(tip, id);
            prop.store(output, null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Nullable
    public static String readDataFromTemporaryFile(String tip) { // room
        try (InputStream input = new FileInputStream("temporary.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            return prop.getProperty(tip);

        } catch (IOException ex) {
            return null;
        }
    }

    @Nullable
    public static void deleteTemporaryFile() {
        try {
            File f = new File("temporary.properties");
            if (!f.delete()) {
                System.out.println(f.getName() + "not  deleted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
