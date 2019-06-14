package singleTon;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EagerSingleTon {
 
	private EagerSingleTon() {}    //1 at declare private constructor
	public static final  Map Instance =Collections.synchronizedMap(new HashMap());    

	public static  Map getInstance() {
		// TODO Auto-generated method stub
		return Instance;
	}
}
