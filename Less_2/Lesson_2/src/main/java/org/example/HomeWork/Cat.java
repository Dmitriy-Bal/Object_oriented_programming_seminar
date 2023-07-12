package org.example.HomeWork;

public class Cat implements Actions {
    private int maxDistanceJump;
    private int maxDistanceRun;


    public Cat(int maxDistanceJump, int maxDistanceRun) {
        this.maxDistanceJump = maxDistanceJump;
        this.maxDistanceRun = maxDistanceRun;
    }

    public Cat() {
    }

    @Override
    public int run(int distance) {
        if (distance >= maxDistanceRun) {
            System.out.println("Кот - выбывает. Не смог пробежать ");
            return 1;
        } else System.out.println("Кот успешно пробежал  ");
        return 0;
    }

    @Override
    public int jump(int distance) {
        if (distance >= maxDistanceJump) {
            System.out.println("Кот - выбывает. Не смог преодолеть барьер   ");
            return 1;
        } else {
            System.out.println("Кот  успешно перепрыгнул барьер  ");
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
