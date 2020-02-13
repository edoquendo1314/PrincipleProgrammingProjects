
final class Fastore extends Store 
{
	Fastore(int i) 
	{
		super(i);
	}
	
	String instName()
	{
		return "fastore";
	}
	
	@Override
	void execute()
	{
		Floatp e = ((Floatp)VM.opStack[VM.top]);
		VM.opStack[VM.top] = null;
		VM.top--; 
		
		int e_i[] = new int[index]; 
		int eTemp[] = new int[index];
		 for(int i = 0; i < index; i++)
		 {
			 e_i[i] = ((Int)VM.opStack[VM.top]).val;
			 VM.opStack[VM.top] = null; 
			 VM.top--;
		 }
		 
		 FloatArray aref = ((FloatArray)VM.opStack[VM.top]);
		 VM.opStack[VM.top] = null;
		 VM.top--; 
		 
		 int n = 0;
		 for(int i = index-1; i >= 0; i--)
		 {
			 eTemp[i] = e_i[n];
			 n++;
		 }
		
		 int rank = 0;
		 for(int i = 0; i < index; i++)
		 {
			if((eTemp[i] < 0) || (eTemp[i] >= aref.sizeList[i]))
			{
				VM.runtimeError(5, VM.pc, toString(), 0);
				System.exit(0); 
			}
			else
			{
				rank = (rank * (aref.sizeList[i] - 0)) + eTemp[i]; 
			}
		 }
		 
		 aref.a[rank] = e; 
		 VM.pc++; 
	}
}
