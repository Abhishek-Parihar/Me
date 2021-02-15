package algorithms.recursion;

public class TowerOfHanoi {


    public static void moveDisk(char source , char destination)
    {
        System.out.println("Move Disk from " + source + " to " + destination);
    }
    public static void main(String[] args) {
        showSteps(4, 'a', 'b', 'c');
    }

    private static void showSteps(int numberOfDisks, char source, char via, char destination) {
        if (numberOfDisks == 1) {
            moveDisk(source, destination);
            return;
        }
        showSteps(numberOfDisks-1,source,destination,via);
        moveDisk(source,destination);
        showSteps(numberOfDisks -1 , via,source,destination);
    }
}
