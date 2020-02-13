import java.util.Arrays;

final class Int extends Data
{
	int val;
//	Int a[];
//	int sizeList[]; 
	
	Int(int i)
	{
		val = i;
	}
//	
//	Int(Int a[], int sL[])
//	{
//		this.a = a; 
//		this.sizeList = sL; 
////		System.out.println(Arrays.toString(sizeList));
//	}
//	
	public String toString()
	{
		return String.valueOf(val);
	}

	Int cloneData()
	{
		return new Int(val);
	}
}
