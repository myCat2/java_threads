package com.c;

import java.util.LinkedList;
import java.util.Queue;

//依次存放请求的类
public class RequestQueue {
	private final Queue<Request> queue = new LinkedList<Request>();
	public synchronized Request getRequest(){
		while(queue.peek() == null){
			try{
				wait();
			}catch(InterruptedException e){
				
			}
		}
		return queue.remove();
	}
	public synchronized void putRequest(Request request){
		queue.offer(request);
		notifyAll();
	}
}
//  96.10  97
//  96 + 1 = 97
//  96 + 10= 06 96 + 20 = 16 17 18 19