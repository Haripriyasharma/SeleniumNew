import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage {
	public static void main(String[] args) {
		String Projectpath = System.getProperty("user.dir");
		System.out.println(Projectpath);
		System.setProperty("webdriver.chrome.driver",Projectpath+"//Drivers//ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=nCJoia7wosc&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa");
	}

}
