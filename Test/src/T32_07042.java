import java.util.Scanner;
public class T32_07042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("-------��ȭ��Ϸ------");
		System.out.println("���ȭ(1.���� 2.ʯͷ 3.����");
		int person=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		String Marks="ȭͷ";
		String Marks2="ȭͷ";
		switch(person){
		case 1:
		Marks="����";
		break;
		case 2:
		Marks="ʯͷ";
		break;
		case 3:
		Marks="��";
		break;
		}
		switch(computer){
		case 1:
		Marks2="����";
		break;
		case 2:
		Marks2="ʯͷ";
		break;
		case 3:
		Marks2="��";
		break;
		}
		if(person==computer){
		System.out.println("������ǣ�"+Marks+"���Գ����ǣ�"+Marks2+"ƽ��");
		}else if(person==1&&computer==2||person==2&&computer==3||


		person==3&&computer==1){
		System.out.println("������ǣ�"+Marks+"���Գ����ǣ�"+Marks2+"������");
		}else{
		System.out.println("������ǣ�"+Marks+"���Գ����ǣ�"+Marks2+"��Ӯ��");
		}
	}
		
	

}
