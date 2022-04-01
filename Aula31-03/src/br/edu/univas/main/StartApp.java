package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List list = new List();
		
		list.addBook(scan);
		list.addBook(scan);
		list.delBook(scan);
		
		scan.close();
	}
}