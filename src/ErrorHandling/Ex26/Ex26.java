package ErrorHandling.Ex26;

import java.io.FileInputStream;

public class Ex26 {
    public static void main(String[] args) throws Exception {
        // Leads to FileNotFoundException:
        FileInputStream file =
                new FileInputStream("null.jv");
        // Use the file ...
        // Close the file:
        file.close();
    }
}
