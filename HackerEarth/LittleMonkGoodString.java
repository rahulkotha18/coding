import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @problemLink https://www.hackerearth.com/practice/algorithms/string-algorithm/string-searching/practice-problems/algorithm/little-monk-and-good-string/
 */
public class LittleMonkGoodString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testString = br.readLine();
		String[] values = testString.split("[bcdfghjklmnpqrstvwxyz]");
		int longest = 0;
		for(String value: values) {
			longest = Math.max(value.length(), longest);	
		}
		System.out.println(longest);

	}

}