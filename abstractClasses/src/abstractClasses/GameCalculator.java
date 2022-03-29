package abstractClasses;
// abstract class ta temel ama� bir methodu b�t�n alt s�n�flar i�in
// kullan�l�r olmas�n� istiyorsak ve kurallar�n� onlara has bir �ekilde flexible
// durumlara a��k b�rakmak istiyorsak "abstarct" ifadesi b�y�k �nem ta��yor.
public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
