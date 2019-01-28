package Books;

import Interfaces.Refresh;
import Interfaces.ShowAge;
import Interfaces.ShowName;

abstract class Book implements ShowAge, ShowName, Refresh {
	public String name;
	public String author;
	public String genre;
	public int age;
	public int cost;
	public String place;
	
	
	public Book() {
		
	}
	public Book(String name, String author, String genre, int age, int cost, String place) {
		System.out.println ("Hello from 2st constructor");
		this.name=name;
		this.author=author;
		this.genre=genre;
		this.age=age;
		this.cost=cost;
		this.place=place;
	}
	public void showCost() {
		System.out.println ("Cost of this book is "+this.cost);
	}
	@Override
	public void showAge() {
		System.out.println ("Book age is"+this.age);
	}	
	@Override
	public void showName() {
		System.out.println ("Book name"+this.name+"from author "+this.author);
		
		
	}
	@Override
	public void refresh() {
		System.out.println ("Book"+this.name+"from author"+this.author+"from "+this.age+"must be refresh for"+this.age+10 );
		
	}
}
