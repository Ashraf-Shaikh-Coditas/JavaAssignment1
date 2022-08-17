class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
	}	
}

/* OUTPUT  

C:\Users\Coditas\Assignments\Week2\Assignment 1>javac HelloWorld_Batch2.java

C:\Users\Coditas\Assignments\Week2\Assignment 1>java HelloWorld_Batch2
Error: Could not find or load main class HelloWorld_Batch2


*/

// Here when we compile the code .class file gets generated successfully .
// But for interpretation it is showing error because we are using a wrong .class file for interpretation.
//Its by default name will be HelloWord.class
//So to interpret above program successfully , we should use classname for interpretation.
// LIKE : java HelloWorld
