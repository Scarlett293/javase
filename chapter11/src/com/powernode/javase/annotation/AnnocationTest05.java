package com.powernode.javase.annotation;

/**
 * @author :29369
 * @Package: com.powernode.javase.annotation
 * @ClassName: AnnocationTest05
 * @Date: 2024/4/25 12:43 01
 */
@MyAnnocation
public class AnnocationTest05 {
    @MyAnnocation
    private String name;


    @MyAnnocation
    public void doSome() {}


    public void doOther(@MyAnnocation String name, @MyAnnocation String password) {}


    public void toDo(
            @MyAnnocation
            String name,
            @MyAnnocation
            String password
    ) {}
}
