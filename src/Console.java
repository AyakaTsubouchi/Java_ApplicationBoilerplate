
public class Console {
	
	public static void print(String message) {
		System.out.print(message);
	}
	public static void println(String message) {
		System.out.print(message);
	}
	public static void printLine(int howMany) {
		for(int i = 0; i < howMany; i++) {
			System.out.println();
		}
	}
	public static void repeatChar(int howMany, char aChar) {
		for(int i=0; i < howMany; i++) {
			System.out.println(aChar);
		}
	}
	public static void repeatStr(int howMany, String aString) {
		for(int i=0; i < howMany; i++) {
			System.out.println(aString);
		}
	}
	

}
