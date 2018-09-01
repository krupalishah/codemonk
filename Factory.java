package a1;
import java.lang.*;
import java.util.*;
interface shape
{
    void draw();	
}
class circle implements shape
{ 
	 public void draw()
	{
		System.out.println("this is in the circle");
	}
		
} 
class square implements shape
{ 
	 public void draw()
	{
		System.out.println("this is in the square");
	}
		
} 
class FectoryClass
{
    public shape getshape(String a)
    {
	 if(a.equals("c"))
         return new circle();
         else
         return new square();		 
    }	
}
class Factory
{
   public static void main(String[] args)
   {
	FectoryClass Fc=new FectoryClass();
        shape s1=Fc.getshape("d");
        s1.draw();	   
   }	   
	
}