package ide.tools.movetype;

/**
 *
 * Extract the inner class to its own class/file
 *
 */
public class MoveType {

	static class InnerTypeToExtract {
		int field1;
		int field2;
	}
	
	int field1;
	int field2;
	InnerTypeToExtract type;
	
	
}
