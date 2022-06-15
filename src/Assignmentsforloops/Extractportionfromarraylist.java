package Assignmentsforloops;
import java.util.ArrayList;

public class Extractportionfromarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> color=new ArrayList<String>();

color.add("green");
color.add("Red");
color.add("yellow");
color.add("whilte");
color.add("pink");
System.out.println(color.subList(2,4));//only between the values will print not the 4th index value
}

}
