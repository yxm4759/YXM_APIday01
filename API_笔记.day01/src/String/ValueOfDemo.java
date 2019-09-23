package String;
/**
 * String提供了一组静态方法valueOf
 * 可以将给定的内容转换为字符串，常用的是将
 * 基本类型转换为字符串
 * @author JAVA
 *
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		int a = 123;
		String s = String.valueOf(a);
		System.out.println(s);
		
		double dou = 123.123;
		s = String.valueOf(dou);
		System.out.println(s);
		
		s = a+"";
		System.out.println(s);
	}
}
