import java.util.Arrays;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

public class HillClimber {

	public static void main(String[] args) {
		partA();
		partB();
	}
	public static void partA() {
		SummaryStatistics statsSteps = new SummaryStatistics();
		SummaryStatistics statsValue = new SummaryStatistics();
		double minX = 0;
		double maxX = 100;
		double minY = -100;
		double maxY = 10;
		
		double stepSize = 0.01;
		int steps[] = {0};
		for (int i = 0; i < 100; i++) {
			statsValue.addValue(HillClimb(stepSize, minX, maxX, minY, maxY, steps).getValue());
			statsSteps.addValue(steps[0]);
			steps[0] = 0;
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean (steps): " +statsSteps.getMean());
		System.out.println("Standard Deviation (steps):" +statsSteps.getStandardDeviation());
		System.out.println("Mean (value): " +statsValue.getMean());
		System.out.println("Standard Deviation (value):" +statsValue.getStandardDeviation());
		System.out.println();
		statsSteps.clear();
		statsValue.clear();

		stepSize = 0.05;

		for (int i = 0; i < 100; i++) {
			statsValue.addValue(HillClimb(stepSize, minX, maxX, minY, maxY, steps).getValue());
			statsSteps.addValue(steps[0]);
			steps[0] = 0;	
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean (steps): " +statsSteps.getMean());
		System.out.println("Standard Deviation (steps):" +statsSteps.getStandardDeviation());
		System.out.println("Mean (value): " +statsValue.getMean());
		System.out.println("Standard Deviation (value):" +statsValue.getStandardDeviation());
		System.out.println();
		statsSteps.clear();
		statsValue.clear();

		stepSize = 0.1;

		for (int i = 0; i < 100; i++) {
			statsValue.addValue(HillClimb(stepSize, minX, maxX, minY, maxY, steps).getValue());
			statsSteps.addValue(steps[0]);
			steps[0] = 0;	
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean (steps): " +statsSteps.getMean());
		System.out.println("Standard Deviation (steps):" +statsSteps.getStandardDeviation());
		System.out.println("Mean (value): " +statsValue.getMean());
		System.out.println("Standard Deviation (value):" +statsValue.getStandardDeviation());
		System.out.println();
		statsSteps.clear();
		statsValue.clear();

		stepSize = 0.2;

		for (int i = 0; i < 100; i++) {
			statsValue.addValue(HillClimb(stepSize, minX, maxX, minY, maxY, steps).getValue());
			statsSteps.addValue(steps[0]);
			steps[0] = 0;	
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean (steps): " +statsSteps.getMean());
		System.out.println("Standard Deviation (steps):" +statsSteps.getStandardDeviation());
		System.out.println("Mean (value): " +statsValue.getMean());
		System.out.println("Standard Deviation (value):" +statsValue.getStandardDeviation());
		System.out.println();
		statsSteps.clear();
		statsValue.clear();
	}

	public static void partB() {
		SummaryStatistics statsSteps = new SummaryStatistics();
		SummaryStatistics statsValue = new SummaryStatistics();
		double minX = 0;
		double maxX = 100;
		double minY = -100;
		double maxY = 10;
		double stepSize = 0.1;
		int beamWidth = 2;
		int steps[] = {0};

		for (int i = 0; i < 100; i++) {
			statsValue.addValue(HillClimbBeam(beamWidth, stepSize, minX, maxX, minY, maxY, steps).getValue());
			statsSteps.addValue(steps[0]);
			steps[0] = 0;
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean (steps): " +statsSteps.getMean());
		System.out.println("Standard Deviation (steps):" +statsSteps.getStandardDeviation());
		System.out.println("Mean (value): " +statsValue.getMean());
		System.out.println("Standard Deviation (value):" +statsValue.getStandardDeviation());
		System.out.println();
		statsSteps.clear();
		statsValue.clear();
		
		beamWidth = 4;

		for (int i = 0; i < 100; i++) {
			statsValue.addValue(HillClimbBeam(beamWidth, stepSize, minX, maxX, minY, maxY, steps).getValue());
			statsSteps.addValue(steps[0]);
			steps[0] = 0;
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean (steps): " +statsSteps.getMean());
		System.out.println("Standard Deviation (steps):" +statsSteps.getStandardDeviation());
		System.out.println("Mean (value): " +statsValue.getMean());
		System.out.println("Standard Deviation (value):" +statsValue.getStandardDeviation());
		System.out.println();
		statsSteps.clear();
		statsValue.clear();

		beamWidth = 8;
		
		for (int i = 0; i < 100; i++) {
			statsValue.addValue(HillClimbBeam(beamWidth, stepSize, minX, maxX, minY, maxY, steps).getValue());
			statsSteps.addValue(steps[0]);
			steps[0] = 0;
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean (steps): " +statsSteps.getMean());
		System.out.println("Standard Deviation (steps):" +statsSteps.getStandardDeviation());
		System.out.println("Mean (value): " +statsValue.getMean());
		System.out.println("Standard Deviation (value):" +statsValue.getStandardDeviation());
		System.out.println();
		statsSteps.clear();
		statsValue.clear();

		for (int i = 0; i < 100; i++) {
			statsValue.addValue(HillClimbBeam(beamWidth, stepSize, minX, maxX, minY, maxY, steps).getValue());
			statsSteps.addValue(steps[0]);
			steps[0] = 0;
		}
		System.out.println("StepSize: " +stepSize);
		System.out.println("Mean (steps): " +statsSteps.getMean());
		System.out.println("Standard Deviation (steps):" +statsSteps.getStandardDeviation());
		System.out.println("Mean (value): " +statsValue.getMean());
		System.out.println("Standard Deviation (value):" +statsValue.getStandardDeviation());
		System.out.println();
		statsSteps.clear();
		statsValue.clear();
	}
	
	//Change to function you want to run.
	public static double func(double x, double y) {
		return funcTwo(x, y);
	}
	public static double funcOne(double x, double y) {
		return Math.sin(x/2) + Math.cos(2*y);
	}
	
	public static double funcTwo(double x, double y) {
		return -Math.abs(x - 2) - Math.abs(0.5 * y + 1) + 3;
	}

	public static class Point implements Comparable<Point>{

		private double x;
		private double y;
		private double value;
		public Point(double x, double y) {
			this.setX(x);
			this.setY(y);
			this.value = this.getValue();

		}

		public Point(Point srcPoint) {
			this.setX(srcPoint.getX());
			this.setY(srcPoint.getY());
			this.value = this.getValue();
		}
		//Note we want the higher value earlier in the array
		//Thus we compare the other value to this value, instead of the other way around.
		@Override
		public int compareTo(Point other) {
			return Double.compare(other.getValue(),  this.getValue());
		}
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		public double getValue() {
			return func(x, y);
		}

	}

	public static Point HillClimbBeam(int beamWidth, double increment, double xMin, double xMax, double yMin, double yMax, int steps[]){
		double tempX, tempY;
		Point candidates[] = new Point[beamWidth];
		for(int i = 0; i < beamWidth; i++) {
			tempX = Math.random()*99;
			tempY = -100 +Math.random()*110;
			candidates[i] =  new Point(tempX, tempY);
		}
		return HillClimbBeamEval(candidates[0], candidates, beamWidth, increment, xMin, xMax, yMin, yMax, steps);
	}

	public static Point HillClimbBeamEval(Point lastPoint, Point[] candidates, int beamWidth, double increment, double xMin, double xMax, double yMin, double yMax, int steps[]) {
		Point tempCandidates[] = new Point[beamWidth * 9];
		for(int i = 0; i < beamWidth; i++) {
			Point candidatesPerRun[] = ClimbStep(candidates[i], increment, xMin, xMax, yMin, yMax);
			for(int j = 0; j < 9; j++) {
				tempCandidates[i*9 + j] = new Point(candidatesPerRun[j]);
			}
		}
		Arrays.sort(tempCandidates);
		steps[0] = steps[0] + beamWidth;
		if(tempCandidates[0].getX() == lastPoint.getX() && tempCandidates[0].getY() == lastPoint.getY()) {
			return tempCandidates[0];
		} else {
			candidates = new Point[beamWidth];
			for(int i = 0; i < beamWidth; i++) {
				candidates[i] = new Point(tempCandidates[i]);
			}
			return HillClimbBeamEval(candidates[0], candidates, beamWidth, increment, xMin, xMax, yMin, yMax, steps);
		}

	}


	//Note that the climbStep function will return the original point for any step that goes out of bounds
	public static Point[] ClimbStep(Point point, double increment, double xMin, double xMax, double yMin, double yMax){
		Point pointers[] = new Point[9];

		if(point.getX() + increment <= xMax) {
			pointers[0] = new Point(point.getX() + increment, point.getY());
			if(point.getY() + increment <= yMax) {
				pointers[1] = new Point(point.getX() + increment, point.getY() + increment);
			} else {
				pointers[1] = new Point(point);
			}

			if(point.getY() - increment >= yMin) {
				pointers[2] = new Point(point.getX() + increment, point.getY() - increment);
			} else {
				pointers[2] = new Point(point);
			}
		} else {
			pointers[0] = new Point(point);
			pointers[1] = new Point(point);
			pointers[2] = new Point(point);
		}


		if(point.getY() + increment <= yMax) {
			pointers[3] = new Point(point.getX(), point.getY() + increment);
		} else {
			pointers[3] = new Point(point);
		}

		if(point.getY() - increment >= yMin) {
			pointers[4] = new Point(point.getX(), point.getY() - increment);
		} else {
			pointers[4] = new Point(point);
		}

		if(point.getX() - increment >= xMin) {
			pointers[5] = new Point(point.getX() - increment, point.getY());
			if(point.getY() + increment <= yMax) {
				pointers[6] = new Point(point.getX() - increment, point.getY() + increment);
			} else {
				pointers[6] = new Point(point);
			}

			if(point.getY() - increment >= yMin) {
				pointers[7] = new Point(point.getX() - increment, point.getY() - increment);
			} else {
				pointers[7] = new Point(point);
			}
		} else {
			pointers[5] = new Point(point);
			pointers[6] = new Point(point);
			pointers[7] = new Point(point);
		}

		pointers[8] = new Point(point);
		return pointers;
	}

	public static Point HillClimb(double increment, double xMin, double xMax, double yMin, double yMax, int[] steps) {
		double tempX = Math.random()*99;
		double tempY = -100 +Math.random()*110;
		Point tempPoint = new Point(tempX, tempY);
		return HillClimbEval(tempPoint, increment, xMin, xMax, yMin, yMax, steps);

	}

	public static Point HillClimbEval(Point point, double increment, double xMin, double xMax, double yMin, double yMax, int[] steps){

		Point pointers[] = ClimbStep(point, increment, xMin, xMax, yMin, yMax);
		steps[0] = steps[0] + 1;
		Arrays.sort(pointers);
		if(pointers[0].getX() == point.getX() && pointers[0].getY() == point.getY()) {
			return point;
		} else {
			return HillClimbEval(pointers[0], increment, xMin, xMax, yMin, yMax, steps);
		}

	}




}