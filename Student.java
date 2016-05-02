package com.briup.ch04;

public class Student
{
	private long id;
	private String name;
	private String gender;
    private int age;
	private double weight;
	//公共的setter,getter方法
 public void setId(long id){
    this.id = id;
 }
 public long getId(){
	return this.id;
 }	
 public void setName(String name){
	 this.name = name;
 }
 public String getName(){
     return this.name;
 }
 public void setWeight(double weight){
	 this.weight = weight;
 }
 public double getWeight(){
     return this.weight;
 }
}