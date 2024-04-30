package com.powernode.javase.moviesystem;

/**
 * time :2024/4/17 18:38 07
 * ClassName :UserManager
 * Package :com.powernode.javase.moviesystem
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public interface UserManager {
    void register(User user);
    boolean login(User user);
}
