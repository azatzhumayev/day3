package assignments.Assignment2_veriables;

public class Question10 {

	public static void main(String[] args) {
		
		int hour,minute,second;
		
		    hour = 13;
		    minute = 24;
		    second = 33;
		    
		String a,p;
		 
		    a="AM";
		    p="PM";
		
		    if (hour>=0 && hour<=12) { //logik is not right needs to improve
		    System.out.println("Time: "+hour+":"+minute+":"+second+" "+a);
		    
		    }  else {
		    	System.out.println("Time: "+hour+":"+minute+":"+second+" "+p);
		    }
		
	}

}
