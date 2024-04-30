/**
 * 关于main方法上的String[] args作用是什么？
 *      1. 作用：接收命令行参数用的
 *      2. JVM负责调用ArrayTest.main()方法
 *      JVM负责给main方法准备一个String[]一维数组的对象
 *      3. java ArrayTest abc def xyz
 *          底层JVM是怎么做的？
 *              命令行参数：“abc def xyz”
 *              JVM会将以上字符串以“空格”进行拆分，生成一个新的数组对象
 *              最后这个数组对象是：String[] args = {"abc","def","xyz"}
 * 
 *      4. 命令行参数有什么用？
 *          需求：使用该系统的时候，需要提供正确的口令（用户名和密码）
 *          如果用户名是admin，并且密码是admin123，则表示合法用户，其他用户是非法的
 *          非法用户直接退出系统
 */
public class ArrayTest09 {
    public static void main(String[] args) {


/*
        if(args.length != 2) {
            System.out.println("对不起，要使用该系统，至少需要提供用户名和密码，用户名和密码需要通过命令行参数传进来，例如：java ArrayTest09 用户名 密码");
            return;
        }

        // 取出用户名
        String username = args[0];
        // 取出密码
        String password = args[1];

        if(username.equals("admin") && password.equals("admin123")) {
            System.out.println("登录成功，欢迎使用本系统");
            System.out.println("......");
        } else {
            System.out.println("对不起，您的用户名不存在或者密码错误，请重新进入！");
            return;
        }

        */
        // System.out.println(args); // [Ljava.lang.String;@54bedef2
        // System.out.println("如果命令在使用的时候，没有提供参数，则数组的长度是" + args.length);

        // 需求：使用该系统的用户包含两种
        // 一个是普通用户
        // 一个是超级管理用户
        // 如果是超级管理员用户，在命令行参数的第一个参数上标志：admin
        // 第一个参数不是admin的，表示普通用户
        if(args.length != 3) {
            System.out.println("对不起，命令行参数不正确！");
            return;
        }

        if(args.length == 3) {
            // 普通用户
        } else {
            // 超级用户
        }
    }
}