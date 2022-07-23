package Kata.alishev;

public enum Season {
    SUMMER(38), WINTER(-45), AUTUMN(10), SPRING(20);
    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }
}
