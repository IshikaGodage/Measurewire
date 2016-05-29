class sphere{
	double radius;
	private double pi=Math.PI;

	sphere(double c){
		radius = c/(2*pi);
	}

	public double radiuss(){
		return radius;
	}

	public double area(){
		return 4*pi*radius*radius;
	}

	public double volume(){
		return 4*pi*radius*radius*radius/3;
	}
}