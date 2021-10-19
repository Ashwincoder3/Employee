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
        int id;
        String name;
        String email;
        System.out.println("Enter id:");
        id=sc.nextInt();
        System.out.println("Enter Name:");
        name=sc.next();
        System.out.println("Enter email:");
        email=sc.next();
        User user= new User(id, name, email);
        lst.add(user);
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
public void searchUser(){
	boolean found=false;
	System.out.print("\nenter employee id to search: ");
	int id=sc.nextInt();
	Iterator it=lst.iterator();
	while(it.hasNext()) {
		User use=(User)it.next();
		if(use.getUserUd()== id) {
			System.out.print("\n"+use+"\nemployee is present");
			found=true;
		}
	}if(!found) {
		System.out.println("employee is not present in list");
		
	}
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
		obj1.searchUser();
		break;
			case 0:
				System.out.print("\nTerminated");
					break;
			default:
				System.out.print("\ninvalid option");
		}
		
	}while(choice!=0);
}

	
}	
	

