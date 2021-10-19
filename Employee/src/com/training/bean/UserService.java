package com.training.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserService {
	public static void main(String[] args) {
		User us = new User(111,"ashwin","ashwin@gmail.com");
		User us1=new User(222,"bharadwaj","bharadwaj@gmail.com");
		User us2=new User(333,"vishal","vishal@gmail.com");
		String id;
		Scanner sc=new Scanner(System.in);
		List<User> lst=new ArrayList<User>();
		lst.add(us);
		lst.add(us1);
		lst.add(us2);
		System.out.print("\n total number of employees :"+lst.size());
		
		System.out.print("\n  employees details  :\n"+lst);
		System.out.print("\n is no records is there ? : "+lst.isEmpty());
		//System.out.print("\nenter obj to search :");
		//id=sc.next();
		System.out.println("\n user one is available ?"+lst.contains(us));
		lst.remove(0);
		System.out.print("\n  employees details  :\n"+lst);
		Iterator it=lst.iterator();
		while(it.hasNext()) {
			System.out.print("\n"+it.next());
		}
		
	}
	

}
