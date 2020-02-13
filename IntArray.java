
public class IntArray extends Data{
	Int a[];
	int sizeList[]; 
	
	IntArray(Int a[], int sL[])
	{
		this.a = a; 
		this.sizeList = sL; 
//		System.out.println(Arrays.toString(sizeList));
	}

	@Override
	Data cloneData() {
		// TODO Auto-generated method stub
		return this;
	}
}
