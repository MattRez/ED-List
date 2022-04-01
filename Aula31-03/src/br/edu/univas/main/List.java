package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Book;
import br.edu.univas.vo.Node;

public class List {
	
	private Node begin;
	private Node end;
	
	
	public void addBook(Scanner scan) {
		Node node = new Node();
		Book book = new Book();
		book.setName(scan.nextLine());
		node.setBook(book);
		
		if(isEmpty()) {
			begin = node;
			end = node;
		} else {
			System.out.println("Por Favor, Digite uma Opção: ");
			System.out.println("1. Adicionar no Começo");
			System.out.println("2. Adicionar no Final");
			System.out.println("3. Adicionar no Índice");
			int opt = scan.nextInt();
			
			switch (opt) {
			case 1:
				addBookBegin(node);
				break;
			case 2:
				addBookEnd(node);
				break;
			case 3:
				addBookIndex(node);
				break;
			}
		}
		
	}
	
	private void addBookBegin(Node node) {
		node.setPrev(begin);
		begin = node;
	}
	
	private void addBookEnd(Node node) {
		node.setNext(end);
		end = node;
	}
	
	private void addBookIndex(Node node) {
		
	}
	
	
	public Book delBook(Scanner scan) {
		
		if(isEmpty()) {
			
		} else {
			System.out.println("Por Favor, Digite uma Opção: ");
			System.out.println("1. Deletar no Começo");
			System.out.println("2. Deletar no Final");
			System.out.println("3. Deletar no Índice");
			int opt = scan.nextInt();
			
			switch (opt) {
			case 1:
				delBookBegin();
				break;
			case 2:
				delBookEnd();
				break;
			case 3:
				delBookIndex();
				break;
			}
		}
		
		return null;
	}
	
	private void delBookBegin() {
		begin = begin.getNext();
	}
	
	private void delBookEnd() {
		end = end.getPrev();
	}
	
	private void delBookIndex() {
		
	}
	
	public boolean isEmpty() {
		if(begin == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public Book getBook(Scanner scan) {
		System.out.println("Buscar Livro: ");
		System.out.println("1. Buscar o Começo");
		System.out.println("2. Buscar o Final");
		System.out.println("3. Buscar por Índice");
		
		int opt = scan.nextInt();
		
		switch(opt) {
		case 1:
			getBookBegin();
			break;
		case 2:
			getBookEnd();
			break;
		case 3:
			getBookIndex();
			break;
		}
		
		return null;
	}
	
	private Book getBookBegin() {
		return begin.getBook();
	}
	
	private Book getBookEnd() {
		return end.getBook();
	}
	
	private Book getBookIndex() {
		return null;
	}
	
	
	public Node getBegin() {
		return begin;
	}
	public void setBegin(Node begin) {
		this.begin = begin;
	}
	public Node getEnd() {
		return end;
	}
	public void setEnd(Node end) {
		this.end = end;
	}
}