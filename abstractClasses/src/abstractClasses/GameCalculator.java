package abstractClasses;
// abstract class ta temel amaç bir methodu bütün alt sýnýflar için
// kullanýlýr olmasýný istiyorsak ve kurallarýný onlara has bir þekilde flexible
// durumlara açýk býrakmak istiyorsak "abstarct" ifadesi büyük önem taþýyor.
public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
