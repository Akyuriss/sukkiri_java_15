package sukkiri_java_15;

public class Practice_15_1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<10; i++) {
			sb.append(i+1 + ",");
		}
		System.out.println(sb.toString());
		
		String s = sb.toString();
		String[] spiltWards = s.split("[,]");
		for(String y : spiltWards) {
		}
		System.out.println(spiltWards);
		}
}
