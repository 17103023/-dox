import java.io.*;
import java.util.*;
class Bicycle{
	boolean frontWheel;
	boolean realWheel;
	boolean leftBrake;
	boolean rightBrake;
	int gear;
	
	
	void gearUp() {
		gear++;
	}
	void gearDown() {
		gear--;
	}
	void frontStop() {
		leftBrake=true;
	}
	void rearStop() {
		rightBrake=true;
	}
}

public class T32_0703 {

	public static void main(String[] args) {
		System.out.println("	\n=====01");
		int[] score= {100,90,80,70,60,50};
		int[][] intArray={{10,20,30,40}, {50,60,70,80},
				 {90,100,110,120}};
		int intArray2[][]=new int[4][];
		int input;
		System.out.println("size :"+score.length);
		for(int i=0;i<score.length ;i++) {
			System.out.println(score[i]);	
		}
		System.out.println("	\n=====02");
		for(int i:score) {
			System.out.println(i);	
		}
		System.out.println("	\n=====03");
		
		String scoreName[]= {
				"가가","나나","다다","라라"};
		System.out.println(+scoreName.length+"名");
		
		for(String s:scoreName) {
			System.out.println(s);	
		}
		
		System.out.println("	\n=====04");
		
	 
		
		for(int i=0;i<intArray.length;i++) {
			for(int k=0;k<intArray[i].length;k++) {
				System.out.println("intArray["+i+"]["+k+"]="+intArray[i][k]);	
			}
		}
		
		intArray2[0]=new int[3];
		intArray2[1]=new int[2];
		intArray2[2]=new int[3];
		intArray2[3]=new int[2];
		System.out.println("		\n====5-1");
		for (int i=0;i<intArray2.length;i++)
			for (int j=0;j< intArray2[i].length;j++)
				intArray2[i][j]=(i+1)*10+j;
		System.out.println("intArray21's length:"+intArray2.length);
		System.out.println("intArray21[0]'s length:"+intArray2[0].length);
		System.out.println("intArray21[1]'s length:"+intArray2[1].length);
		System.out.println("intArray21[2]'s length:"+intArray2[2].length);
		
		System.out.println("		\n====5-2");
		for (int i=0;i< intArray2.length;i++) {
			for(int j=0;j<intArray2[i].length;j++)
				System.out.print(intArray2[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("	\n=====06");
		
		System.out.println("parameter's counts:"+args.length+"个");
		for(String i:args) {
			System.out.println(i);
			}
		System.out.println("	\n=====08");
		Scanner scan=new Scanner(System.in);
		System.out.println("输入姓名");
		
		System.out.println("姓名是"+scan.next()+"입니다");
		System.out.println("输入学号");
		System.out.println("学号是"+scan.nextInt()+"입니다");
		System.out.println("	\n=====07");
	
	
	InputStreamReader rd=new InputStreamReader(System.in);
	
	try {
		while(true){
			input =rd.read();
			if(input==-1)
				break;
			System.out.println((char)input);
		}
	}catch(IOException e) {
		System.out.println("发生错误");
	}finally {
		System.out.println("输入已完成");
	}
	
	
	System.out.println("	\n=====09");
	try {
		Exception e=new Exception("故意抛出的异常");
		throw e;
		
	}catch(Exception e) {
		System.out.println("错误信息："+e.getMessage());
		e.printStackTrace();
	}
	System.out.println("程序正常结束");
	
	System.out.println("	\n=====10");
		Bicycle liwenying32;
	liwenying32=new Bicycle();
	System.out.println("\n현재가어는"+liwenying32.gear+"단입니다");
	liwenying32.gear=3;
	liwenying32.gearUp();
	System.out.println("현재가어는"+liwenying32.gear+"단입니다");
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
