package properties;

import com.github.dockerjava.api.model.ResourceVersion;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

public class UserProperties {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));

    public static String getValueOf(String key){
      return resourceBundle.getString(key);
    }
}
