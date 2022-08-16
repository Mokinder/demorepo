package Assignments;

public class Employeewages {
	
	int wageprhr =20;
	int noofwrkdays = 20;
	int maxratemon = 100;
	int fullhr=8;
	int parthr=4;
	int attend;
	int totalemphr=0;
	int totalwrkdays=0;
	int emphrs;
	int totalsalary;
	int dailywages []=new int [100];
	
	int getworkhrs(int n)
	{
		  switch(n) 
		   {
		     case 1: emphrs=fullhr;break;
		     case 2: emphrs=parthr;break;
		     default: emphrs=0 ;
		   }
		  return emphrs;
	}
	void attendence()
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
	int getempwage(int n)
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


