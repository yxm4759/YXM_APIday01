package String;
/**
 * String�ǲ�����󣬼�:�ַ�������һ��������
 * ���ݲ��ɸı䣬�ı�Ҫ������Ϣ����
 * ����һ��ԭ��ͳ������й�:
 * �ַ���������:JVM�ڶ�����һ���ڴ��ǻ�������
 * ʹ����������ʽ�������ַ�������һ������ʹ��
 * ���е��������ٴδ����ַ�������ʱ��ֱ������
 * �������Լ����ڴ濪��.
 * @author JAVA
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";
		String s2 = "123abc";
		//s2������s1����
		System.out.println(s1==s2);
		//s3Ҳ������
		String s3 = "123abc";
		System.out.println(s1==s3);
		
		//�޸��ַ������ݻᴴ���¶���
		s1 = s1+"!";
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println(s1==s2);
		
		//ʹ��new����ʽ����һ��������µĶ���
		String s4 = new String("123abc");
		System.out.println("s4:"+s4);
		//�����Ȼs2,s4����һ�������ǵ�ַ��ͬ
		System.out.println(s2==s4);
		/*
		 * �ַ����ڱȽ�ʱӦ��ʹ��equals�Ƚ�
		 * ����Ӧ��ʹ��"=="
		 */
		System.out.println(s2.equals(s4));
		
		/*
		 * ��������һ������:�ڱ����ڼ����ȷ��
		 * һ��������ʽ�Ľ��ʱ�������ڻ�ֱ��
		 * ���м��㣬����������뵽class�ļ���
		 * ��������Ĵ���ᱻ��������Ϊ:
		 * String s5 = "123abc";
		 */
		String s5 = "123"+"abc";
		System.out.println("s5:"+s5);
		System.out.println(s2==s5);
		
		String s = "123";
		String s6 = s+"abc";
		System.out.println("s6:"+s6);
		System.out.println(s2==s6);
	}
}
