
import java.util.*;
public class T32_07031{  
	 
      public static void main(String[] args)  {
    	  int [][] intArray= {{0,0,0,0,0,0,1,0,0},
					{1,1,1,1,0,0,1,0,0},
					{0,0,0,0,0,0,1,0,0},
					{0,0,0,0,0,0,1,0,0},
					{0,0,0,0,0,0,0,0,0},
					{1,1,0,1,0,0,0,0,0},
					{0,0,0,1,0,0,0,0,0},
					{0,0,0,1,0,0,0,0,0},
					{0,0,0,0,0,1,1,1,0}};
	
	Scanner scan = new Scanner(System.in);
	
	int a= scan.nextInt();
	int b= scan.nextInt();
	if(a==0&&b==0) {
	}
	int[][]score = new int[9][9];
	for(int i=0;i<intArray.length;i++) {
		for (int k=0;k<intArray[i].length;k++) {
			System.out.println("intArray["+i+"]["+k+"]="+intArray[i][k]);
		}
	}
	
	}

} 