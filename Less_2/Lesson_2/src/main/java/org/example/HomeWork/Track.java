package org.example.HomeWork;

public class Track implements Obstacle {

    protected int length;
    protected String nameObstacle;

    public Track(int length) {
        this.length = length;
    }

    public Track() {
    }

    @Override
    public int sizeObstacle() {
        System.out.print("Беговая дорожка  - " + length + " метров ");
        return length;
    }

    public Track(int length, String nameObstacle) {
        this.length = length;
        this.nameObstacle = "Track";
    }

    @Override
    public String nameObstacle() {

        return nameObstacle;
    }

    public int getHeight() {
        return length;
    }

    public void setHeight(int height) {
        this.length = height;
    }
}