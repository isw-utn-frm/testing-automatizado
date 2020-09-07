package frm.selenium;

public class SeleniumDriver {
	private SeleniumConfig config;
    private String url = "https://www.google.com/";
    
    public SeleniumDriver() {
        config = new SeleniumConfig();        
    }
    
    public SeleniumConfig openWindow() {
    	config.getDriver().get(url);
    	return config;
    }
    
    public void closeWindow() {
        this.config.getDriver().close();
    }
     
    public String getTitle() {
        return this.config.getDriver().getTitle();
    }
}
