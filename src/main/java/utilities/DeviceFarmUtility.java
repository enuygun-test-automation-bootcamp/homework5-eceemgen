package utility;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

import static org.aspectj.bridge.Version.text;

public class DeviceFarmUtility {

    public static DesiredCapabilities pathToDesiredCapabilitites(String path) {
        try {

            System.out.println("open contactmanager");
            WebDriver adriver;
            adriver.get(text);
            Thread.sleep(2000);

            String forwardURL = adriver.getCurrentUrl();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Gson gson = new Gson();
            Type type = new TypeToken<Map<String, ?>>(){}.getType();
            Map<String , ?> map =  gson.fromJson(new FileReader(path), type);
            return new DesiredCapabilities(map);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}