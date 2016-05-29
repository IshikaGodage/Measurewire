class prism{
	float a;
	float b;
	float c;
	float height;

	prism(float x, float y, float z, float h){
		a = x;
		b = y;
		c = z;
		height = h;
	}

	public double area(){
		double p = (a+b+c)/2;
		double tArea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return (2*tArea)+(a*height)+(b*height)+(c*height);
	}

	public double volume(){
		return height * Math.sqrt((2*a*a*b*b)-(a*a*a*a)+(2*a*a*c*c)-(b*b*b*b)+(2*b*b*c*c)-(c*c*c*c))/4;
	}
}