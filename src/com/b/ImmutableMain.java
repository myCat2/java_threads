package com.b;
/*
 * 不易变的模式
 */
public class ImmutableMain {
	public static void main(String[] args) {
		Person alice = new Person("Alice", "Alaska");
		new PrintPersonThread(alice).start();
		new PrintPersonThread(alice).start();
		new PrintPersonThread(alice).start();
		
	}
}
