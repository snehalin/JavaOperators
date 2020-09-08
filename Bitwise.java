
public class Bitwise {

	public static void main(String[] args) {
		int a=10;//
		int b=20;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		a=10;
		System.out.println(~a);
		
		//1010 ->0101
		
		//          32 16 8 4 2 1
		//           0  0 1 0 1 0      10
	   
	//1 byte=8 bits
	//4 byte =32 bts	
		//000000000000000000000....0..001010
	//	  111111111111111111111....1..110101
	//	2's compliment=1'scompliment+1  
	//	11111111111111111111....1..110101 
	//	00000000000000000000....0..001010
	//+ 00000000000000000000....0..000001 
	//  00000000000000000000....0..001011
	//	-11
		
		a=20;
		System.out.println(~a);
		
		
		//int x=-30;
		//System.out.println(x>>>25);
		
		
		}
}