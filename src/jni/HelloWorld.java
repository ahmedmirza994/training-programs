package jni;

public class HelloWorld {
	
	static {
		
		System.load("/Users/ahmedmirza/sandbox/trigsoft/Java/src/jni/libhello.dylib"); //load native library
	}

	private native void sayHello(); //native method
	
	public static void main(String[] args) {
		new HelloWorld().sayHello();
	}
	
}
