package com.oops;
public class OverridingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi = new SBI();
//		System.out.println(rbi.rateOfInterest());
//		RBI rbi2 =new ICICI();
//		System.out.println(rbi2.rateOfInterest());
//		RBI rbi3 =new HDFC();
//		System.out.println(rbi3.rateOfInterest());
	}
}
class RBI{
	public void rateOfInterest() {
		System.out.println("super roi");
	}
}
class SBI extends RBI{
	@Override
	public void rateOfInterest() {
		super.rateOfInterest();
	}
}
class ICICI extends RBI{
	@Override
	public void rateOfInterest() {
		super.rateOfInterest();
	}
}
class HDFC extends RBI{
	@Override
	public void rateOfInterest() {
		super.rateOfInterest();
	}
}