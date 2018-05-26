package Arrays;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Ahmed");
		map.put(2, "Haris");
		map.put(3, "Mirza");
		for (Map.Entry m:map.entrySet()) {
			System.out.println(m.getValue());
		}
	}

}
