package com.phone;

public class OperatingSystemFactory {
public os getInstance(String s)
{
	if(s.equals("This is Android os"))
			{
		  return new Android();
			}
	else if(s.equals("This is IOS"))
	{
		return new IOS();
	}
	else
		return new Window();
}
}
