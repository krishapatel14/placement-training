package oops;

public class Vehicle {

	private String company,color,fuelType;
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vh=new Vehicle();
		
		vh.setCompany("hero");
		vh.setColor("black");
		vh.setFuelType("petrol");
		
		System.out.println(vh.getCompany());
		System.out.println(vh.getColor());
		System.out.println(vh.getFuelType());
		
		System.out.println(vh);

	}

}
