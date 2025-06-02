import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrog {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	WebElement source = driver.findElement(By.id("box6"));
    WebElement target = driver.findElement(By.id("box106"));
    
    Actions act = new Actions(driver);
    
    act.dragAndDrop(source,target).perform();
    System.out.println(driver.getTitle());
    
    
    WebElement madrid = driver.findElement(By.id("box7"));      
    WebElement spain = driver.findElement(By.id("box107"));     
    act.dragAndDrop(madrid, spain).perform();
	}
}
