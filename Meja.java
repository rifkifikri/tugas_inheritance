
public class Meja {
	int price;
	String merk;
	
	//constructor
	public Meja(){
		price=20000;
		
	}
	//instace Method
		void namaToko(){
			System.out.println("=========Toko bejo=========");
		}
	//class method
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int harga) {
		price=harga;
	}
	
	//The main method
	public static void main(String[] args) {
		Meja nama=new Meja();
		nama.namaToko();
		Meja belajar = new Meja();
			belajar.merk="Panasonik";
			belajar.setPrice(100000);
				System.out.println("meja Belajar");
				System.out.println("merk :"+belajar.merk);
				System.out.println("merk :"+belajar.getPrice());
		Meja makan = new Meja();
			makan.merk="dua kelinci";
			makan.setPrice(20000000);
				System.out.println("\nmeja Makan");
				System.out.println("merk :"+makan.merk);
				System.out.println("Harga :"+makan.getPrice());
		Meja kerja = new Meja();
			kerja.merk="Gajah duduk";
			kerja.setPrice(24000000);
				System.out.println("\nMeja kerja");
				System.out.println("merk :"+kerja.merk);
				System.out.println("merk :"+kerja.getPrice());
	}
}
