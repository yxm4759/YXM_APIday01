package String;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String end)
 * �жϵ�ǰ�ַ����Ƿ����Ը������ַ�����ʼ���β��.
 * @author JAVA
 *
 */
public class StartsWithDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		
		boolean ends = str.endsWith("ava");
		System.out.println(ends);
	}
}
