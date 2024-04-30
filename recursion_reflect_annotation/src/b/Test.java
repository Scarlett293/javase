package b;

import annotation.Column;
import annotation.Table;

import java.io.File;
import java.lang.reflect.Field;

/**
 * ClassName: Test
 * Decription:
 * Package: b
 * Date: 2024/4/25 15:48
 * Author: Scalett
 * Version: 1.0
 */
public class Test {
    private static String classpathRoot;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        // 扫描类路径当中所有的文件，找到所有的.class文件
        // 通过.class文件的路径找到对应的全限定类名（全限定类名是带包名的）
        classpathRoot = Thread.currentThread().getContextClassLoader().getResource(".").getPath();
        //System.out.println(classpathRoot);
        // 创建File对象
        File file = new File(classpathRoot);
        // 调用方法生成建表语句
        generateCreateStatement(file);
        System.out.println(sb);
    }

    /**
     * 通过这个方法，来生成建表语句
     *
     * @param file 起初的这个file代表的是类的根目录
     */
    private static void generateCreateStatement(File file) {
        if (file.isFile()) { // file是一个文件的时候，递归结束
            String classFileAbsolutePath = file.getAbsolutePath();
            if(classFileAbsolutePath.endsWith(".class")) {
                // 判断执行到这里，表示文件一定是一个字节码文件
                String className = classFileAbsolutePath.substring(classpathRoot.length() - 1, classFileAbsolutePath.length() - ".class".length()).replace("\\", ".");

                try {
                    Class<?> clazz = Class.forName(className);
                    if(clazz.isAnnotationPresent(Table.class)) {
                        Table tableAnnotation = clazz.getAnnotation(Table.class);
                        // 获取到表的名字
                        String tableName = tableAnnotation.value();

                        sb.append("create table");
                        sb.append(tableName);
                        sb.append("(");

                        // 获取所有的属性
                        Field[] fields = clazz.getDeclaredFields();
                        for (Field field : fields) {
                            // 判断上字段上是否存在Column注解
                            if(field.isAnnotationPresent(Column.class)) {
                                // 获取到字段的名字
                                Column columnAnnotation = field.getAnnotation(Column.class);
                                // 字段名
                                String columnName = columnAnnotation.name();
                                sb.append(columnName);
                                sb.append(" ");
                                // 字段的类型
                                String columnType = columnAnnotation.type();
                                sb.append(columnType);
                                sb.append(",");
                            }
                        }

                        // 删除当前sb中的最后一个逗号
                        sb.deleteCharAt(sb.length() - 1);
                        sb.append(");\n");
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
            return;
        }
        File[] files = file.listFiles();
        for (File f : files) {
            generateCreateStatement(f);
        }
    }
}
