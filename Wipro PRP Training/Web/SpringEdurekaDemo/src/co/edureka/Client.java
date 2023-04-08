package co.edureka;

public class Client {
	public static void main(String[] args) {
		 Employee e=new Employee();
		 e.setId(100);
		 e.setName("Dhruv");
		 e.setSalary(550000);
		 System.out.println(e);
		 
		 //Inversion Of Control (IOC)
		 //1.Add jar files for Spring core
		 //2.Configure java object in xml file
		 //3.Use Spring IOC Containers, eg. BeanFactory or ApplicationContext to get objects constructed by them
		 
	}
}
