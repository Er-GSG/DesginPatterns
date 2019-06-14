package singleTon;
import java.util.Map;

public class client {

	public static void main(String[] args) {
		Map  register1= EagerSingleTon.getInstance();
		Map register2= EagerSingleTon.getInstance();
		System.out.println(register1==register2);
		
	}

}
