package com.c;
//表示一个请求的类
public class Request {
	private final String name;
	public Request(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return "[ Request " + name + " ]";
	}
	
}
