package Models.Mental;

import org.lwjgl.Sys;

import java.util.Stack;

public class Pathfinding {

    //turnRight(degrees) == 1
    //turnLeft(degrees) == 2
    //velocity(int accelerationChange) == 3
    //does not store it's location, or if it needs to, it is only stored for use by rendering,
    // and does not contribute to any other pert of the behavior
    public int velocity = 0; //CAN BE NEGATIVE
    public double direction = 0; //radians not sure I should store this, but it might be needed.
    //create a list/stack of the pathfinding algorithm that uses the functions below
    //add complexity for when an obstacle is found in it's path like food, junk/wall
    public Stack<String> searchPath = new Stack<>();
    public Stack<String> bumpPath = new Stack<>();
    public Stack<String> currentPath = new Stack<>();
    public Stack<String> currentPathRef = new Stack<>(); //never changes except for when it has bumped an obstical/or
    // completed the obstacle algorithm

    public static Stack<String> generateAlgorithm(){
        Stack<String> newPath = new Stack<>();

        //first generate the length of the algorithm
        //generate the algorithm
        //scan the stack for 3 and then generate in a double in radians
        int max = 3;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 10
        for (int i = 1; i < randRange(1,1000); i++) {
            int rand = (int)(Math.random() * range) + min;
            //if
            newPath.push(new Integer(randRange(min,range)).toString());
            // Output is different everytime this code is executed
        }
        return newPath;
    }


    public void turnRight(double degrees) {

    }

    public void turnLeft(double degrees) {

    }

    public void velocityChange(int accelerationChange) {
        //changes the current speed of the bacteria by accelerationChange

    }


    public static int randRange(int low, int high) {
        int range = high - low + 1;
        return (int)(Math.random() * range) + low;
    }


    public static void main(String args[]) {
        Stack<String> temp = generateAlgorithm();
        for (int i = 0; i < temp.capacity() - 1; i++) {

            if (!temp.empty()) {
                String itr = temp.pop();
                if (itr.equals("3")) {
                    System.out.println("Found a 3");
                }
                System.out.println(itr);
            }

        }


    }

}
