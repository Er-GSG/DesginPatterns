package com.phone;

public class FactoryMain {
 public static void main (String args[])
 {
	OperatingSystemFactory osf=new OperatingSystemFactory();
	  os obj=osf.getInstance("This is Android os");
	  obj.spec();
	 
 }
}
