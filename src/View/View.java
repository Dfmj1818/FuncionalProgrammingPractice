package View;

import java.util.Scanner;

public class View {
	private Scanner scanner;
	
	public View() {
		scanner=new Scanner(System.in);
	}
	
	public void printMessage(String message){
		System.out.println(message);
	}
	
	public Integer readInt() {
		return scanner.nextInt();
	}
	

}
