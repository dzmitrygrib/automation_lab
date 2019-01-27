package People;

import Interfaces.ShowAge;
import Interfaces.ShowName;

public class Visitor extends Human implements ShowAge, ShowName {
		private String wish;
		public Visitor (String name, String lastname, int age, String sex, String wish) {
			this.name=name;
			this.lastname=lastname;
			this.age=age;
			this.sex=sex;
			this.setWish(wish);
			System.out.println("Hello from Visitor constructor");
		
	}
		public void takebook() {
		}
		public void readbook() {
		}
		public void givebookback() {
		}
		public String getWish() {
			System.out.println ("Visitor "+this.name+" wanna book with name"+wish);
			return wish;
		}
		public void setWish(String wish) {
			this.wish = wish;
		}
}
