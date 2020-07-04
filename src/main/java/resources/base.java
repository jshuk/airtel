package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver initializeDriver(){
		String path = System.getProperty("user.dir");   // return project folder path
		

		String driverpath = path + "\\src\\main\\java\\resources\\chromedriver.exe";
		
		prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path+
					"\\src\\main\\java\\resources\\data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
		} 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	public static String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}
	
	
	public static String getGlobalValue(String key) throws IOException
	{
		
        String path = System.getProperty("user.dir");   // return project folder path
		
		
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream(path+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		return prop.getProperty(key);
	
		
		
	}

}
