class singa {
     private static String jenis_mamalia = "singa";
     private static int jumlah_kaki =  4;
     
     public static String getJenisMamalia(){
					return jenis_mamalia;
	}
     public static int getJumlahKaki(){
					return jumlah_kaki;
					
	}
	 private static void menyusui(){
					System.out.println("aku menyusui");
					
	}
	private static void melahirkan(){
	System.out.println ("melahirkan");
	}
	
	public static void main (String [] args){
	
						System.out.println(String.format ("jenis mamalia :%s",getJenisMamalia()));
						System.out.println(String.format ("jumlah kaki :%s",getJumlahKaki()));
					    }
	}
					
			
     
     
    
