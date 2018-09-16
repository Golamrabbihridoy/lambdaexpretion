package main;

public class HelloWordRunTest {
     public static void main(String[] args) {
    	 HelloRunTest hw = (name)->"hello" + name;
    	 String h=hw.sayHello("Rabbi");
    	 System.out.println(h);
     }
     
}
