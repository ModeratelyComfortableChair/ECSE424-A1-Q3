
public class HillClimber {

	public static void main(String[] args) {
		double stepSize = 0.2;
		HillClimb(9.44, 0.97, stepSize, 0, 100, -100, 10, 0);

	}
	
	public static double func(double x, double y) {
		return Math.sin(x/2) + Math.cos(2*y);
	}


	public static int HillClimb(double x, double y, double increment, double xMin, double xMax, double yMin, double yMax, int steps){
	    double value = func(x, y);
	    double maxValue = value;
	    double tempVal;
	    int caseChoice = 0;
	    
	    //Increase x alone
	    if(x + increment <= xMax){
	        tempVal = func(x + increment, y);
	        if(maxValue < tempVal){
	            maxValue = tempVal;
	            caseChoice = 1;
	        }
	    }
	    
	    //Decrease x alone
	    if(x - increment >= xMin){
	        tempVal = func(x - increment, y);
	        if(maxValue < tempVal){
	            maxValue = tempVal;
	            caseChoice = 2;
	        }
	    }
	    
	    //Increase y alone.
	    if(y + increment <= yMax){
	        tempVal = func(x, y + increment);
	        if(maxValue < tempVal){
	            maxValue = tempVal;
	            caseChoice = 3;
	        }
	    }

	    //Decrease y alone.
	    if(y - increment >= yMin){
	        tempVal = func(x, y - increment);
	        if(maxValue < tempVal){
	            maxValue = tempVal;
	            caseChoice = 4;
	        }
	    }
	    
	    //Increase x, Increase y
	    if(x + increment <= xMax && y + increment <= yMax){
	        tempVal = func(x + increment, y + increment);
	        if(maxValue < tempVal){
	            maxValue = tempVal;
	            caseChoice = 5;
	        }
	    }
	    
	    //Increase x, Decrease y
	    if(x + increment <= xMax && y - increment >= yMin){
	        tempVal = func(x + increment, y - increment);
	        if(maxValue < tempVal){
	            maxValue = tempVal;
	            caseChoice = 6;
	        }
	    }
	    
	    //Decrease x, Increase y
	    if(x - increment >= xMin && y + increment <= yMax){
	        tempVal = func(x - increment, y + increment);
	        if(maxValue < tempVal){
	            maxValue = tempVal;
	            caseChoice = 7;
	        }
	    }
	    
	    //Decrease x, Decrease y
	    if(x - increment >= xMin && y - increment >= yMin){
	        tempVal = func(x - increment, y - increment);
	        if(maxValue < tempVal){
	            maxValue = tempVal;
	            caseChoice = 8;
	        }
	    }
	    
	    switch(caseChoice) {
	    default :	return steps;
	    
	    case 0 :	System.out.println("Local Maximum of: " +value + " found at x: " +x +", y: " +y +" in "+steps +" steps");
	    			return steps;
	    case 1 :	return HillClimb(x + increment, y, increment, xMin, xMax, yMin, yMax, steps + 1);

	    case 2 :	return HillClimb(x - increment, y, increment, xMin, xMax, yMin, yMax, steps + 1);

	    case 3 :	return HillClimb(x, y + increment, increment, xMin, xMax, yMin, yMax, steps + 1);

	    case 4 :	return HillClimb(x, y - increment, increment, xMin, xMax, yMin, yMax, steps + 1);

	    case 5 :	return HillClimb(x + increment, y + increment, increment, xMin, xMax, yMin, yMax, steps + 1);

	    case 6 :	return HillClimb(x + increment, y - increment, increment, xMin, xMax, yMin, yMax, steps + 1);

	    case 7 :	return HillClimb(x - increment, y + increment, increment, xMin, xMax, yMin, yMax, steps + 1);

	    case 8 :	return HillClimb(x - increment, y - increment, increment, xMin, xMax, yMin, yMax, steps + 1);
	    }
	    
	}
	    
	    //If at local maximum
	    


}