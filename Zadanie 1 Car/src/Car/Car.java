package Car;

public abstract class Car {
    protected String kolor;
    private double silnik;
    private int drzwi;



public Car(String kolor, double silnik, int drzwi){

    this.kolor = kolor;
    this.drzwi = drzwi;
    this.silnik = silnik;


}
    public abstract void brake();
    public abstract void turnLeft();

    public void show()
    {
        System.out.println(" Kolor: "+this.kolor);
        System.out.println("Ilosc drzwi: "+this.drzwi);
        System.out.println("pojemnosc silnika: "+this.silnik);

    }
    

	
    public void sygnal() {
        System.out.println("Brymbrytm!!!");
    }
}