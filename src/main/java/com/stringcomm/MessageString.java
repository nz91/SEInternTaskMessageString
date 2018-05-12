package com.stringcomm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageString {
	
	private char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	//convert message to numbers
	private int[] convertLettersToNumbers(char[] letters) {
		int arrLen = letters.length;
		int[] nums = new int[arrLen];
		List<Character> list = new ArrayList<Character>();
		for(char c:alphabet) {
			list.add(c);
		}
		for(int i=0;i<arrLen;i++) {
			nums[i]=list.indexOf(letters[i]);
		}
		return nums;
	}
	
	//convert numbers back to letters
	private char[] convertNumbersToLetters(int[] nums) {
		int arrLen = nums.length;
		char[] letters = new char[arrLen];
		for(int i=0;i<arrLen;i++) {
			letters[i]=alphabet[nums[i]];
		}
		return letters;
	}
	
	//encodes message
	public String encodeMessage(String message) {
		char[] messageArr = message.toUpperCase().toCharArray();
		int arrLen=messageArr.length;
		int[] numMess = convertLettersToNumbers(messageArr);
		int[] incrNumArr = new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			incrNumArr[i]=numMess[i]+3;//increment each number by 3
		}
		char[] encMessArr= convertNumbersToLetters(incrNumArr);
		String encMessage = new String(encMessArr);
		return encMessage;
	}
	
	//decodes message
	public String decodeMessage(String word) {
		char[] wordArr = word.toCharArray();
		int arrLen=wordArr.length;
		int[] numMess = convertLettersToNumbers(wordArr);
		int[] subNumArr=new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			subNumArr[i]=numMess[i]-3;//subtract each number by 3
		}
		char[] decWordArr=convertNumbersToLetters(subNumArr);
		String decWord = new String(decWordArr);
		return decWord;
	}

}
