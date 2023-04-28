package com.operators.java;

public class Increment_Decrement {

	public static void main(String[] args) {
		int p=2;
		System.out.println(p++);//p = 2
		System.out.println(p++);//p = 3
		System.out.println(p++);//p = 4
		System.out.println(++p);//p = 6
		System.out.println(++p);//p = 7
		System.out.println(--p);//p = 6
		System.out.println(--p);//p = 5
		System.out.println(p--);//p = 
		System.out.println(p--);//p = 
		System.out.println(--p);//p = 
		System.out.println(--p);//p = 
		System.out.println(); 
		int a = 12;
		System.out.println(--a);//11
		System.out.println(a--);//11
		System.out.println(a--);//10
		System.out.println(--a);//8
		System.out.println(a--);//8
		System.out.println(a++);//7
		System.out.println(a++);//8
		System.out.println(++a);//10
		System.out.println(a++);//10
		System.out.println(++a);//12
		System.out.println(++a);//13
		System.out.println(a++);//13
		System.out.println();
		System.out.println(a++ + a++);//29
		System.out.println();
		int c=10;
		System.out.println(c++ + c++);//21
		System.out.println(c++ + c++);//25
		System.out.println(c++ + ++c);//30
		System.out.println(++c + ++c);//35
		System.out.println(++c + c++);//38
		System.out.println(--c + c--);//38
		System.out.println(c++ * --c);//324
		System.out.println(--c / c++);//1
		System.out.println(--c / ++c);//0
		System.out.println();
		int d=8;
		System.out.println(d++ + d++);//17
		System.out.println(d++ + d++);//21
		System.out.println(d++ + ++d);//28
		System.out.println(++d + ++d);//31
		System.out.println(++d + d++);//34
		System.out.println(--d + d--);//34
		System.out.println(d++ * --d);//240
		System.out.println(--d / d++);//1
		System.out.println(--d / ++d);//0
		System.out.println();
		int e=5;
		System.out.println(e++ + e++);//11
		System.out.println(e++ + e++);//
		System.out.println(e++ + ++e);//28
		System.out.println(++e + ++e);//31
		System.out.println(++e + e++);//34
		System.out.println(--e + e--);//34
		System.out.println(e++ * --e);//240
		System.out.println(--e / e++);//1
		System.out.println(--e / ++e);//0
		System.out.println();
		int q=4;
		System.out.println(q++ + ++q);//10
		System.out.println(q++ + q++);//13
		System.out.println(q-- + q++);//15
		System.out.println(q++ + --q);//16
		System.out.println(--q - ++q);//-1
		System.out.println(++q - q++);//0
		System.out.println(++q * q++);//121
		System.out.println();
		int t=50;
		System.out.println(t++ - t--);//
		System.out.println(t-- + t--);//
		System.out.println(t++ - t--);//
		System.out.println(--t - t++);//
		System.out.println(--t + --t);//
		System.out.println(++t - t++);//
		System.out.println(++t * t--);//
		System.out.println(--t * ++t);//
		System.out.println();
		int l=30;
		System.out.println(l++ - l--);//
		System.out.println(l++ - l--);//
		System.out.println(l-- + l--);//
		System.out.println(--l - l++);//
		System.out.println(++l - l++);//
		System.out.println(--l + --l);//
		System.out.println(++l * l--);//
		System.out.println(--l * ++l);//
		System.out.println(++l * l++);//
		System.out.println();
		int k=40;
		System.out.println(k++ - k--);//
		System.out.println(k++ - k--);//
		System.out.println(k-- + k--);//
		System.out.println(--k - k++);//
		System.out.println(++k - k++);//
		System.out.println(--k + --k);//
		System.out.println(++k * k--);//
		System.out.println(--k * ++k);//
		System.out.println(++k * k++);//
		System.out.println();
		int m=25;
		System.out.println(m++ - m--);
		System.out.println(m++ - m--);
		System.out.println(m-- + m--);
		System.out.println(--m - m++);
		System.out.println(++m - m++);
		System.out.println(--m + --m);
		System.out.println(++m * m--);
		System.out.println(--m * ++m);
		System.out.println(++m * m++);
		System.out.println();
		int z=18;
		System.out.println(z++ - z--);
		System.out.println(z-- + z--);
		System.out.println(z++ - z--);
		System.out.println(--z - z++);
		System.out.println(++z * z--);
		System.out.println(++z - z++);
		System.out.println(--z + --z);
		System.out.println(++z * z--);
		System.out.println(--z * ++z);
		System.out.println(++z * z++);
		System.out.println();
		
	}

}
