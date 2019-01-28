package People;

import Interfaces.ShowAge;
import Interfaces.ShowName;

public class Employee extends Human implements ShowAge, ShowName{
		public Employee (String name, String lastname, int age, String sex) {
			this.name=name;
			this.lastname=lastname;
			this.age=age;
			this.sex=sex;
			System.out.println("Hello, from Employee constr");
		}
		public void findbook() {
		}
		public void readwish() {
		}
		public void givebook() {
		}
		public void takebookback(){
		}
		public void regclient() {
			
		}
		
}
