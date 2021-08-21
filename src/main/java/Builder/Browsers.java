package Builder;

public class Browsers {
    private String opera;
    private String chrome;
    private String firefox;

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public String getChrome() {
        return chrome;
    }

    public void setChrome(String chrome) {
        this.chrome = chrome;
    }

    public String getFirefox() {
        return firefox;
    }

    public void setFirefox(String firefox) {
        this.firefox = firefox;
    }

    @Override
    public String toString() {
        return "Browsers{" +
                "opera='" + opera + '\'' +
                ", chrome='" + chrome + '\'' +
                ", firefox='" + firefox + '\'' +
                '}';
    }
}
