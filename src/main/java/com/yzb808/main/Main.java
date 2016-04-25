package com.yzb808.main;

public class Main {

	/**
	 * 执行main方法前，启动配置中使用-javaagent:E:\eclipse\workSpace\premain\target\premain-0.0.1.jar
	 * 指定包含premain方法的jar包绝对路径
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello main! Main's classLoader:" + Main.class.getClassLoader());
	}
}
