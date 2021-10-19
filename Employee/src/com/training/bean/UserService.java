package com.training.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class UserService {
	static Scanner sc=new Scanner(System.in);
	List<User> lst=new ArrayList<User>();
	public  void add() {
		User ashwin = new User(111,"ashwin","ashwin@gmail.com");
		User bharadwaj=new User(222,"bharadwaj","bharadwaj@gmail.com");
		User vishal=new User(333,"vishal","vishal@gmail.com");
		lst.add(ashwin);
		lst.add(bharadwaj);
		lst.add(vishal);
		System.out.print("\nRecord added..");
	}


	public void delete() {
			String choice="Y";
		int obj;
		while(choice.equalsIgnoreCase("y")){
		System.out.println("enter employee object to delete: ");
		obj=sc.nextInt();
		
		lst.remove(obj);
		
		System.out.println("you want to continue :y or no :n");
		choice=sc.next();
		}
		System.out.println("employee is removed :");
	}	
public void displayAllEmployees(){
	ListIterator li=lst.listIterator();
	System.out.println("employee in details");
	while(li.hasNext()){
		System.out.printf("\n"+li.next());
	}	
  }
public void searchEmployee(){
	int obj;
	System.out.println("enter employee object to search: ");
	
	obj=sc.nextInt();
	lst.indexOf(obj);
	System.out.println("employee in the index of :"+lst.indexOf(obj));
}
	public static void main(String[] args) {
		UserService obj1=new UserService();
		int choice;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.print("\n============operations=============\n");
			System.out.print("\n1. add");
			System.out.print("\n2. show");
			System.out.print("\n3. delete");
			System.out.print("\n4. search");
			System.out.print("\n0. exit\n");
			System.out.print("\nEnter your choice (0-4)");
			choice=sc.nextInt();
			switch(choice){
			case 1:
		obj1.add();
		break;
			case 2:
		obj1.displayAllEmployees();
		break;
			case 3:
		obj1.delete();
		break;
			case 4:
		obj1.searchEmployee();
		break;
			case 0:
				System.out.print("\nTerminated");
			default:
				System.out.print("\ninvalid option");
		}
		
	}while(choice!=0);
}

	
}	
	

