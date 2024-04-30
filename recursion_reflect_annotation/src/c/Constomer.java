package c;

import annotation.Column;
import annotation.Table;

/**
 * ClassName: Constomer
 * Decription:
 * Package: c
 * Date: 2024/4/25 15:43
 * Author: Scalett
 * Version: 1.0
 */
@Table("t_customer")
public class Constomer {
    @Column(name = "cid")
    private String cid;

    @Column(name = "name")
    private String name;

    @Column(name = "age", type = "int")
    private int age;

    @Column(name = "addr")
    private String address;
}
