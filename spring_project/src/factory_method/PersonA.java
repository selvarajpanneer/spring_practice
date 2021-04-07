package factory_method;

public class PersonA {
	private static final PersonA obj=new PersonA();  
	private PersonA(){System.out.println("private constructor");}  
	public static PersonA getPersonA(){  
	    System.out.println("factory method ");  
	    return obj;  
	}  
	public void msg(){  
	    System.out.println("hello user");  
	}  
}
