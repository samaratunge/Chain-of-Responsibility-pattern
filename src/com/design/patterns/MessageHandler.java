package com.design.patterns;

interface MessageHandler {
	
	boolean handleMessage(MessageContext mc);
	
	boolean handleFault(MessageContext mc);
	
	void close(MessageContext mc);

}
