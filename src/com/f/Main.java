package com.f;
//Read-Write Lock
public class Main {

	public static void main(String[] args) {
		Data data = new Data(10);
		
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new WriterThread(data,"ABCDEFGHIGKLMNOPQRSTUVWXYZ").start();;
		new WriterThread(data,"abcdefghigklmnopqrstuvwxyz").start();;

	}

}
