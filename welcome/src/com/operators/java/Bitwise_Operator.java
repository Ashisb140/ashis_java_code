package com.operators.java;

public class Bitwise_Operator {

	public static void main(String[] args) {
		int r=6 , q=8;//6=110  8=1000
		System.out.println(r|q);//110 | 1000=>1110 14 	
		System.out.println(r&q);//110 & 1000=>0000 0
		System.out.println(r^q);//110 ^ 1000=>1110 14
		System.out.println(~r);//-(n+1)=>-7
		System.out.println(~q);//-(n+1)=>-9
		System.out.println(q>>2);//1000>>2 => 0010 2
		System.out.println(q<<2);//1000<<2 => 100000 32
		System.out.println(r<<2);//110<<2 => 11000 24
		System.out.println(r>>2);//110>>2 => 001 1
		System.out.println();
		int a=23,b=45;// 23 = 10111  45=101101
		System.out.println(a|b);//10111 | 101101=>111111 63
		System.out.println(a&b);//10111 & 101101=>0
		System.out.println(a^b);//10111 ^ 101101=>111010 58
		System.out.println(~a);//-(n+1) -24
		System.out.println(~b);//-(n+1) -46
		System.out.println(a>>45);//10111>>45 0
		System.out.println(a>>4);//10111>>4 00001 1
		System.out.println(a<<4);//10111<<4 101110000 368
		System.out.println(a<<2);//10111<<2 1011100 92
		System.out.println(b<<2);//101101<<2 10110100 180
		System.out.println(b<<5);//101101<<5 10110100000 1440
		System.out.println(b>>7);//101101>>7 000000 0
		System.out.println(b>>5);//101101>>5 000001 1
		System.out.println();		
		int c=65 , d=78;//65=1000001  78=1001110
		System.out.println(c|d);//1000001 | 1001110 1001111 79
		System.out.println(c&d);//1000001 & 1001110 1000000 64
		System.out.println(c^d);//1000001 ^ 1001110 0001111 15
		System.out.println(~c);//-(n+1) -66
		System.out.println(~d);//-(n+1) -79
		System.out.println(c>>45);//1000001>>45 0
		System.out.println(c>>4);//1000001>>4 0000100 4
		System.out.println(c<<4);//1000001<<4 10000010000 1040
		System.out.println(c<<2);//1000001<<2 100000100 260
		System.out.println(d<<2);//1001110<<2 312
		System.out.println(d<<5);//1001110<<5 100111000000 2496
		System.out.println(d>>7);//1001110>>7 0000000 0
		System.out.println(d>>5);//1001110>>5 0000010 2
		System.out.println();
		int e=89, f=34;// 89=1011001  34=100010
		System.out.println(e|f);//1011001 | 100010 1111011 123
		System.out.println(e&f);//1011001 & 100010 0000000 0
		System.out.println(e^f);//1011001 ^ 100010 1111011 123
		System.out.println(~e);//-(n+1) -90
		System.out.println(~f);//-(n+1) -35
		System.out.println(e>>45);//1011001>>45 0
		System.out.println(e>>4);//1011001>>4 0000101 5
		System.out.println(e<<4);//1011001<<4 10110010000 1424
		System.out.println(e<<2);//1011001<<2 101100100 356
		System.out.println(f<<2);//100010<<2 10001000 136
		System.out.println(f<<5);//100010<<5 10001000000 1088
		System.out.println(f>>7);//100010>>7 0000000 0
		System.out.println(f>>5);//100010>>5 000001 1
		System.out.println();
		
	}

}
