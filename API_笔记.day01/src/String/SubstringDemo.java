package String;
/**
 * String substring(int start,int end)
 * ��ȡָ����Χ�ڵ��ַ���
 * ע:java API��ͨ��ʹ���������ֱ�ʾ��Χʱ
 * ����"��ͷ����β"��.
 * @author JAVA
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		String host = "www.tedu.cn";
		
		String sub = host.substring(4,8);
		System.out.println(sub);
		
		//��ָ��λ�ÿ�ʼ��ȡ���ַ���ĩβ
		sub = host.substring(4);
		System.out.println(sub);

	}

}
