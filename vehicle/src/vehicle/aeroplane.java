package vehicle;

public class aeroplane extends air {
	
	int sp ;
	int running ; 
	public void get(int a, int b)
	{
	sp=a;
	running=b;
	}

	
	public void speed() {
		System.out.println(sp);
		
	}
	
	public void  isrunning() {
		if(running==1)
		{System.out.println("is running");
		
		}
		else System.out.println("not running");
	}
	


}
