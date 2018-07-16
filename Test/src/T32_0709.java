import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
public class T32_0709 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\n32 李文颖");
		System.out.println("##fi1.fileInputStream");
		FileInputStream fi1=new FileInputStream("c:/test/test.txt");
		int ch1;
		while((ch1=fi1.read())!=-1)
			System.out.print((char)ch1);
				fi1.close();
	System.out.println("\n##fi2.fileInputStream:byte");
				
		FileInputStream fi2=new FileInputStream("c:/test/test.txt");
		int ch2;	
		byte[]bt=new byte[1024];
		int i=0;
		while((ch2=fi2.read())!=-1) {
			bt[i]=(byte)ch2;
			i++;
		}
			System.out.print(new String(bt));
				fi2.close();
	System.out.println("\n##fi3.fileReader");		
			FileReader fReader=new FileReader("c:/test/test.txt");
			BufferedReader bReader=new BufferedReader(fReader);
			String str=null;
			while((str=bReader.readLine())!=null)
			{
				System.out.println(str);
			}
			bReader.close();
			fReader.close();
	System.out.println("##fi4.scanner");
			
			Scanner sc=new Scanner(new File("c:/test/add.txt"));
			int hap=0,value=0;
			while(sc.hasNext()) {
				value=sc.nextInt();
				System.out.println("값 :"+value);
				hap +=value;
			}
			System.out.println("합계 :"+hap);
			sc.close();
		
			System.out.println("\n##fi6.FileWriter");
	
	FileWriter fw6=new FileWriter("c:/test/fi6.txt");
	Scanner sc6=new Scanner(System.in);
	String str6=null;
	while(!(str6=sc6.nextLine()).equals(""))
	fw6.write(str6+"/n/n");
	fw6.close();
	
	
	System.out.println("##fi5.FileOutputStream");
			
	FileOutputStream fos=new FileOutputStream("c:/test/fi5.txt");
		int ch;
		while((ch=System.in.read())!=13)
			fos.write((byte)ch);
		fos.close();
	System.out.println("##File output Finished");
		
	System.out.println("\n##fi7.FileCopy");	
	FileInputStream fi7=new FileInputStream("c:/Windows/win.ini");
	FileOutputStream fo7=new FileOutputStream("c:/test/fi7.txt");
	int ch7;
	while((ch7=fi7.read())!=-1)
		fo7.write((byte)ch7);
	System.out.println("복사 완료");
	fi7.close();
	fo7.close();
	
	
	
	System.out.println("\n##fi8.FileCopy");
	
	FileInputStream fi8=new FileInputStream(args[0]);
	FileOutputStream fo8=new FileOutputStream(args[1]);
	int ch8;
	
	while((ch8=fi8.read())!=-1)
		fo8.write((byte)ch8);
	System.out.println("복사 완료");
	fi8.close();
	fo8.close();
	
	
	
	}

}
