package String;
/**
 * int indexOf(String str)
 * ���������ַ����ڵ�ǰ�ַ����е�λ�ã�����ǰ
 * �ַ������������������Ƿ���-1
 * @author JAVA
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		int index = str.indexOf("ja");
		System.out.println(index);
		
		//��ָ��λ�ÿ�ʼ���ҵ�һ�γ��ֵ�λ��
		index = str.indexOf("in",4);
		System.out.println(index);
		
		//�������һ�γ��ָ������ַ�����λ��
		index = str.lastIndexOf("in");
		System.out.println(index);
	}
}
