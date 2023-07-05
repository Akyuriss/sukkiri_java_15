package sukkiri_java_15;

public class Practice_15_2 {
	static String folder;
	static String file;
	
	public String Path(String folder, String file) {
		if(!folder.matches(".*\\")){
			folder += "\\";
		}
	return folder +file;
	}
}
