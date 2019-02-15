package com.c;
//等我准备好 模式
//测试程序行为的类
public class GuardedSuspensionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestQueue requestQueue = new RequestQueue();
		new ClientThread(requestQueue, "Alice", 3141592L).start();
		new ServerThread(requestQueue, "Bobby", 6535897L).start();
		
	}

}
