package com.custom;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	int value();
}


public class Test {
@MyAnnotation(value=10)
public void sayHello()
{
	System.out.println("Hello Annotation");
}
}
class TestCustomeAnnotation
{
	public static void main(String[] args)throws Exception
	{
		Test t=new Test();
		Method m=t.getClass().getMethod("Say hello");
		MyAnnotation m1 =m.getAnnotation(MyAnnotation.class);
		System.out.println("Value IS:"+m1.value());
	}	
}
