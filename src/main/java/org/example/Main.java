package org.example;

import io.netty.handler.codec.http3.Http3;

public class Main {
	public static void main(String[] args) {
		Http3.newQuicClientCodecBuilder();
	}
}
