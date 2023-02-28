package custom;

public class Customer {
	private int  custno;
	private String custname;
	private String custaddr;

		public void Init()
		{
			custno=10;
			custname="Ram";
			custaddr="Hyd";	
		}
		public void display(int no,String name,String addr)
		{
			
			System.out.println("custno:"+no);
			System.out.println("custname:"+name);
			System.out.println("custaddr"+addr);
			
		}
	
	
	
	

}
