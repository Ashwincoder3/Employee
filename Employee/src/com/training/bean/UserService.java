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
	}


	public void delete() {
		String choice="Y",obj;
		while(choice.equalsIgnoreCase("y")){
		System.out.println("enter employee object to delete: ");
		obj=sc.next();
		User object1 = null;
		object1.setUserName(obj);
		lst.remove(object1);
		
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
	String ob;
	System.out.println("enter employee object to search: ");
	ob=sc.next();
	User object = null;
	object.setUserName(ob);
	lst.indexOf(object);
	System.out.println("employee in the index of :"+lst.indexOf(object));
}
}	
	

