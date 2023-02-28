
public class Customers {
	private int custno;
	private String custName;
	private String custAddr;
	public int setcustno(int custno)
	{
		this.custno=custno;
		return custno;
	}
	public int setcustName(String custName)
	{
		this.custName=custName;
		return custName;
	}
	public int setcustAddr(String custAddr)
	{
		this.custAddr=custAddr;
		return custAddr;
	}
	public  int getcustno()
	{
		return custno;
	}
	public String getcustName()
	{
		return custName;
	}
	public String getcustAddr() 
	{
		return custAddr;
	}
	
		
		
		public void Customers()
		{
			System.out.println("enter the value custno>>");
			input.nextLine();
			custno=input.nextLine();
			
		
		}
		
	}

}
