package a;

import annotation.Column;
import annotation.Table;

/**
 * ClassName: User
 * Decription:
 * Package: a
 * Date: 2024/4/25 15:39
 * Author: Scalett
 * Version: 1.0
 */
@Table("t_user")
public class User {
    @Column(name = "uid")
    private String userid;

    @Column(name = "uname")
    private String username;

    @Column(name = "psd")
    private String password;

    @Column(name = "age", type = "int")
    private int age;

    private String email;
}
