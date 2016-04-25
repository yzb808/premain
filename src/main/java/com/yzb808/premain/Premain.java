package com.yzb808.premain;

import java.lang.instrument.Instrumentation;

/**
 * Hello world!
 *
 */
public class Premain {
	
	/**
	 * 1. 如果改变premain方法中的内容，要重新打jar包才能生效
	 * 2. jar包中的META-INF/MAINIFEST.MF必须包含 Premain-Class这个属性
	 * 3. 一个java程序中-javaagent参数可以添加任意多个java agent，并按照添加顺序执行
	 * 	例：java -javaagent:MyAgent1.jar -javaagent:MyAgent2.jar -jar MyProgram.jar
	 * 4. 每一个java agent 都可以接收一个字符串类型的参数
	 * 	例：java -javaagent:MyAgent2.jar=thisIsAgentArgs -jar MyProgram.jar
	 */
	public static void premain(String agentArgs, Instrumentation inst) {
		System.out.println("Hello premain!");
	}
}
