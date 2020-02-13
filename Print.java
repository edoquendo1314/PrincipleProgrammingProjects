final class Print extends Instruction
{
	int index; // print value of vars[index]

	Print(int i)
	{
		index = i;
	}

	public String toString()
	{
		return "print "+index;
	}

	String instName()
	{
		return "print";
	}

	void execute()
	{
		
		if(VM.runtimeStack[VM.topR].vars[index] instanceof IntArray) {
			IntArray printInt = (IntArray)VM.runtimeStack[VM.topR].vars[index];
			System.out.print("[");
			for(int i = 0; i < printInt.sizeList.length; i++)
			{
				
				System.out.print(printInt.sizeList[i]);
				
				if(i == printInt.sizeList.length-1)
				{
					break;
				}
				else
				{
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
		else if(VM.runtimeStack[VM.topR].vars[index] instanceof FloatArray)
		{
			FloatArray printInt = (FloatArray)VM.runtimeStack[VM.topR].vars[index];
			System.out.print("[");
			for(int i = 0; i < printInt.sizeList.length; i++)
			{
				
				System.out.print(printInt.sizeList[i]);
				
				if(i == printInt.sizeList.length-1)
				{
					break;
				}
				else
				{
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
		else
		{
			System.out.println(VM.runtimeStack[VM.topR].vars[index].toString());
		}
		VM.pc++;
	}
}
