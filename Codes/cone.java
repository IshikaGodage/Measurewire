class cone{
	private double radius;
	private double height;
	private double angLength;
	private double pi=Math.PI;

	cone(double c, double l){
		angLength = l;
		radius = c/(2*pi);
		height = Math.sqrt((angLength*angLength)-(radius*radius));
	}

	public double radiuss(){
		return radius;
	}

	public double area(){
		return pi*radius*(radius+Math.sqrt(height*height+radius*radius));
	}

	public double volume(){
		return pi*radius*radius*height/3;
	}
}