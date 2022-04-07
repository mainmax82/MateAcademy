package ObjectsChapter1.Ex13_2;
/* Run Documentation1.java, Documentation2.java and Documentation3.java
 * through Javadoc. Verify the resulting documentation with your Web browser.
 */
import java.util.*;

// object/Documentation2.java
/**
 * <pre>
 * Uses
 * System.out.println(new Date());
 * </pre>
 */

public class Documentation2 {
    Date d = new Date();
    void showDate() {
        System.out.println("Date = " + d);
    }
}

