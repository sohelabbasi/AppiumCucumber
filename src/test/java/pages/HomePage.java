package pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import util.TestBase;

public class HomePage extends TestBase {
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='ADD TO CART'])[1]")
	public MobileElement itemFromList;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
	public MobileElement cartDetailsIcon;
	
	@AndroidFindBy(xpath = "//*[@content-desc='test-REMOVE']")
	public MobileElement removeItem;

	public HomePage(){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);

	}
	
	public void readData(){
		System.out.println("done");
	}
	
	public void clickOnItem() throws InterruptedException{
		intentionalWait();
		itemFromList.click();
	}
	
	public void selectCart() throws InterruptedException{
		intentionalWait();
		cartDetailsIcon.click();
	}
	
	public void removeItemFromCart() throws InterruptedException{
		intentionalWait();
		removeItem.click();
	}
	
}
