package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import util.strategy.ExploreBy4Way;
import util.strategy.ExploreBy8Way;
import util.strategy.ExploreStrategy;

public class FileUpload { // File I/O 할 줄 몰라서 재엽이 형꺼 참고했습니다. 
	
	private ExploreStrategy strategy;
	
	public void propertiesUpload() throws IOException{
		FileInputStream files = new FileInputStream("strategy.properties");
		Properties prop = new Properties();
		prop.load(files);
		String strategyName = prop.getProperty("STRATEGY");
		
		if(strategyName.equals("4")){
			this.strategy = new ExploreBy4Way();
			System.out.println("Strategy - 4 Directions");
		} else {
			this.strategy = new ExploreBy8Way();
			System.out.println("Strategy - 8 Directions");
		}
	}
	
	public ExploreStrategy getStrategy() throws IOException {
		propertiesUpload();
		return strategy;
	}
}
