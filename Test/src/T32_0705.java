class Data{
	int x;
}
class PrivateRestrict_32{
	
	private String Name="  32 private li";
	
}
class ProtectedRestrict_01{
	protected String name="****7.Protexted:32 protected li";
}



public class T32_0705 {
	
	private String name="YUST";
	public static void change(int x) {
		x=1000;
		System.out.println("in_change():x="+x);
	}
	
	
	public static void change(Data d) {
		d.x=1000;
		System.out.println("in_change():x="+d.x);
	}
public static Data copy(Data a) {
	Data tmp=new Data();
	
	tmp.x=a.x;
	a.x=200;
	return tmp;
	
}

public static Data copy_change(Data a) {
	Data tmp=new Data();
	tmp.x=10;
	return tmp;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d=new Data();
		System.out.println("	\n=====01");
		d.x=10;
		System.out.println("in_main():x= "+d.x);
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("in_main():x= "+d.x);
		System.out.println("	\n=====02");
		change(d);
		System.out.println("After change(d)");
		System.out.println("in_main():x= "+d.x);
		System.out.println("in_copy tmp.x="+d.x);
		Data a=copy(d);
		System.out.println("	\n=====03");
		System.out.println("in_copy tmp.x="+d.x);
		Data d2=copy(d);
		System.out.println("d.x="+a.x);
		System.out.println("d2.x="+d2.x);
		
		
		
		System.out.println("	\n=====04");
		Data d3=copy_change(d);
		System.out.println("d.x="+a.x);
		System.out.println("d3.x="+d3.x);
		
		
		T32_0705 pr=new T32_0705();
		System.out.println("****5.private:"+pr.name);
		
		PrivateRestrict_32 pr01=new PrivateRestrict_32();
		
		
		System.out.println("****6.private error:name is not visible");
		ProtectedRestrict_01 ex=new ProtectedRestrict_01();
		System.out.println(ex.name);
	
		
	
	
	
	
	
	}
}
