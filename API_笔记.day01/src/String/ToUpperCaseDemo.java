package String;
/**
 * String toUpperCase()
 * String toLowerCase()
 * ����ǰ�ַ����е�Ӣ�Ĳ���ת��Ϊȫ��д��ȫСд
 * @author JAVA
 *
 */
public class ToUpperCaseDemo {
	public static void main(String[] args) {
		String str = "�Ұ�Java";
		System.out.println(str);
		
		String upper = str.toUpperCase();
		System.out.println(upper);
		
		String lower = upper.toLowerCase();
		System.out.println(lower);
	}
}
