package Books;

import Interfaces.Refresh;
import Interfaces.ShowAge;
import Interfaces.ShowName;

public class ExpensiveBook extends Book implements ShowName, ShowAge, Refresh{
	public ExpensiveBook (String name, String author, String genre, int age, String place) {
		cost=100;
		this.name=name;
		this.author=author;
		this.genre=genre;
		this.age=age;
		this.cost=cost;
		this.place=place;
		System.out.println ("It is expensive Book. They cost is"+cost);
		}	
	
}
