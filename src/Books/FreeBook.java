package Books;

import Interfaces.Refresh;
import Interfaces.ShowAge;
import Interfaces.ShowName;

public  class FreeBook extends Book implements ShowName, ShowAge, Refresh {

		public FreeBook (String name, String author, String genre, int age, String place) {
		cost=0;
		this.name=name;
		this.author=author;
		this.genre=genre;
		this.age=age;
		this.cost=cost;
		this.place=place;
		System.out.println ("It is freeBook. They cost is "+cost);
		}	
}

