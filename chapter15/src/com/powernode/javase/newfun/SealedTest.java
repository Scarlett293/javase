package com.powernode.javase.newfun;

/**
 * ClassName: SealedTest
 * Decription:
 * Package: com.powernode.javase.newfun
 * Date: 2024/4/28 12:55
 * Author: Scalett
 * Version: 1.0
 */
public class SealedTest {
}

class T {

}

 class T1 extends T {

 }

 class T2 extends T {

 }

 class T3 extends T {

 }

 class T4 extends T {

 }

// 定义一个Person类，只允许Teacher、Student、Worketr这三个类继承。
// 怎么定义密闭类：在class关键字前面添加 sealed 关键字
// 添加了 sealed 之后，该类成为密封类，必须使用 permits 关键字指定哪些子类可以继承我。
sealed class Person permits Teacher, Student, Worker {}
// 当一个类继承了密封类之后，该类必须使用 final、sealed、non-sealed 这三个关键字中的一个关键字进行修饰。
final class Teacher extends Person {}
non-sealed class Student extends Person {}
sealed class Worker extends Person permits OtherWorker {}
non-sealed class OtherWorker extends Worker {}
