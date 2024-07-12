package pumpproject;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pumpfunautomate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Lincy Testing\\selenium files\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://pump.fun/board");
		String mainwindow=d.getWindowHandle();
		System.out.println("main window"+mainwindow);
		d.findElement(By.id("radix-:r0:")).click();
		WebElement press=d.findElement(By.xpath("//*[@id=\"radix-:r0:\"]/button"));
		press.click();
		String proceed=press.getText();
		Set<String> s=d.getWindowHandles();
		for(String opened:s) {
			System.out.println("opened windows"+opened);
		}	
		System.out.println("the text is"+proceed);
		WebElement body=d.findElement(By.xpath("/html/body"));
		body.click();
		d.switchTo().window(mainwindow);
	   WebElement value=	d.findElement(By.xpath("/html/body/div[1]/nav/div[2]/div/button"));
	   value.click();
	   String connect1=value.getText();
	   System.out.println("the value is"+ connect1);
	   WebElement Wal=d.findElement(By.xpath("//*[@id=\"radix-:r3:\"]/div/div[5]/button"));
	   Wal.click();
	
		
	}

}
