package apidoc;
/**
 * �ĵ�ע���ǹ��ܼ�ע�ͣ�ֻ�������ط�ʹ��:
 * �࣬����������
 * ������ʹ��������˵����ǰ��Ĺ��ܣ������ͼ��
 * 
 * @author Jerry
 * @version 1.0
 * @since JDK1.5
 * @see java.lang.String
 *
 */
public class DocDemo {
	/**
	 * sayHello�����е��ʺ���
	 */
	public final static String INFO = "���";
	
	/**
	 * 
	 * 
	 * Ϊ�������û�����ʺ���
	 * @param name �����û�������
	 * @return �����ʺ�����ַ���
	 */
	public String sayHello(String name) {
		return "INFO"+name;
	}
}
