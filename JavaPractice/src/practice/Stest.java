package practice;

public class Stest {
	
	 String x;
	 String y;
	
	public Stest() {
		
	}
	
	
	public  void m1(String a) {
		
	   x=a;
		
	}
	
   public void m2(String b) {
	   
	   y=b;
	}
   
   
	
	public static void main(String[] args) {
		Stest obj=new Stest();
		
		obj.m1("SR");
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		
	}

}
