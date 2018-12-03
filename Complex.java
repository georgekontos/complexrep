/*
 * Represents a complex number
 */
class Complex {
	private double j;
	private double i;
	private String str;

	//constructor
	Complex(double j, double i) {
		this.j = j;git
		this.i = i;
	}
	
	//printme
	public String toString() {
		return j + " " + i + "i";
	}
	public double getJ(){ return j; }
	public double getI(){ return i; }
	public void setJ(double j){ this.j=j; }
	public void setI(double i){ this.i=i; }
}
