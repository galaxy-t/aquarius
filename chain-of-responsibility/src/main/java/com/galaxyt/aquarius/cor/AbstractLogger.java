package com.galaxyt.aquarius.cor;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){

        System.out.println(this.level);

        if(this.level <= level){
            write(message);
        }

        //若责任链中已经有方法执行了，若后面有匹配条件的节点也可以执行，直到最后一个节点
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
