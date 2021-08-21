package Singleton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager implements BrowserOptions {

    private static final ThreadLocal<DriverManager> threadLocal = new ThreadLocal<>();

    WebDriver driver = null;

    private DriverManager() {
    }

    public static DriverManager getInstance() {
        if (threadLocal.get() == null) {
            synchronized (DriverManager.class) {
                threadLocal.set(new DriverManager());
            }
        }
        return threadLocal.get();
    }

    public WebDriver getDriver() {
        if (driver == null) {
            return driver = initDriver();
        } else return driver;
    }

    private synchronized WebDriver initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(getChromeOptions());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
