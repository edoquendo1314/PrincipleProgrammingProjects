
public class FloatArray extends Data {
	Floatp a[];
	int sizeList[];
	
	FloatArray(Floatp a[], int arr[])
	{
		this.a = a; 
		this.sizeList = arr; 
	}

	@Override
	Data cloneData() {
		// TODO Auto-generated method stub
		return this;
	}
}
