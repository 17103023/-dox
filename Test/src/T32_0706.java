class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int subtract(int a,int b);
	public abstract double average(int[] a);
}
class GoodCalc extends Calculator{
	public int add(int a,int b) {
		return a+b;
		
	}
	public int subtract(int a,int b) {
		return a-b;
		
	}
	public double average(int [] a) {
		double sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum/a.length;
		
	}
}
interface PhoneInterface{
	int 
}
interface MobilePhoneInterface extends PhoneInterface{
	
}
interface MP3Interface{
	public void play();
	public void stop();
}
class PDA{
	public int calculate(int x,int y) {
		return x+y;
	}
}
class SmartPhone extends PDA implements
			MobilePhoneInterface,MP3Interface{
	public void sendCall() {
		System.out.println("挂电话");
	}
	public void receiveCall() {
		System.out.println("接电话");
	}
	public void sendSMS() {
		System.out.println("发送SMS");
	}
	public void receiveSMS() {
		System.out.println("接收SMS");
	}
	public void play() {
		System.out.println("音乐播放");
	}
	public void stop() {
		System.out.println("播放终止");
	}
	public void schedule() {
		System.out.println("日程管理");
	}
}
public class T32_0706 {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**1.overrding:draw()");
		Line line=new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		System.out.println("**2. abstract : GoodCalc");
		GoodCalc c=new GoodCalc();
		System.out.println("add:"+c.add(2,3));
		System.out.println("subtract:"+c.subtract(2,3));
		System.out.println("average:"+c.average(new int[]{2,3,4}));
		System.out.println("**3. interface : phone");
	SmartPhone p=new SmartPhone();
	p.sendCall();
	p.play();
	System.out.println(p.calculate(3,5));
	p.schedule();
	}

}
