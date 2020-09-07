
public class Ternary {

	public static void main(String[] args) {
		int c=(100>20)?10:20;
      System.out.println("c="+c);
      
      String s=(true&&false)?"hello":"hi";
      System.out.println("s="+s);
      
      int a=10;
      int b=20;
                      //result 1     result2
      int d=(a==20)?(a>b)?(a+b):(a-b) :(a==20)?-3:-4;
      System.out.println("d="+d);
      
      
   //(condition1)?(con2)?stmt1:stmt2:(con3)?stmt3:stmt4;   
                  //RESult 1          //Result 2
      
      
      
      
      int x=(1==2)?(1>2)?100:200:(3>4)?300:400;
      
      
      System.out.println("x="+x);
      
      
	}

}
