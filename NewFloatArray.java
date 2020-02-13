
final class NewFloatArray extends Instruction
{   
	int sizeList; 
	Floatp a[];
	FloatArray arrayObj; 
	int n;
	
	
	public NewFloatArray(int n)
	{
		this.n = n; 
		this.sizeList = 1;
	}


	@Override
	String instName() {
		// TODO Auto-generated method stub
		return "newFloatArray";
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
			arrTemp[i] = (int)item; 
			this.sizeList *= item; 
			e_i = (int)(((Int)VM.opStack[VM.top]).val - n + item);
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
		
		a = new Floatp[sizeList]; 
		arrayObj = new FloatArray(a, arr);
		VM.top++; 
		VM.opStack[VM.top] = arrayObj;
		VM.pc++;
	}
}
