class cylinder{
	private double radius;
	private double height;
	private double pi=Math.PI;

	cylinder(double c,double h){
		height = h;
		radius = c/(2*pi);
	}

	public double radiuss(){
		return radius;
	}

	public double area(){
		return 2*pi*radius*radius+2*pi*radius*height;
	}

	public double volume(){
		return pi*radius*radius*height;
	}


}
