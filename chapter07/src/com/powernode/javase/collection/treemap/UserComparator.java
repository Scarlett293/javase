package com.powernode.javase.collection.treemap;

import java.util.Comparator;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection.treemap
 * @ClassName: UserComparator
 * @Date: 2024/4/19 20:42 09
 */

/**
 * 单独的比较规则：如果比较规则发生变化，建议单独写一个比较器，这样扩展能力强，更加符合COP原则
 */
public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User user, User t1) {
        return user.getAge() - t1.getAge(); // o1是在前是升序
    }
}
