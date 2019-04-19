package exam;

public class TestStaticSub extends TestStaticSuper{
	
      public void test() {
    	  //证明当使用private和default(默认)修饰成员时，子类可以继承，但不能访问
    	  TestStaticSub.sayHello();//证明可以继承父类的静态方法
      }
}
