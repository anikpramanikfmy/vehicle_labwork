package vehicle;

public class bus extends land {
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
