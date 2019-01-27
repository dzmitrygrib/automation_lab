package Runner;

import Books.FreeBook;

import java.awt.print.Book;

import Books.ExpensiveBook;
import People.Visitor;
import People.Employee;

public class Executor {
	
	public static void main (String[] args) {
		System.out.println ("Welcome to our Library");
		
		FreeBook mulan=new FreeBook("Mulan","Folk", "Fairytail", 1986, "Second floor");
		mulan.showName();
		mulan.showAge();
		mulan.showCost();
		ExpensiveBook hobbit=new ExpensiveBook("Hobbit","Tolkin", "Fantasy", 1986, "Third floor");
		hobbit.showName();
		hobbit.showAge();
		hobbit.showCost();
		hobbit.refresh();//How make +10 to bookage?
		//Ask about super and how to use it
		Employee anna=new Employee("Anna","Mercury",44,"Female");
		anna.showAge();
		anna.showName();
		Visitor henrich=new Visitor ("Henrich", "Heine", 20, "Male","Romeo and Juliette");
		henrich.showName();
		henrich.showAge();
		henrich.setWish("Romeo and Juliette");
		henrich.getWish();
		anna.findbook();//Не получилось в этом методе класса персонал вывести желание посетителя.
		//Не получилось прямо в экзекюторе создать тело метода.
		anna.givebook();
		henrich.takebook();
		henrich.readbook();
		henrich.givebookback();
		anna.takebookback();
	}
}
