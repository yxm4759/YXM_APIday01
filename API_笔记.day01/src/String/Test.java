package String;
/**
 * ʵ�ַ�������ɻ�ȡ�����Ĳ���
 * @author JAVA
 *
 */
public class Test {
	public static void main(String[] args) {
		String name = getHostName("www.baidu.com");
		System.out.println(name);//baidu
		
		name = getHostName("http://www.tedu.com.cn");
		System.out.println(name);//tedu
	}
	public static String getHostName(String loc) {
		int index = loc.indexOf(".")+1;
		int index1 = loc.indexOf(".",index);
		String name = loc.substring(index,index1);
		return name;
	}
}
