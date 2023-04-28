package welcome.JAVA;

public class Variables {

	public static void main(String[] args) {
		int y=3,x=2;
		int a= (3*y)*(y)+(2*x)*(x)*(x);
		System.out.println("1)"+" "+"3y^2+2x^3= "+a);
		System.out.println();
		double b=Math.sqrt(3*y)/Math.sqrt(4*x*x);
		System.out.println("2)"+" "+"sqrt3y/sqrt4x^2= "+b);
		System.out.println();
		System.out.println("3)"+" "+"x^3+sqrty^2= "+x*x*x+Math.sqrt(y*y));
		System.out.println();
		System.out.println("6)"+" "+"3x^2/sqrtx= "+3*x*x/Math.sqrt(x));
		System.out.println();
		double c=Math.sqrt(Math.sqrt(Math.sqrt(4*x)));double d=Math.sqrt(x);
		System.out.println("7)"+" "+"multiple sqrt4x/sqrtx= "+c/d);
		System.out.println();
		double e=Math.pow(5*x, 1.414)+Math.pow(3*x, 1.414);
		System.out.println("4)"+" "+e);
		
	}

}
