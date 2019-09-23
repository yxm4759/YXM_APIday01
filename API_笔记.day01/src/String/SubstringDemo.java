package String;
/**
 * String substring(int start,int end)
 * 截取指定范围内的字符串
 * 注:java API中通常使用两个数字表示范围时
 * 都是"含头不含尾"的.
 * @author JAVA
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		String host = "www.tedu.cn";
		
		String sub = host.substring(4,8);
		System.out.println(sub);
		
		//从指定位置开始截取到字符串末尾
		sub = host.substring(4);
		System.out.println(sub);

	}

}
