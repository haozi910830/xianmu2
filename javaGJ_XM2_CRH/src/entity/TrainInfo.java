package entity;

public class TrainInfo {
	private String Trips;
	private double Price;
	private int number;
	public TrainInfo(String trips, double price, int number) {
		super();
		Trips = trips;
		Price = price;
		this.number = number;
	}
	public TrainInfo() {
		super();
	}
	public String getTrips() {
		return Trips;
	}
	public void setTrips(String trips) {
		Trips = trips;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "TrainInfo [Trips=" + Trips + ", Price=" + Price + ", number=" + number + "]";
	}


}
