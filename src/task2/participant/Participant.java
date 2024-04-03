package task2.participant;

public class Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxRunDistance() {
        return this.maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return this.maxJumpHeight;
    }

    public void run() {
        System.out.println("PARTICIPANT RUN:");
    }

    public void jump() {
        System.out.println("PARTICIPANT JUMPS:");
    }
}
