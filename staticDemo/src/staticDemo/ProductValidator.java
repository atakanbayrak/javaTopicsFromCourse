package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Yapýcý Blok Çalýþtý");
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

/* 6. satýrda görüldüðü gibi class new lenmeden çaðýrýlabilir fakat 
 * bu kullaným sonrasýnda bellekte tutulan deðerler kaybedilmediðinden manager classlar için saðlýklý bir kullaným deðildir
 * bunun yerine yalnýzca utility araçlarýnda kullanýlýr ve yaygýn deðildir
 * bir class static yapýldýðýnda class ismiyle direkt çaðýrýlýr.
 * */