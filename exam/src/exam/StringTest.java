package exam;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = String.valueOf("hello");
		String str5 = " hello ".trim();//产生一个新的对象
		String str6 = "hel" + "lo";
		
		System.out.println("---------------------");
		System.out.println(str1 == str2); //false
		System.out.println(str2 == str3); //false
		System.out.println(str3 == str4); //false
		System.out.println(str1 == str5); //true? 结果为：false
		System.out.println(str2 == str5);
		System.out.println("---------------------");
		System.out.println(str2 == str6); //true
	}

}
