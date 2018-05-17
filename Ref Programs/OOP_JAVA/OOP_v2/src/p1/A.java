package p1;

public class A {

	// state
	private int pri = 1;
	int de = 2; // default / package access spec
	protected int pro = 3;
	public int pub = 4;

	public static int pub_sta = 5;
	
	
	// Constructors
	
	// Methods
	
	// Inner Classes
	
	// ------------------------------------

	public void a_ObjMethod() {

		System.out.println(pri);
		System.out.println(de);
		System.out.println(pro);
		System.out.println(pub);

		System.out.println(pub_sta);

	}

}




