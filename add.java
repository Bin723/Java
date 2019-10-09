package exercise5;
public class add {
	public double real1;
	public double real2;
	public double image1;
	public double image2;
	
	add(double real1,double real2,double image1,double image2){
		this.real1=real1;
		this.real2=real2;
		this.image1=image1;
		this.image2=image2;
	}
	
	public double add1() {
		return real1+real2;
	}
	public double add2() {
		return image1+image2;
	}
}
