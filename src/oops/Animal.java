package oops;

public class Animal {
	//abstraction----data hiding
	//encapsulation---combining all the thing in one place
	//access modifiers---default is default,private,public,protected	
	
	//data members---variables(private)
	private String name,type,food;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
	//methods(public)
	public void setValue() {
		name="dog";
		type="domestic";
		food="mix";
	}
	public void display() {
		System.out.println(name+" "+type+" "+food);
	}
	public static void main(String[] args) {
		Animal an=new Animal();
		
		an.setName("Cat");
		an.setType("Wild");
		an.setFood("milk");
		
		System.out.println(an.getName());
		System.out.println(an.getType());
		System.out.println(an.getFood());
		an.setValue();
		an.display();
	}
	
}
