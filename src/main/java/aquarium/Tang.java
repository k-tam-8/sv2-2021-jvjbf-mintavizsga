package aquarium;

public class Tang extends Fish {
    private final boolean memoryLoss = true;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + hasMemoryLoss();
    }
}
