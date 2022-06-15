package Inheritence;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW B=new BMW();
B.stop();//when we have a same method in parent and chile called ovverriden methods
//same name and same number of parameters
//same type of parameter
//same order of parameters
//same return type
B.start();//overriden
B.refill();//inherited
B.Autoparking();
B.fuelreading();
BMW.getprice();
//B.engine();//individual
Car c=new Car();
c.start();
c.stop();
c.refill();
c.engine();
Car c2=new Audi();
Car.getprice();
//auto moblie
//mechanical
//physics
//science
//Car c1=new BMW();//top casting child class object can be reffered by parent class
//down casting
//parent class is referred by child class refence variable

//BMW B1=(BMW)new Car();//which is improper every car is  BMW class cast exception--RUN TIME will give
//B1.start();
//child class can be inherited by grand parents
//static methods can not be overriden and private method also can not be overridden

//final methods can not be inherited
//if any class is declared as final that class cannot be the parent,we can not extend the class
Vehicle v1=new BMW();
v1.engine();
v1.fuelreading();
Science s=new Automobile();
s.science();
Automobile aa=new Audi();
aa.science();
 Physics p=new Mechanical ();
 p.science();
 Science ss=new Mechanical();
 ss.science();
 //Automobile aa=new Audi();//
 Science st=new Truck();
 //st.heavyLoading
 Science sb=new BMW();
 sb.science();
 

	}

}
