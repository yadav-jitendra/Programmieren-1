package ex02;

public class Shop {

	public static void main(String[] args) {
		// Shop erzeugen und mit Items füllen
		ShopItem first = new ShopItem("PowerBank", 10.0),
				second = new ShopItem("HDD", 50.0),
				third = new ShopItem("LED", 25.0),
				fourth = new ShopItem("Battery", 6.5);
		
		// --- Hier Code einfügen um Items aufsteigend nach Namen zu sortieren ---
		
		
		// ----------------------------
		System.out.println("Erwarteter output:");
		System.out.println(fourth.toString());
		System.out.println(second.toString());
		System.out.println(third.toString());
		System.out.println(first.toString());
		
		// --- Hier code einfügen um Items absteigend nach Preis zu sortieren ---
		
		
		// ----------------------------
		System.out.println("------------------------");
		System.out.println("Erwarteter output:");
		System.out.println(second.toString());
		System.out.println(third.toString());
		System.out.println(first.toString());
		System.out.println(fourth.toString());
		
	}

}
