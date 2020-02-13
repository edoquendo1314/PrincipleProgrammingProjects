final class Floatp extends Data
{
	double val;
//	Floatp a[];
//	int sizeList[];

	Floatp(double d)
	{
		val = d;
	}
	
//	Floatp(Floatp a[], int arr[])
//	{
//		this.a = a; 
//		this.sizeList = arr; 
//	}
	
	public String toString()
	{
		return String.valueOf(val);
	}

	Floatp cloneData()
	{
		return new Floatp(val);
	}
}
