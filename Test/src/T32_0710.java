import java.util.Scanner;

class 的{
	String color;
	int speed;
	void upSpeed(int value) {
		speed=speed+value;
		
	}
	void downSpeed(int value) {
		speed=speed-value;
		
	}
}
class dianpu{
	String menu;
	
	int number;
	int price;
	int Totalprice;
	void Totalprice(){
		Totalprice=number*price;
		
		
	}
	
}
public class T32_0710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		车 myCar1=new 车();
		车 myCar2=new 车();
		车 myCar3=new 车();
		
		myCar1.color="红色";
		myCar1.speed=0;
		myCar2.color="蓝色";
		myCar2.speed=0;
		myCar3.color="黄色";
		myCar3.speed=0;
		
		myCar1.upSpeed(30);
		System.out.println("汽车1的颜色如果是"+myCar1.color+","+"当前速度为"+myCar1.speed+"km");
		myCar2.upSpeed(60);
		System.out.println("汽车2的颜色如果是"+myCar2.color+","+"当前速度为"+myCar2.speed+"km");
		myCar3.upSpeed(0);
		System.out.println("汽车3的颜色如果是"+myCar3.color+","+"当前速度为"+myCar3.speed+"km");
		
		
		
		dianpu menu1=new dianpu();
		dianpu menu2=new dianpu();
		dianpu menu3=new dianpu();
		menu1.menu="鱼香肉丝";
		menu1.price=30;
	
		menu2.menu="锅包肉";
		menu2.price=25;
		
		menu3.menu="奶油海鲜意大利面";
		menu3.price=40;
		
		
		
		
	}

}
