
class Card{
	String kind;
	int number;
	static int width=100;
	static int height=250;
	static int width1=50;
	static int height1=80;
	
}
class Car{
	String color;
	String gearType;
	int door;
	public int speed;

	Car(){
		color="white";
		gearType="auto";
		door=4;
		}
	Car(String c,String g,int d){
		color=c;
		gearType=g;
		door=d;
			}
	public void upSpeed(int i) {
		// TODO Auto-generated method stub
		
	}
	}	
class InitTest{
	static int cv=1;
	int iv;
	static {
		cv=2;
	}{
		iv=2;
	}
	InitTest(){
		iv=3;
	}
}

public class T32_0704 {
	public static int factorial(int n) {
		
		if(n==1)
			return 1;
		
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println("	\n=====01.Card");
		System.out.println("card.width="+Card.width);
		System.out.println("card.height="+Card.height);
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="Space";
		c2.number=4;
		System.out.println("c1은"+c1.kind+"," +c1.number+"이며"+","+"크기는"+"("+Card.width+","+Card.height+")");
		System.out.println("c2은"+c2.kind +","+c2.number+"이며"+","+"크기는"+"("+Card.width+","+Card.height+")");
	
		
		System.out.println("c1의 width와height를 각각"+Card.width1+","+Card.height1+"으로 변경합니다");
		Card c3=new Card();
		c3.kind="Heart";
		c3.number=7;
		
		Card c4=new Card();
		c4.kind="Space";
		c4.number=4;
		System.out.println("c1은"+c3.kind+"," +c3.number+"이며"+","+"크기는"+"("+Card.width1+","+Card.height1+")");
		System.out.println("c2은"+c4.kind +","+c4.number+"이며"+","+"크기는"+"("+Card.width1+","+Card.height1+")");
		System.out.println("	\n=====02 Car");
		Car car1=new Car();
		car1.color="white";
		car1.gearType="auto";
		car1.door=4;
		
		
		System.out.println("car1의 color="+car1.color +","+"gearType"+"="+car1.gearType+","+"door="+car1.door);
		Car car2=new Car("black","gear",6);	
		System.out.println("car2의 color="+car2.color +","+"gearType"+"="+car2.gearType+","+"door="+car2.door);
		Car car3=new Car("blue","auto",4);	
		System.out.println("car3의 color="+car3.color +","+"gearType"+"="+car3.gearType+","+"door="+car3.door);
		Car car4=new Car("blue","gear",6);	
		System.out.println("car4의 color="+car4.color +","+"gearType"+"="+car4.gearType+","+"door="+car4.door);
		System.out.println("	\n=====03.Init");
		InitTest it=new InitTest();
		System.out.printf("cv=%d,iv=%d",it.cv,it.iv);
		
		System.out.println("	\n=====04.Factorial 4");
	
			System.out.println("factorial 4'result:"+factorial(4));
				}
	
	}


