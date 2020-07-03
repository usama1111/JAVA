class Manager{
	
	public ImeiNumber ImeiNumber;
	
	public double imeiNumber;
	
	public Manager(){

		ImeiNumber = new ImeiNumber(this);

	};
   



	
}


class ImeiNumber{

	private Manager manager;
	

	public ImeiNumber(Manager manager){

		this.manager = manager;
	}
   
public  String toString(double imeiNumber)
{

return String.format(" %s %.2f" ,"Imei Number" ,imeiNumber);
}	
	
}

class main{


	public static void main(String args[]){

		Manager m = new Manager();
		ImeiNumber p = new ImeiNumber(m);



		System.out.println(p.toString(222.00));
		

	}
}








