import java.util.Arrays;

final class NewIntArray extends Instruction
{
	int sizeList;
	Int a[];
	IntArray arrayObj;
	int n;
	
	public NewIntArray(int n)
	{
		this.n = n; 
		this.sizeList = 1; 
	}

	@Override
	String instName() {
		// TODO Auto-generated method stub
		return "newIntArray";
	}

	@Override
	void execute() {
		// TODO Auto-generated method stub
		int n = this.n; 
		int item; 
		int e_i; 
		int arrTemp[] = new int[n];
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			item = ((Int)VM.opStack[VM.top]).val;
			arrTemp[i] = item; 
			this.sizeList *= item; 
			e_i = ((Int)VM.opStack[VM.top]).val - n + item;
			if(e_i <= 0)
			{
				VM.runtimeError(3, VM.pc, toString(), 0);
			}
			VM.opStack[VM.top] = null; 
			VM.top--; 
		}
		int arrSize = n;
		for(int i = 0; i < arrSize; i++, n--)
		{
			arr[i] = arrTemp[n-1];
			
		}
		
		a = new Int[sizeList]; 
		arrayObj = new IntArray(a, arr);
		
		VM.top++; 
		VM.opStack[VM.top] = (Data) arrayObj;
		VM.pc++;
	}

}
