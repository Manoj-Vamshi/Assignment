package Assignment;

public class Computer {
	private String Brand;
	private String model;
	private long Serial_Number;
	private double Price;
	
	public Computer(String Br, String md, long sn, double Pr) {
		Brand=Br;
		model=md;
		Serial_Number= sn;
		Price= Pr;	
		
	}
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getSerial_Number() {
		return Serial_Number;
	}
	public void setSerial_Number(long serial_Number) {
		Serial_Number = serial_Number;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	
	
}
