package com.jilinwula.patterns;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("吉林乌拉", 20);
        Work work = new Work();
        work.setName("米带科技有限公司");
        resume.setWork(work);
        System.out.println(resume);

        Resume resumeCopy = (Resume) resume.copy();
        Work workCopy = new Work();
        workCopy.setName("欧了网络科技有限公司");
        resumeCopy.setWork(workCopy);
        System.out.println(resumeCopy);
    }
}
