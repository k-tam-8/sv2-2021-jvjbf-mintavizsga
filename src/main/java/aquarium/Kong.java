package aquarium;

public class Kong extends Fish {
    private final boolean memoryLoss = false;

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + hasMemoryLoss();
    }

    @Override
    public void feed() {
        super.feed();
        super.feed();
    }
}
