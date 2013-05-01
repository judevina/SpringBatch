package fromdb;

import org.springframework.batch.core.launch.support.CommandLineJobRunner;

public class Main {

	public static void main(String[] args) {
		
		try {
			CommandLineJobRunner.main(new String[]{"classpath:fromdb/contextFromDB.xml","simpleJob"});
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
}