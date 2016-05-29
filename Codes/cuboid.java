class cuboid{
	float length;
	float width;
	float height;

	cuboid(float l, float w, float h){
		length = l;
		width = w;
		height = h;
	}

	public double area(){
		return ((2*length*width)+(2*length*height)+(2*height*width));
	}

	public double volume(){
		return (width*height*length);
	}
}
