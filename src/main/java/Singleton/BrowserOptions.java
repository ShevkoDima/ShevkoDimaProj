package Singleton;

import org.openqa.selenium.chrome.ChromeOptions;

public interface BrowserOptions {

    default ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }
}
