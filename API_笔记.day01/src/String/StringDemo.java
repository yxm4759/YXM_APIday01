package String;
/**
 * String是不变对象，即:字符串对象一旦创建，
 * 内容不可改变，改变要创建信息对象
 * 其中一个原因和常量池有关:
 * 字符串常量池:JVM在堆中有一段内存是缓存所有
 * 使用字面量新式创建的字符串对象，一旦我们使用
 * 已有的字面量再次创建字符串对象时会直接重用
 * 这样可以减少内存开销.
 * @author JAVA
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "123abc";
		String s2 = "123abc";
		//s2重用了s1对象
		System.out.println(s1==s2);
		//s3也重用了
		String s3 = "123abc";
		System.out.println(s1==s3);
		
		//修改字符串内容会创建新对象
		s1 = s1+"!";
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println(s1==s2);
		
		//使用new的形式创建一定会产生新的对象
		String s4 = new String("123abc");
		System.out.println("s4:"+s4);
		//因此虽然s2,s4内容一样，但是地址不同
		System.out.println(s2==s4);
		/*
		 * 字符串在比较时应当使用equals比较
		 * 而不应当使用"=="
		 */
		System.out.println(s2.equals(s4));
		
		/*
		 * 编译器有一个特征:在编译期间就能确定
		 * 一个计算表达式的结果时，编译期会直接
		 * 进行计算，并将结果编译到class文件中
		 * 例如下面的代码会被编译器改为:
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
