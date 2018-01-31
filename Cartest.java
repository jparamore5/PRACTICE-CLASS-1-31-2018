package carclas;

public class Cartest {

	public Cartest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Carfacts car1 = new Carfacts("mustang",1500,1992);
		System.out.println(car1.carBrand);
	
	Carfacts car2 = new Carfacts("Ferrari",88000,1996);
	System.out.println(car2.carBrand);
	car2.carBrand = "Nissan";
	System.out.println(car2.carBrand);
	
	
	

	}

}
