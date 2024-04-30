package com.powernode.javase.oop19;

/**
 * time :2024/3/17 18:11 38
 * ClassName :test
 * Package :com.powernode.javase.oop19
 *
 * @author :29369
 * <p>
 * Il n'ya qu'un héroïsme au monde :
 * c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class test {

    public static void main(String[] args) {

        // get

        java.util.Scanner sc = new java.util.Scanner(System.in);

        String str = sc.nextLine();

        String[] strArray = str.split(" ");

        double[] doubleArray = new double[strArray.length];

        // allnum

        try {

            for (int i = 0; i < strArray.length; i++) {

                doubleArray[i] = Double.parseDouble(strArray[i]);

            }

            f1(doubleArray);

        } catch (Exception e) {

            System.out.println("输入不合法");

        }

    }

    // 正数？

    static void f1(double[] arr) {

        boolean flag = true;

        for (double num : arr) {

            if (num <= 0) {

                flag = false;

            }

        }

        if (flag) {

            f2(arr, flag);

        } else {

            System.out.println("输入不合理");

        }

    }

    // 三角形？

    static void f2(double[] arr, boolean flag) {

        if (!(arr[0] + arr[1] > arr[2] && arr[1] + arr[2] > arr[0] && arr[2] + arr[0] > arr[1])) {

            flag = false;

        }

        if (flag) {

            f3(arr, flag);

        } else {

            System.out.println("构不成三角形");

        }

    }

    static void f3(double[] arr, boolean flag) {

        // 等边？

        if (arr[0] == arr[1] && arr[1] == arr[2]) {

            System.out.println("等边三角形");

            // 等腰 | 直角

        } else if (isIsoscelesTriangle(arr[0], arr[1], arr[2]) != 0) {

            switch (isIsoscelesTriangle(arr[0], arr[1], arr[2])) {

                case 1:

                    System.out.println("等腰非直角三角形");

                    break;

                case 2:

                    System.out.println("等腰直角三角形");

                    break;

                case 3:

                    System.out.println("直角非等腰三角形");

                    break;

            }

        } else {

            System.out.println(checkTriangleType(arr[0], arr[1], arr[2]));

        }

    }

    public static int isIsoscelesTriangle(double a, double b, double c) {

        // 是否等腰

        boolean isIsosceles = (a == b) || (a == c) || (b == c);

        // 是否直角

        boolean result1 = Math.abs(a * a + b * b - c * c) < 0.1;

        boolean result2 = Math.abs(a * a + c * c - b * b) < 0.1;

        boolean result3 = Math.abs(b * b + c * c - a * a) < 0.1;

        boolean isRightTriangle = (result1 || result2 || result3);

        if (isIsosceles && isRightTriangle) {

            return 2; // 等腰直角三角形

        }

        if (isIsosceles) {

            return 1; // 等腰非直角

        }

        if (isRightTriangle) {

            return 3; // 直角非等腰

        }

        return 0; // 十三不沾

    }

    public static String checkTriangleType(double a, double b, double c) {

        // 排序以便更容易比较

        double[] sides = {a, b, c};

        java.util.Arrays.sort(sides);

        double longestSide = sides[2];

        double side1 = sides[0];

        double side2 = sides[1];

        // 锐角 | 钝角

        if (side1 * side1 + side2 * side2 > longestSide * longestSide) {

            return "锐角三角形";

        } else if (side1 * side1 + side2 * side2 < longestSide * longestSide) {

            return "钝角三角形";

        }

        return "空";

    }

}
