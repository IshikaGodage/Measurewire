class cube{
	float length;

	cube(float l){
		length = l;
	}

	public float area(){
		return 6*length*length;
	}

	public float volume(){
		return length*length*length;
	}
}