package com.example.snowitall;

public class GiftGlooModel {

    private int snowflakes;

    private String snowFlakesSTR;

    public GiftGlooModel() {
        snowflakes = 0;
    }

    public void increaseSnowFlakes() {
        snowflakes++;
    }

    public String toString() {
        return "Snow Flakes = " + snowflakes + "\n";
    }

    public int getSnowflakes() {
        return snowflakes;
    }

    public void setSnowflakes(int snowflakes) {
        this.snowflakes = snowflakes;
    }

    public String getSnowFlakeString() {
        return snowFlakesSTR;
    }

    public void setSnowFlakeString(String snowFlakesSTR) {
        this.snowFlakesSTR = snowFlakesSTR;
    }
}
