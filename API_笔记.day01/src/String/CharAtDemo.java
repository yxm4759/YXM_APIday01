package String;
/**
 * char charAt(int index)
 * ��ȡ����λ���ϵ��ַ�
 * @author JAVA
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		char c = str.charAt(15);
		//System.out.println(c);
		int len = str.length()-1;
		for(int i=len;i>=0;i--) {
			char sum = str.charAt(i);
			System.out.print(sum);
		}
		
		
	}
}
