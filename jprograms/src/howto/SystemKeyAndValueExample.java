package howto;

import java.util.Map.Entry;import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemKeyAndValueExample {
	
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		
		Set<Entry<Object, Object>> entries = properties.entrySet();
		
		for (Map.Entry<Object, Object> entry : entries) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+entry.getValue());
			System.out.println("=========================");
		}
		
	}

}
