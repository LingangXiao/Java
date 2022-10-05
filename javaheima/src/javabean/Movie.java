package javabean;

public class Movie {
    private String name;
    private double rate;
    private String actor;

    public Movie() {
    }

    public Movie(String name, double rate, String actor) {
        this.name = name;
        this.rate = rate;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
