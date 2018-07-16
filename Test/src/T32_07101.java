import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.omg.CORBA.DynAnyPackage.Invalid;
class 车{
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
		
		// TODO Auto-generated method stub
		 String[] names = new String[6]; 
	        String[] dishMsgs = new String[6];
	        
	        double[] sumPrices = new double[6];

	        
	        
	        
	        
	        
	        
	        
	        String[] dishNames = { "紫菜包饭", "辣白菜", "番茄意大利面", "奶油蘑菇意面", "鸡柳沙拉", "红酒" };
	        
	        double[] prices = { 20,30 , 58.0, 44.5, 50, 60 };
	        

	        System.out.println("***********欢迎进入点餐系统***********");
	        Scanner scanner = new Scanner(System.in);
	        int num = -1; 
	        boolean isExit = false;
	        do {
	           
	            
	            System.out.println("1:我要订餐");
	            
	           
	            System.out.println("2:退出系统");
	            System.out.println("**********************");
	            System.out.println("请选择：");
	            int choose = scanner.nextInt(); 
	            switch (choose) {
	            case 1:
	                System.out.println("************我要订餐************");
	                
	                boolean addFlag = false;
	                for (int i = 0; i < names.length; i++) { 
	                    if (names[i] == null) {
	                        addFlag = true;
	                        System.out.println("请输入订餐人的姓名：");
	                        names[i] = scanner.next();
	                        System.out.println("您可以选择下列的菜品：");
	                        System.out.println("序号\t\t\t菜名\t\t\t单价");
	                        for (int j = 0; j < dishNames.length; j++) { 
	                           
	                            System.out.println(j + 1 + "\t\t\t" + dishNames[j]+ "\t\t\t" + prices[j] );
	                        }
	                    
	                        System.out.println("请您选择菜品的编号：");
	                        int chooseDishName = scanner.nextInt();
	                        System.out.println("请您输入点餐的份数：");
	                        int number = scanner.nextInt();
	                        
	                        double sumPrice = prices[chooseDishName - 1] * number;
	                        double price = (sumPrice > 30) ? 0 : 3;
	                        System.out.println("恭喜您订餐成功！");
	                        System.out.println("您定的菜品是："
	                                + dishNames[chooseDishName - 1] + "\t" + number
	                                + "份");
	                        System.out.print("餐费：" + sumPrice);
	                        System.out.print("\t送餐费：" + price);
	                        System.out.println("\t总费用：" + (price + sumPrice));
	                       
	                       
	                        sumPrices[i] = (sumPrice + price); 
	                        dishMsgs[i] = dishNames[chooseDishName - 1]; 
	                        
	                        
	                        break;
	                    }
	                }
	                if (!addFlag) {
	                    System.out.println("餐袋已经满了");
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
	                System.out.println("输入0返回主菜单！");
	                num = scanner.nextInt();
	            } else {
	                break; 
	            }

	        } while (num == 0);
	        System.out.println("谢谢您的光临！！！！！");
	}
}