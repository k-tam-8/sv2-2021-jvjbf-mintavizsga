package aquarium;

public class Clownfish extends Fish {
    private final boolean memoryLoss= false;

    public Clownfish(String name, int weight, String color) {
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
