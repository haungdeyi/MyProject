package exam;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestHashSet {

	public void test() {
		Collection<String> set = new HashSet<String>();
		String str1 = new String("hello");
		String str2 = new String("hello");
		set.add(str1);
		set.add(str2);//û�б��������������滻ԭ����ֵ
		System.out.println(str1.hashCode() == str2.hashCode());//true
		System.out.println(set);
	}
	
	public static void main(String[] args) {
		new TestHashSet().test();
	} 
}
