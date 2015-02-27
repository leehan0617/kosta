package ch09;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class Exam94 {
	public static void main(String[] args) {
		FF f=new FF(10,20);
		Class<?> myClass=f.getClass();
		
		String className=myClass.getName();
		
		System.out.println("className" + className);
		
		Field[] field=myClass.getDeclaredFields();
		for(int i=0;i<field.length;i++){
			System.out.println("field:"+field[i]);
		}
		
		Method[] method=myClass.getDeclaredMethods();
		for(int i=0;i<method.length;i++){
			System.out.println("method:"+method[i]);
		}
		
		Class<?> superClass=myClass.getSuperclass();
		String superClassName=superClass.getName();
		System.out.println(superClassName);
		
		Date d=new Date();
		Class<?> dateClass=d.getClass();
		Field[] dateField=dateClass.getDeclaredFields();
		for(int i=0;i<dateField.length;i++){
			System.out.println("dateField:" + dateField[i]);
		}
		
	}
}
