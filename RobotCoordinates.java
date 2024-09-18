package CodingPracticeInterviewQuestions;

public class RobotCoordinates {
    public static int[] finalPosition(String instructions) {
        int[] position = {0, 0}; // Initial position (x, y) = (0, 0)

        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'U':
                    position[1]++; // Move up (increment y)
                    break;
                case 'D':
                    position[1]--; // Move down (decrement y)
                    break;
                case 'L':
                    position[0]--; // Move left (decrement x)
                    break;
                case 'R':
                    position[0]++; // Move right (increment x)
                    break;
                default:
                    // Ignore invalid instructions
            }
        }

        return position;
    }

    public static void main(String[] args) {
        String instructions = "UDLRU"; // Example instructions (Up, Down, Left, Right, Up)
        int[] finalPosition = finalPosition(instructions);
        
        System.out.println("Final Position: (" + finalPosition[0] + ", " + finalPosition[1] + ")");
    }
}