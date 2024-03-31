package SampleG.Sample;

import java.time.Duration;
import java.util.HashMap;

import org.bouncycastle.jcajce.provider.digest.GOST3411.HashMac;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   Actions a=new Actions(driver);
//   a.moveToElement(Webelement).perform().build();
//
//   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
//   wait.until(ExcpectedConditions.visibilityofelementlocated(By.id(" ")));
		
   
      
		
  
  
		
//		String s1="hi hi hello bye bye kiran";
		String s2="ggttagajays";
		
		String[] str=s2.split("");
		
		HashMap<Character, Integer> map =new HashMap<>();
		
		for (int i = 0; i < s2.length(); i++) {
			int count=0;
			for (int j = 0; j < s2.length(); j++) {
//				if (s)) {
//					count++;
//				}
			}
//			map.put(string, count);
			
		}
		
		System.out.println(map);
		
	}

}
