package com.stringcomm;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MessageStringTest {
	
	@Test
	public void testThatWhenMessageHelloEncodesToKhoor() {
		MessageString messStr = new MessageString();
		String message = "HELLO";
		assertEquals("KHOOR",messStr.encodeMessage(message));		
	}
	
	@Test
	public void testThatWhenWordKhoorDecodesToHello() {
		MessageString messStr = new MessageString();
		String word = "KHOOR";
		assertEquals("HELLO",messStr.decodeMessage(word));		
	}

}
