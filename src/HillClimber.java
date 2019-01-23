import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

public class HillClimber {

	public static void main(String[] args) {

	}
	public static void partA() {
		SummaryStatistics statistics = new SummaryStatistics();
		int tempSteps;
		double tempX, tempY;
		double minX = 0;
		double maxX = 100;
		double minY = -100;
		double maxY = 10;
		double stepSize = 0.01;

		for (int i = 0; i < 100; i++) {
			tempX = Math.random()*99;
			tempY = -100 +Math.random()*110;
			statistics.addValue(HillClimb(tempX, tempY, stepSize, minX, maxX, minY, maxY, 0));
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean: " +statistics.getMean());
		System.out.println("Standard Deviation:" +statistics.getStandardDeviation());
		System.out.println();
		statistics.clear();

		stepSize = 0.02;

		for (int i = 0; i < 100; i++) {
			tempX = Math.random()*99;
			tempY = -100 +Math.random()*110;
			statistics.addValue(HillClimb(tempX, tempY, stepSize, minX, maxX, minY, maxY, 0));
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean: " +statistics.getMean());
		System.out.println("Standard Deviation:" +statistics.getStandardDeviation()); 
		System.out.println();
		statistics.clear();

		stepSize = 0.1;

		for (int i = 0; i < 100; i++) {
			tempX = Math.random()*99;
			tempY = -100 +Math.random()*110;
			statistics.addValue(HillClimb(tempX, tempY, stepSize, minX, maxX, minY, maxY, 0));
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean: " +statistics.getMean());
		System.out.println("Standard Deviation:" +statistics.getStandardDeviation()); 
		System.out.println();
		statistics.clear();

		stepSize = 0.2;

		for (int i = 0; i < 100; i++) {
			tempX = Math.random()*99;
			tempY = -100 +Math.random()*110;
			statistics.addValue(HillClimb(tempX, tempY, stepSize, minX, maxX, minY, maxY, 0));
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean: " +statistics.getMean());
		System.out.println("Standard Deviation:" +statistics.getStandardDeviation()); 
		System.out.println();
		statistics.clear();
	}

	public static double func(double x, double y) {
		return Math.sin(x/2) + Math.cos(2*y);
	}

	
	public static int HillClimbBeam(int beamWidth, double[][] beams, double increment, double xMin, double xMax, double yMin, double yMax, int steps){
		double candidates[] = new double[beamWidth*8];
		
		return 0;
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

		case 0 :    return steps;
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