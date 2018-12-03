/*
 * Represents a complex number
 */
class Complex {
	private double j;
	private double i;

	//constructor
	Complex(double j, double i) {
		this.j = j;
		this.i = i;
	}
	
	//printme - from java2git
	public String toString() {
		return j + " " + i + "i";
	}
	public double getJ(){ return j; }
	public double getI(){ return i; }
	public void setJ(double j){ this.j=j; }
	public void setI(double i){ this.i=i; }
}
