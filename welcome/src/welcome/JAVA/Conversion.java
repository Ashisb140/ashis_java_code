package welcome.JAVA;

public class Conversion {

	public static void main(String[] args) {
	
		float ekm = 0.62137119f ;
		int b=110;
		float bkm= (float) (b*0.62137119);
		System.out.println("1km= "+ekm+" "+"miles");
		System.out.println("110Km= "+bkm+" "+"miles");
		System.out.println();
		float miles= 1.609344f;
		int c=14;
		float ckm= (c*1.609344f);
		System.out.println("1 mile= "+miles+" "+"km");
		System.out.println("14 miles= "+ckm+" "+"km");
		System.out.println();
		float akm = 3280.84f;
		int a=15;
		float Km= (a*akm);
		System.out.println("1km= "+akm+" "+"feet");
		System.out.println("15km= "+Km+" "+"feet");
		System.out.println();
		float ft=0.0003048f;
		int d=45;
		float dft= d*0.0003048f;
		System.out.println("1ft= "+ft+" "+"km");
		System.out.println("45ft= "+dft+" "+"km");
		System.out.println();
		float p= 2.2f;
		int k=56;
		float g= k*p;
		System.out.println("1kg= "+p+" "+"pound");
		System.out.println("56kg= "+g+" "+"pound");
		System.out.println();
	
		float o= 0.454f;
		int u=88;
		float n=o*u;
		System.out.println("1pound= "+o+" "+"kg");
		System.out.println("88pound= "+n+" "+"kg");
	}

}
