package ide.tools.introduceParameter;

import java.util.ArrayList;
import java.util.List;

public class IntroduceParameter {
	static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		new IntroduceParameter().use("World");
		new IntroduceParameter().use("Mars");
	}
	
	/**
	 * push "Hello" as a parameter of this method
	 * 
	 * this should change the call in main at the same time
	 */
	public void use(String whom) {
		list.add("Hello "+whom+" !");
	}
}
