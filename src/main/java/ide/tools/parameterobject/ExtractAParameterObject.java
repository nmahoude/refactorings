package ide.tools.parameterobject;

public class ExtractAParameterObject {

	/* extract the parameters into an object */
	
	public String methodWithParameters(String param1, String param2, int param3) {
		return param1+param2+param3;
	}
	
	
	
	public static void main(String[] args) {
		new ExtractAParameterObject().methodWithParameters("p1", "p2", 4);
	}
}
