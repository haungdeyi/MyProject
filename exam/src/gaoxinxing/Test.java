package gaoxinxing;

public class Test extends Father{
        
	
	String ct = "演示冲突";
	//模拟不同模块之间的更新
	double a = 0.2396d;
	//float a = 0.2396;
	//byte b = 128;
	//boolean b = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void test() {
		System.out.println(super.a);
		//super.setA(1);
	} 
        
	//测试提交到分支 (2019-06-09 20:23)
}
