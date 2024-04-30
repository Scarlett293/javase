package com.powernode.javase.moviesystem;

import java.util.Arrays;

/**
 * @author :29369
 * @Package: com.powernode.javase.moviesystem
 * @ClassName: movie
 * @Date: 2024/4/17 18:56 01
 */
public class Movie {
    /**
     * 电影名
     */
    private String name;
    /**
     * 导演
     */
    private String director;
    /**
     * 演员
     */
    private String[] actor;
    /**
     * 类型
     */
    private String type;

    public Movie(String name, String director, String[] actor, String type) {
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", actor=" + Arrays.toString(actor) +
                ", type='" + type + '\'' +
                '}';
    }
}
