package Kata.alishev;

public enum Season {
    Summer(38), Winter(-45), Autumn(10 ), Spring(20);
    private int temperature;
    Season(int temperature) {
this.temperature = temperature;
    }
}
