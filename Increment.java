
public class Increment {

	public static void main(String[] args) {
		int a=10;
		a++;//a=a+1;
		System.out.println(a);
      double d=2.4;
      d++;
      System.out.println(d);
 
      float f=2.6f;
      f--;
      System.out.println(f);
      
      char c='A';
      c++;// c=c+1
      System.out.println(c);
      
      ++c;// c=c+1
      System.out.println(c);
      
      int x=10;
      int y=x++;//y=x  ,x=x+1
      System.out.println("x="+x+"y="+y);
      
      int p=20;
      int q=++p;//p=p+1 q=p
      System.out.println("p="+p+"q="+q);
      
      x=5;
      y=x++ + ++x;
      //  5+7
      //  6
      System.out.println("x="+x+"y="+y);//7 12
      
      a=10;
   int   b= ++a+a--+a++;
       //     11 +11+10
           //       11
   System.out.println("a="+a+"b="+b);
  
   a=5;
   int z=a++ - a++ + a--;
       //  5  - 6 + 7   //6
        // 6
   System.out.println("z="+z);
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
      
      
      
      
      
      
      
      
      
      
      
	}

}
