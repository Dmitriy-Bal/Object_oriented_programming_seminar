package org.example.HomeWork;

public class Wall implements Obstacle {
    protected int height;
    protected String nameObstacle;

    public Wall(int height, String nameObstacle) {
        this.height = height;
        this.nameObstacle = "Wall";
    }

    public Wall() {
    }

    @Override
    public int sizeObstacle() {
        System.out.print("Стена  - " + height + " сантиметров ");
        return height;
    }

    @Override
    public String nameObstacle() {
        return nameObstacle;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getNameObstacle() {
        return nameObstacle;
    }

    public void setNameObstacle(String nameObstacle) {
        this.nameObstacle = nameObstacle;
    }
}