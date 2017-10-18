package vehicle;

public class vehicle {
	public static void main(String[] args) {
		car obj=new car();
		obj.get(100, 1);
		obj.speed();
		obj.isrunning();
		
		heli obj2=new heli();
		obj2.get(150, 0);
		obj2.speed();
		obj2.isrunning();
		
		boat obj3=new boat();
		obj3.get(175, 1);
		obj3.speed();
		obj3.isrunning();
		try
		{
			
			ship test=new ship();
			if (test instanceof water ) 
			{
			System.out.println("IT IS A SHIP TYPE OF OBJ");
			}
			if (test instanceof water ) 
			{
			System.out.println("IT RUNS ON WATER");
			}
			if 	(test instanceof vehicle ) 
			{
			System.out.println("IT IS A VEHICLE");
			}
			Exception e=new Exception();
			
			
		}
		catch(Exception e)
		{
			
		}
		
		
		
		
	}
	

}
