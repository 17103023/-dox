import java.util.Scanner;

class ��{
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
		
		�� myCar1=new ��();
		�� myCar2=new ��();
		�� myCar3=new ��();
		
		myCar1.color="��ɫ";
		myCar1.speed=0;
		myCar2.color="��ɫ";
		myCar2.speed=0;
		myCar3.color="��ɫ";
		myCar3.speed=0;
		
		myCar1.upSpeed(30);
		System.out.println("����1����ɫ�����"+myCar1.color+","+"��ǰ�ٶ�Ϊ"+myCar1.speed+"km");
		myCar2.upSpeed(60);
		System.out.println("����2����ɫ�����"+myCar2.color+","+"��ǰ�ٶ�Ϊ"+myCar2.speed+"km");
		myCar3.upSpeed(0);
		System.out.println("����3����ɫ�����"+myCar3.color+","+"��ǰ�ٶ�Ϊ"+myCar3.speed+"km");
		
		
		
		dianpu menu1=new dianpu();
		dianpu menu2=new dianpu();
		dianpu menu3=new dianpu();
		menu1.menu="������˿";
		menu1.price=30;
	
		menu2.menu="������";
		menu2.price=25;
		
		menu3.menu="���ͺ����������";
		menu3.price=40;
		
		
		
		
	}

}
