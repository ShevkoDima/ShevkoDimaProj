package Builder;

public final class BrowsersBuilder {
    private String opera;
    private String chrome;
    private String firefox;

    private BrowsersBuilder() {
    }

    public static BrowsersBuilder aBrowsers() {
        return new BrowsersBuilder();
    }

    public BrowsersBuilder Opera(String opera) {
        this.opera = opera;
        return this;
    }

    public BrowsersBuilder Chrome(String chrome) {
        this.chrome = chrome;
        return this;
    }

    public BrowsersBuilder Firefox(String firefox) {
        this.firefox = firefox;
        return this;
    }

    public Browsers build() {
        Browsers browsers = new Browsers();
        browsers.setOpera(opera);
        browsers.setChrome(chrome);
        browsers.setFirefox(firefox);
        return browsers;
    }
}
