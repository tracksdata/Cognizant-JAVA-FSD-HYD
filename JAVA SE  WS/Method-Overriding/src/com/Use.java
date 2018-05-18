package com;

public class Use {

	public static void main(String[] args) {
		
		/*Java j=new Java();
		j.doTeach();
		
		Php p=new Php();
		p.doTeach();
		
		JavaScipt js=new JavaScipt();
		js.doTeach();*/
		
		//--------------------------------------------
		
		Teacher teach;
		teach=new Java(); 
		
		teach.calc(100, 200);
		teach.doTeach();
		
		teach=new Php();
		teach.doTeach();
		
		
		teach=new JavaScipt();
		teach.doTeach();
		
		//teach.practiceLab();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
