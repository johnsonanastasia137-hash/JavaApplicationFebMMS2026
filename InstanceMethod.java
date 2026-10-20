public class InstanceMethod{
	public static void main(String[] args){
		InstanceMethod obj1 = new InstanceMethod();
		obj1.clap("Precious","Female");
		
		InstanceMethod obj2 = new InstanceMethod();
		obj2.clap("Martins","male");
		
		InstanceMethod obj3 = new InstanceMethod();
		obj3.clap("Williams","male");
	}
	public void clap(String name,String gender){
		if(gender.equals("Male")){
		System.out.println(name+ "is clapping her hands");
	}
	    else{
		    System.out.println(name+ "is clapping her hands");
		}
	}
}