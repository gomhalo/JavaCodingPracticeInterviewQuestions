package CodingPracticeInterviewQuestions;

public class ToReturnToTheSamePosition {

	    public static void main(String[] args) {
//	        char[] directions = {'s', 's', 'n', 'n', 'e', 'e', 'w', 'w', 's', 'n', 'e'};
	        
//	        char[] directions = {'s', 'n', 'e', 'w'};
	        char[] directions = {'s', 'n', 'e', 'w','n'};
	        System.out.println(returnToStart(directions)); // Expected output: false
	    }

	    public static boolean returnToStart(char[] directions) {
	        int x = 0;
	        int y = 0;
	        int time = 0;

	        for (char direction : directions) {
	            switch (direction) {
	                case 'n':
	                    y++;
	                    break;
	                case 's':
	                    y--;
	                    break;
	                case 'e':
	                    x++;
	                    break;
	                case 'w':
	                    x--;
	                    break;
	                default:
	                    throw new IllegalArgumentException("Invalid direction: " + direction);
	            }
	            time++; // Each step takes 1 minute
	        }
System.out.println("x="+ x);
System.out.println("Y="+ y);
System.out.println("total time is = " + time);
	        // Check if back to start within 10 minutes
	        return x == 0 && y == 0 && time <= 10;
	    }
	}