package task2;

import task2.obstacles.Obstacle;
import task2.obstacles.Treadmill;
import task2.obstacles.Wall;
import task2.participant.Cat;
import task2.participant.Human;
import task2.participant.Participant;
import task2.participant.Robot;

public class Main {

    public static void main(String[] args) {

        Participant[] participants = {
                new Human("Alex", 180, 2),
                new Cat("Tima", 300, 4),
                new Robot("R2D2", 500, 1)
        };

        Obstacle[] obstacles = {
                new Treadmill("MegaTrack", 200),
                new Wall("WallTOP", 3)
        };

        for (Participant participant : participants) {
            System.out.print("\n");
            boolean passedAllObstacles = true;
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    participant.run();
                    if (!((Treadmill) obstacle).overcome(participant.getMaxRunDistance())) {
                        passedAllObstacles = false;
                        System.out.println(participant.getName() + " failed to pass the obstacle " +
                                obstacle.getName() + " at distance " + ((Treadmill) obstacle).getLenght() +
                                "m. Passed: " + participant.getMaxRunDistance() + "m. ");
                        break;
                    } else if (((Treadmill) obstacle).overcome(participant.getMaxRunDistance())) {
                        System.out.println(participant.getName() + " pass the obstacle " +
                                obstacle.getName() + " at distance " +
                                ((Treadmill) obstacle).getLenght() + "m.");
                    }

                } else if (obstacle instanceof Wall) {
                    participant.jump();
                    if (!((Wall) obstacle).overcome(participant.getMaxJumpHeight())) {
                        passedAllObstacles = false;
                        System.out.println(participant.getName() + " failed to pass the obstacle " +
                                obstacle.getName() + " at distance " + ((Wall) obstacle).getHeight() +
                                "m. Passed: " + participant.getMaxJumpHeight() + "m.");
                        break;
                    } else if (((Wall) obstacle).overcome(participant.getMaxJumpHeight())) {
                        System.out.println(participant.getName() + " pass the obstacle " +
                                obstacle.getName() + " at distance " +
                                ((Wall) obstacle).getHeight() + "m.");
                    }
                }
            }
        }

    }
}
