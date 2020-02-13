
final public class Iaload extends Load 
{
	Iaload(int i) 
	{
		super(i);
	}
	
	String instName()
	{
		return "iaload";
	}
	
	@Override
	void execute()
	{
		 int e_i[] = new int[index]; 
		 int e[] = new int[index];
		 for(int i = 0; i < index; i++)
		 {
			 e_i[i] = ((Int)VM.opStack[VM.top]).val;
			 VM.opStack[VM.top] = null; 
			 VM.top--;
		 }
		 
		 int n = 0;
		 for(int i = index-1; i >= 0; i--)
		 {
			 e[i] = e_i[n];
			 n++;
		 }
		 
		 IntArray aref = ((IntArray)VM.opStack[VM.top]); 
		 VM.opStack[VM.top] = null;
		 VM.top--; 
		 
		 int rank = 0;
		 for(int i = 0; i < index; i++)
		 {
			rank = (rank * (aref.sizeList[i] - 0)) + e[i]; 
			
			if((e[i] < 0) || (e[i] >= aref.sizeList[i]))
			{
				VM.runtimeError(5, VM.pc, toString(), 0);
				System.exit(0); 
			}
		 }
		 VM.top++;
		 VM.opStack[VM.top] = aref.a[rank].cloneData();  
		 VM.pc++;
	}
}
