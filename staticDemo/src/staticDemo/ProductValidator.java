package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Yap�c� Blok �al��t�");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static class InnerClass{
		public static void Ekle() {
			
		}
	}
	
}

/* 6. sat�rda g�r�ld��� gibi class new lenmeden �a��r�labilir fakat 
 * bu kullan�m sonras�nda bellekte tutulan de�erler kaybedilmedi�inden manager classlar i�in sa�l�kl� bir kullan�m de�ildir
 * bunun yerine yaln�zca utility ara�lar�nda kullan�l�r ve yayg�n de�ildir
 * bir class static yap�ld���nda class ismiyle direkt �a��r�l�r.
 * */