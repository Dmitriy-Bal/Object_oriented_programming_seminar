package org.example.HomeWork;

public class Robot implements Actions {
    private int maxDistanceJump;
    private int maxDistanceRun;

    public Robot(int maxDistanceJump, int maxDistanceRun) {
        this.maxDistanceJump = maxDistanceJump;
        this.maxDistanceRun = maxDistanceRun;
    }

    public Robot() {
    }

    @Override
    public int run(int distance) {
        if (distance >= maxDistanceRun) {
            System.out.println("Robot - выбывает. Не смог пробежать ");
            return 1;
        } else {
            System.out.println("Robot успешно пробежал ");
            return 0;
        }
    }

    @Override
    public int jump(int distance) {
        if (distance >= maxDistanceJump) {
            System.out.println("Robot - выбывает. Не смог преодолеть барьер ");
            return 1;
        } else {
            System.out.println("Robot упешно перепрыгнул барьер ");
            return 0;
        }
    }

    public int getMaxDistanceJump() {
        return maxDistanceJump;
    }

    public void setMaxDistanceJump(int maxDistanceJump) {
        this.maxDistanceJump = maxDistanceJump;
    }

    public int getMaxDistanceRun() {
        return maxDistanceRun;
    }

    public void setMaxDistanceRun(int maxDistanceRun) {
        this.maxDistanceRun = maxDistanceRun;
    }
}
