package com.stringcomm;

import java.util.Scanner;

public class MessageStringRunner {

	public static void main(String[] args) {
		MessageString ms = new MessageString();
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER MESSAGE");
		String message = scan.nextLine();
		String word = ms.encodeMessage(message);
		System.out.println("WORD FROM COLLEAGUE:"+word);
		System.out.println("DECODE WORD PRESS ENTER");
		scan.nextLine();
		String originalMessage = ms.decodeMessage(word);
		System.out.println("ORIGINAL MESSAGE:"+originalMessage);
	}

}
