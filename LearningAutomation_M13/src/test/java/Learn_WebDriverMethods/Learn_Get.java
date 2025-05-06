package Learn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Get {

	public static void main(String[] args) {

		WebDriver driver =	new  ChromeDriver();
     driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13933259124412590121&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9181929&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	 driver.get("https://www.flipkart.com/");
	 driver.get("https://www.zomato.com/");
	 driver.get("https://qspiders.com/");
	 driver.get("https://www.myntra.com/");
	}

}
