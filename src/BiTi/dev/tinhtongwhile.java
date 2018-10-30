package BiTi.dev;

public class tinhtongwhile {
	public static void main(String[] args) {
		int Tong = 0 ;
		int i = 0;
		
		while(i <= 100) {
			Tong += i; 
			i++;
		}
		System.out.println("Tong vong lap while:" + Tong);
	}
}
