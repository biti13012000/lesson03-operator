package BiTi.dev;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		//bai2.1
		int a=5;
		int b=6;
		System.out.println("Tong:" + (a+b));
		System.out.println("Hieu:" + (a+b));
		System.out.println("Tich:" + (a*b));
		System.out.println("Thuong:" + (a/b));
		//bai2.2
		float d,e,f,delta,x1,x2;
		d=1;
		e=2;
		f=0;
		delta = e*e-4*d*f;
		if(delta>0) {
			x1= (float) ((-e +Math.sqrt(delta)) / (2*d));
			x2= (float) ((-e -Math.sqrt(delta)) / (2*d));
			System.out.println("Phuong trinh co 2 nghiem x1=" +x1+", x2="+x2);
		} else {
			if (delta==0) {
				x1=-e/f;
				System.out.println("Phuong trinh co nghiem kep x1="+x1);
				
			} else {
				System.out.println("PT vo nghiem");
			}
			
			
		}
			
	}
}
