package objectExercise;

public class Main {

	public static void main(String[] args) {
		    Apartment apartment = new Apartment("いい感じアパートメント", "山田　マンション太郎", "マンション", "50000000円", "間取り", "3LDK");
		    apartment.greeting();

		    Land land = new Land("いい感じの土地", "山田　土地太郎", "土地", "8000000円", "広さ", "105.2㎡");
		    land.greeting();
		    
		    Property.set();
		    Property.get();
		    
	}

}
