class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
                int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }
        
        // Initial state
        int x = 0, y = 0, directionIndex = 0;
        int maxDistanceSquared = 0;
        
        for (int command : commands) {
            if (command == -2) { // Turn left
                directionIndex = (directionIndex + 3) % 4;
            } else if (command == -1) { // Turn right
                directionIndex = (directionIndex + 1) % 4;
            } else { // Move forward
                for (int step = 0; step < command; step++) {
                    int newX = x + directions[directionIndex][0];
                    int newY = y + directions[directionIndex][1];
                    // Check if the next position is an obstacle
                    if (obstacleSet.contains(newX + "," + newY)) {
                        break;
                    }
                    // Update position
                    x = newX;
                    y = newY;
                    maxDistanceSquared = Math.max(maxDistanceSquared, x * x + y * y);
                }
            }
        }
        
        return maxDistanceSquared;
    }
}