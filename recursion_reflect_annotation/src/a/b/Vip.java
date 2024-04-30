package a.b;

import annotation.Column;
import annotation.Table;

/**
 * ClassName: Vip
 * Decription:
 * Package: a.b
 * Date: 2024/4/25 15:42
 * Author: Scalett
 * Version: 1.0
 */
@Table("t_vip")
public class Vip {
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "grade")
    private String grade;
}
