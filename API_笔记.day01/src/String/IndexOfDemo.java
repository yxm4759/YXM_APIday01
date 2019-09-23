package String;
/**
 * int indexOf(String str)
 * 检索给定字符串在当前字符串中的位置，若当前
 * 字符串不包含给定内容是返回-1
 * @author JAVA
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		int index = str.indexOf("ja");
		System.out.println(index);
		
		//从指定位置开始查找第一次出现的位置
		index = str.indexOf("in",4);
		System.out.println(index);
		
		//查找最后一次出现给定的字符串的位置
		index = str.lastIndexOf("in");
		System.out.println(index);
	}
}
