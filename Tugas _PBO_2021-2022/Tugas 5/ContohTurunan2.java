import java.util.Scanner;

class persegi {
	public int panjang ;
	public int lebar;
	
	public persegi () {}
	
	//persegi (sama sisi)
	public persegi (int sisi) {
		this.panjang = sisi;
		this.lebar = sisi;
		}
		
	//persegi panjang (tidak sama sisi)
	public persegi (int panjang, int lebar) {
			this.panjang = panjang;
			this.lebar = lebar;
			}
			
	protected int luas () {
	return this.panjang * this.lebar;
	}
	
}

class kotak extends persegi{
	public int tinggi;
	
	// kubus (sama sisi)
	public kotak (int sisi) {
		this.panjang = sisi;
		this.lebar = sisi;
		this.tinggi = sisi;
		}
		
	public kotak( int panjang, int lebar, int tingg ) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
		}
		
	public int volume () {
		return this.luas() * tinggi;
		}
		
}

class ContohTurunan2{
	public static vloid main (String [] args) {
			Scanner scanner = new Scanner (System.in);
		
			int jenis_bidang = 0;
			
	while(true) {
		System.out.println("1. persegi (Datar)\n2. (Ruang)\npilih jenis bidang: ");
		int imput = scanner.nextInt();
		
		if (input == 1 || input == 2) {
			jenis_bidang = input;
			break;
			}
			
		}
		
	boolean is_sama_sisi = false;
	
	while(true){
		System.out.println("2. ya \n2. tidak\nApakah sama sisi?");
		int input = scanner.nextInt();
		
	if (input == 1 || input == 2){
		if (input == 1)
		is_sama_sisi = true;
		
	break;
	}
	
	}
	
	persegi persegi;
	Kotak kotak;
	
if(jenis_bidang == 1 && is_sama_sisi){
// hitung luas persegi (sama sisi)
System.out.println("masukan sisi: ");
int sisi = scanner.nextInt();

Persegi = new persegi (sisi) ;
System.out.println("Luas persegi adalah " + persegi.luas());
}
else if(jenis_bidang == 1){
	// hitung luas persegi panjang (tidak sama sisi)
	system.out.print("Masukan panjang:");
	int panjang = scanner.nextInt ();
	System.out.print("Masukan lebar:");
	
	persegi = new Persegi(panjang, lebar);
	System.out.println ("Luas persegi panjang adalah" + persegi.luas());
}
else if (jenis_bidang == 2 && is_sama_sisi){
	// hitung luas kubus (sama sisi)
	system.out.print ("masukan sisi: ");
	int sisi = scanner.nextInt();
	 
	kotak = new Kotak (sisi);
	Sytem.out.println ("Volume kubus adalah" + kotak.volume());
	}
else{
	// hitung luas balok (tidak sama sisi)
	system.out.println("masukan panjang: ");
	int panjang = scanner.nextInt ();
	system.out.print("masukan lebar: ");
	int lebar = scanner.nextInt();
	system.out.print("masukan tinggi: ");
	int tinggi = scanner.nextInt();
	
	kotak = new kotak (panjang, lebar, tinggi);
	system.out.println("volume balok adalah " + kotak.volume());
	
	}
	}
}
