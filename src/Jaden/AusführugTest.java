
package Jaden;

public class AusführugTest {

	public static void main(String[] args) {
		
		StatistischeAuswertung sa = new StatistischeAuswertung();
		
		System.out.println("Mittelwert: " + sa.Mittelwert(30, 30, 12, 50 , 150, 60));
		
		System.out.println("Median: " + sa.Median(6, 6));
		
		System.out.println("Standardabweichung: " + sa.Standardabweichung(30, 40, 15, 26, 27, 84));

		System.out.println("Minimum: " + sa.min(10, 3, 4, 5, 1, 12, 40));
		System.out.println("Maximum: " + sa.max(10, 3, 4, 5, 1, 12, 40));
		
	}
	
}
