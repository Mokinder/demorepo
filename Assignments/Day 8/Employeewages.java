package Assignments;

public class Employeewages {
	
	static int wageprhr =20;
	static int noofwrkdays = 20;
	static int maxratemon = 100;
	static int fullhr=8;
	static int parthr=4;
	static int attend;
	static int totalemphr=0;
	static int totalwrkdays=0;
	static int emphrs;
	static int totalsalary;
	static int dailywages []=new int [100];
	
	static int getworkhrs(int n)
	{
		  switch(n) 
		   {
		     case 1: emphrs=fullhr;break;
		     case 2: emphrs=parthr;break;
		     default: emphrs=0 ;
		   }
		  return emphrs;
	}
	static void attendence()
	{
	  double ran = Math.random();
	  
	  if(ran>=0.5)
	  {
	    	attend=1;
	  }
	  else if(ran<0.5)
	  {
	    	attend =2;
	  }
	  else
	  {
		  attend=0;
 	  }
	}
	static int getempwage(int n)
	{
		return (n*20);
	}
	
	public static void main(String[] args) {
		
		Employeewages e=new Employeewages();
				
		while((e.totalemphr < e.maxratemon)&&(e.totalwrkdays < e.noofwrkdays))
		{
			e.totalwrkdays++;
			e.attendence();
			e.getworkhrs(e.attend);
			e.totalemphr += e.emphrs;
			e.dailywages[e.totalwrkdays]=e.emphrs*e.wageprhr;
		}
		e.totalsalary=e.getempwage(e.totalemphr);
		for(int i=0;i<e.totalwrkdays;i++)
		{
		  System.out.println(e.dailywages[i]);
		}
		System.out.println("The total salary is : "+e.totalsalary);
	}

}


