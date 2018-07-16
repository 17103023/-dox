import java.util.Scanner;

public class T32_0629 {
	public static void main(String[] args) {
		int score =100;
		char ch ='A';
		String hi="hello";
		final int MAX=1000;
		double FtoD = 3.0f;
		//float DtoF =5.1;
		byte byteDefault = 0;
		float testFloat = 0.0f;
		String testString=" 32 Liwenying" ;
		float testfloat =1.6f;
		int testfloattoint=1;
		int toChar = 65;
		char fromInt =(char)toChar;
		int testinttobyte =44;
		int i=5;
		int j=0;
		j= i++;
		int unaryOp=5;
		int signOp=-10;
		boolean power = false;
		int bitOp =10;
		int a = 10;
		int b = 3;
		float c = 10;
		float d = 3;
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println("	\n=====01");
		System.out.println("score:"+ score);
		System.out.println("ch:"+ ch);
		System.out.println("hi:"+ hi);
		
		score =200;
		
		System.out.println("after score:"+ score);
		System.out.println("MAX:"+ MAX);
		
		System.out.println("	\n=====02");
		System.out.println("\nFtoD:"+ FtoD);
		System.out.println("byteDefault:"+ byteDefault);
		System.out.println("testFloat:"+ testFloat);
		System.out.println("testString:"+ testString);
		System.out.println("test float:"+ testfloat);
		System.out.println("test float to int:" + testfloattoint );
		System.out.println("test int to char:" + (char)toChar);
		System.out.println("test int to byte:" +testinttobyte );
		
		System.out.println("	\n=====03");
		System.out.println("\nafter j=i++: i=:" +i + ",j=" +j);
		i=5;
		j=++i;
		System.out.println("after j=++i: i=" +i + ",j=" +j);
		System.out.println("	\n=====04");
		
		System.out.println("\nafter unaryOp++:" +unaryOp);
		
		unaryOp++;
		unaryOp++;
		System.out.println("after ++unaryOp:" +unaryOp);
		
		unaryOp--;
		System.out.println("\nafter unaryOp++:" +unaryOp);
		unaryOp++;
		System.out.println("after ++unaryOp:" +unaryOp);
		
		System.out.println("	\n=====05");
		
		System.out.println("\nafter +signOp:" +signOp);
		signOp=-signOp;
		System.out.println("after -signOp:" +signOp);	
		System.out.println("	\n=====06");
		power = !power;
		
		System.out.println("after power = !power : " +power);
		power = !power;
		System.out.println("after power = !power : " +power);	
		
		System.out.println("	\n=====07");
		System.out.println("\nbitOp:" +bitOp); 
		bitOp=-bitOp;
		bitOp--;
		System.out.println("~bitOp:" +bitOp);
		System.out.println("	\n=====08");
		System.out.println("\na:" +a);
		System.out.println("b:" +b);
		System.out.println("c:" +c);
		System.out.println("d:" +d);
		System.out.println("\na/b:" +(a/b));
		System.out.println("c/d:" +(c/d));
		System.out.println("a/d:" +(a/d));
		
		System.out.println("10/8= " +(10/8));
		System.out.println("10%8= " +(10%8));
		
		System.out.println("ch1:" + ch1);
		
		System.out.println("ch2:" +(int)ch2);
		ch2 = (char)(ch1+1);
		System.out.println("ch2:" +(char)ch2);
		System.out.println("B-A: " +((char)ch2-(char)ch1));
		System.out.println("8<<1:" +(8<<1));
		System.out.println("7>>1:" +(7>>1));
		System.out.println("	\n=====09");
		i=12;
		j=6;
		System.out.println("\ni&j:" +(i&j));
		System.out.println("i|j:" +(i|j));
		System.out.println("i^j:" +(i^j));
		System.out.println("	\n=====10");
		
		System.out.println("\ntrue || true : " +(true || true) );
		System.out.println("true || false : " +(true || false) );
		System.out.println("false || false : " +(false || false) );
		System.out.println("true && true : " +(true && true) );
		System.out.println("true && false : " +(true && false) );
		System.out.println("false && false : " +(false && false) );
		System.out.println("	\n=====11");
		String pass = i >= 10 ?" 合格 ": "不合格";
		System.out.println("\n " +pass );
		
		
	}
	
		
}

