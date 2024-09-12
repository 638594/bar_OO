package util;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public double feeding() {
		double totalConsumacao = (this.beer * 5)+ (this.softDrink * 3) + (this.barbecue * 7);
		return totalConsumacao;
	}
	
	public double cover() {
		if(feeding()>30) {
			return 0;
		}
		else {
			return 4;
		}
	}
	public double ticket() {
		if(this.gender == 'F') {
			return 8;
		}
		else if(this.gender == 'M') {
			return 10;
		}
		return 0;
	}
	public double total() {
		double total = feeding() + cover() + ticket();
		return total;
	}
}
