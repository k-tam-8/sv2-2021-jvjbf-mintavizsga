package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    public static final int CAPACITY = 20;
    private List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        if (CAPACITY - (fishList.size() * 5) > 4) {
            fishList.add(fish);
        } else throw new IllegalStateException("Can not add fish because there is no more space.");
    }

    public void feed() {
        for (Fish f : fishList) {
            f.feed();
        }
    }

    public void removeFish(int maxWeight) {
        for (int i = 0; i < fishList.size(); i++) {
            if (fishList.get(i).getWeight() > maxWeight) {
                fishList.remove(i);
            }
        }
    }

    public List<String> getStatus() {
        List<String> statusList = new ArrayList<>();
        for (Fish f : fishList) {
            statusList.add(f.getStatus());
        }
        return statusList;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int sum = 0;
        for (Fish f : fishList) {
            if (f.hasMemoryLoss()) {
                sum++;
            }
        }
        return sum;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish f : fishList) {
            if (f.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        Fish smallestFish = null;
        int smallestWeight = Integer.MAX_VALUE;
        for (Fish f : fishList) {
            if (f.getWeight() < smallestWeight) {
                smallestWeight = f.getWeight();
                smallestFish = f;
            }
        }
        return smallestFish;
    }
}



