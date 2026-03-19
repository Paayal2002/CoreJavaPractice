package com.Oops;
public class MainClass {
	public static void main(String args[]) {
		
//		Q1. Create a class Laptop
//		Variables → brand, ram
		
//		Q2. Create a class Employee
//		Variables → id, name, salary
		
//		Q3. Create a class Car
//		Variables → model, price, color
		
//		Q4. Create a class Book
//		Variables → title, author, price


		Laptop L1 = new Laptop();
		
		L1.brandName = "Lenovo";
		L1.ram = "4 GB";
		System.out.println("BrandName: " +L1.brandName);
		System.out.println("Ram : " +L1.ram);
		
		
		System.out.println("----------------------------------------");
		
		Employee E1 = new Employee();
		
		E1.id= 1;
		E1.name ="Payal";
		E1.salary = 500000;
		
		System.out.println("id: " +E1.id);
		System.out.println("name : " +E1.name);
		System.out.println("salary: " +E1.salary);
		
		
		System.out.println("----------------------------------------");
		
		Car C1 = new Car ();
		
		C1.model ="TATA";
		C1.color ="White";
		C1.price =40000;
		System.out.println("model: " +C1.model);
		System.out.println("color : " +C1.color);
		System.out.println("price: " +C1.price);
		
		
		System.out.println("----------------------------------------");
		
        Book B1 = new Book ();
		
		B1.title ="The Glass Palace";
		B1.author ="Amitav Ghosh";
		B1.price =550;
		System.out.println("title: " +B1.title);
		System.out.println("author : " +B1.author);
		System.out.println("price: " +B1.price);  
		

		System.out.println("----------------------------------------");
		
		
	}

}
