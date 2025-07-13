import java.util.*;

public class Main {
    private int currentFloor = 1;
    private String direction = "up";
    private List<Integer> requests = new ArrayList<>();
    private boolean moving = false;
    private final int maxFloor = 8;

    public static void main(String[] args) {
        Main elevator = new Main();
        elevator.requestFloor(5);
        elevator.requestFloor(3);
        elevator.requestFloor(8);
        elevator.requestFloor(2);
        elevator.processRequests();
    }

    public void requestFloor(int floor) {
        if (!requests.contains(floor) && floor != currentFloor) {
            requests.add(floor);
            System.out.println("Added request for floor: " + floor);
            if (!moving) processRequests();
        }
    }

    public void processRequests() {
        moving = true;

        while (!requests.isEmpty()) {
            List<Integer> floorsInDirection = new ArrayList<>();
            for (int floor : requests) {
                if (direction.equals("up") && floor > currentFloor) {
                    floorsInDirection.add(floor);
                } else if (direction.equals("down") && floor < currentFloor) {
                    floorsInDirection.add(floor);
                }
            }

            if (floorsInDirection.isEmpty()) {
                // Reverse direction if no floors in current direction
                direction = direction.equals("up") ? "down" : "up";
                continue;
            }

            // Sort floors in direction
            floorsInDirection.sort((a, b) -> direction.equals("up") ? a - b : b - a);

            for (int destination : floorsInDirection) {
                moveToFloor(destination);
                currentFloor = destination;
                requests.remove(Integer.valueOf(currentFloor));
            }
        }

        moving = false;
    }

    public void moveToFloor(int floor) {
        System.out.println("Moving from Floor " + currentFloor + " to Floor " + floor);
        // Simulated movement delay if needed
        // Thread.sleep(2000); // Uncomment if used in real threaded implementation
        System.out.println("Arrived at Floor " + floor);
    }
}
