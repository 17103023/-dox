import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.omg.CORBA.DynAnyPackage.Invalid;
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
class dp{
	String names;
	String dishMsgs;
	double sumPrices;
	
}

public class T32_07101 {

	@SuppressWarnings("null")
	public static void main(String[] args)throws Exception {
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
		
		// TODO Auto-generated method stub
		 String[] names = new String[6]; 
	        String[] dishMsgs = new String[6];
	        
	        double[] sumPrices = new double[6];

	        
	        
	        
	        
	        
	        
	        
	        String[] dishNames = { "�ϲ˰���", "���ײ�", "�����������", "����Ģ������", "����ɳ��", "���" };
	        
	        double[] prices = { 20,30 , 58.0, 44.5, 50, 60 };
	        

	        System.out.println("***********��ӭ������ϵͳ***********");
	        Scanner scanner = new Scanner(System.in);
	        int num = -1; 
	        boolean isExit = false;
	        do {
	           
	            
	            System.out.println("1:��Ҫ����");
	            
	           
	            System.out.println("2:�˳�ϵͳ");
	            System.out.println("**********************");
	            System.out.println("��ѡ��");
	            int choose = scanner.nextInt(); 
	            switch (choose) {
	            case 1:
	                System.out.println("************��Ҫ����************");
	                
	                boolean addFlag = false;
	                for (int i = 0; i < names.length; i++) { 
	                    if (names[i] == null) {
	                        addFlag = true;
	                        System.out.println("�����붩���˵�������");
	                        names[i] = scanner.next();
	                        System.out.println("������ѡ�����еĲ�Ʒ��");
	                        System.out.println("���\t\t\t����\t\t\t����");
	                        for (int j = 0; j < dishNames.length; j++) { 
	                           
	                            System.out.println(j + 1 + "\t\t\t" + dishNames[j]+ "\t\t\t" + prices[j] );
	                        }
	                    
	                        System.out.println("����ѡ���Ʒ�ı�ţ�");
	                        int chooseDishName = scanner.nextInt();
	                        System.out.println("���������͵ķ�����");
	                        int number = scanner.nextInt();
	                        
	                        double sumPrice = prices[chooseDishName - 1] * number;
	                        double price = (sumPrice > 30) ? 0 : 3;
	                        System.out.println("��ϲ�����ͳɹ���");
	                        System.out.println("�����Ĳ�Ʒ�ǣ�"
	                                + dishNames[chooseDishName - 1] + "\t" + number
	                                + "��");
	                        System.out.print("�ͷѣ�" + sumPrice);
	                        System.out.print("\t�Ͳͷѣ�" + price);
	                        System.out.println("\t�ܷ��ã�" + (price + sumPrice));
	                       
	                       
	                        sumPrices[i] = (sumPrice + price); 
	                        dishMsgs[i] = dishNames[chooseDishName - 1]; 
	                        
	                        
	                        break;
	                    }
	                }
	                if (!addFlag) {
	                    System.out.println("�ʹ��Ѿ�����");
	                }
	                break;
	            
	            
	            case 2:
	                
	                isExit = true;
	                break;
	            default:
	                
	                isExit = true;
	                break;
	            }
	            if (!isExit) { 
	                System.out.println("����0�������˵���");
	                num = scanner.nextInt();
	            } else {
	                break; 
	            }

	        } while (num == 0);
	        System.out.println("лл���Ĺ��٣���������");
	}
}