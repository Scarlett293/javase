package com.powernode.javase.math;

import org.junit.jupiter.api.*;

/**
 * time :2024/4/8 20:00 06
 * ClassName :MathTest
 * Package :com.powernode.javase.math
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */


/**
 * 测试用例
 */
public class MathTest {

    @BeforeAll
    public static void before() {
        System.out.println("开始进行单元测试！");

    }



    @AfterAll
    public static void after() {
        System.out.println("单元测试结束！");
    }


    @BeforeEach
    public void beforeEach() {
        System.out.println("单元测试方法开始执行");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("单元测试方法执行结束！");
    }
    /**
     * 单元测试方法
     */
    @Test
    public void testSum() {
        System.out.println("testSum");
        // 实际值：程序运行之后的结果
        int actual = Math.sum(10, 20);
        // 期望值：你觉得这个结果应该是多少
        int expected = 30;
        // 断言（断言机制）
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSub() {
        System.out.println("testSub");
        int actual = Math.sub(20, 10);
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMul() {
        System.out.println("testMul");
        int actual = Math.mul(20, 10);
        int expected = 200;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDiv() {
        System.out.println("testDiv");
        int actual = Math.div(20, 10);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}
