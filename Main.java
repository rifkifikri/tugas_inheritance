
public class Main {
	public static void main(String[] args) {
		MejaParents meja= new MejaParents();
		 
			meja.namaToko();
			meja.meja();
		
		MejaKerja kerja= new MejaKerja();
			kerja.namaToko();
			kerja.meja();
			kerja.mejaKerja();
		
		Kantor kantor= new Kantor();// inherit anak dari meja kerja
			kantor.namaToko();
			kantor.meja();
			kantor.mejaKerja();
			kantor.mejaKantor();
		
		Toko toko= new Toko();
			toko.namaToko();
			toko.meja();
			toko.mejaKerja();
			toko.mejaToko();
		
		MejaSantai santai= new MejaSantai();
			santai.namaToko();
			santai.meja();
			santai.mejaSantai();
		RuangTamu ruangTamu = new RuangTamu();
			ruangTamu.namaToko();
			ruangTamu.meja();
			ruangTamu.mejaSantai();
			ruangTamu.ruangTamu();
		Halaman mejaHalaman = new Halaman();
			mejaHalaman.namaToko();
			mejaHalaman.meja();
			mejaHalaman.mejaSantai();
		mejaHalaman.mejaHalaman();
		
		
	}
}
