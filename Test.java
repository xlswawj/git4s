package com.briup.ch04;
import java.math.BigDecimal;


 


public class Test{
	public static void main (String[] args){
 
	 test5();  }
    public static void test3(){
    double a =9.1;
    System.out.println("a="+a);
}   
    public static void test4(){
	double d1 =9.1D;
	float f1 =3.2F;
    System.out.println("d1="+d1);
	System.out.println("f1="+f1);
	System.out.println( d1+f1);}
    public static void test5(){
	//实例化对象
    Student stu1 = new Student();
	//stu1.id = 1001;
	stu1.setId(1001);
    System.out.println(stu1);
	}

	 

     public static void test2(){
	     double a=2.0;
		 double b=1.1;
	System.out.println(a-b);
	BigDecimal b1 = new BigDecimal(Double.toString(a));
	BigDecimal b2 = new BigDecimal(Double.toString(b));
    System.out.println(b1.subtract(b2).doubleValue());
	}
	 
 
}
	/* public static void test1(){
         char c1='A';
    System.out.println(c1);
	     char c2= 'B' ;
    System.out.println(c2);
	     char c3=65;
    System.out.println(c3);
			 }
} */