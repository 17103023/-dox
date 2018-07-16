//class Parent{
//	Parent(){
//		System.out.println("Parent()基本构造方法");
//	}
//}
//class Child extends Parent {
//	Child(){
//		System.out.println("Child()基本构造方法");
//	}
//}
//public class Super32 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			Child c=new Child();
//	}
//
//}
//class Parent{
//	Parent(){
//		System.out.println(" Parent()基本 构造方法");
//		
//	}
//	Parent(int a){
//		System.out.println(" Parent 构造方法参数："+a);
//		
//	}
//}
//class Child extends Parent {
//	Child(int a){
//		System.out.println("Child 构造方法参数："+a);
//	}
//}
//public class Super32 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			Child c=new Child(5);
//	}
//
//}
//class Parent{
//	Parent(){
//		System.out.println(" Parent()构造方法参数：");
//		
//	}
//	Parent(int a){
//		System.out.println(" Parent 构造方法参数："+a);
//		
//	}
//	
//}
//
//class Child extends Parent{
//	Child(int a){
//		super(a);
//		System.out.println("Child 参数生成者："+a);
//	}
//}
//public class Super32 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			Child c=new Child(5);
//	}
//
//}
//class parent{
//	 
//		int x=10;
//		
//		
//			}
//class Child extends parent{
//	int y=200;
//	int x=100;
//	void disp() {
//		System.out.println("in child x="+x);
//		System.out.println("in child y="+y);
//		System.out.println("in child this.x="+this.x);
//		System.out.println("in child this.y="+this.y);
//		System.out.println("in child super.x="+super.x);
//		
//	}
//}
//public class Super32 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Child c=new Child();
//		c.disp();
//		}
//	}
//
//
//				
			