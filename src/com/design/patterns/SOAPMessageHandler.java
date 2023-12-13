package com.design.patterns;

public abstract class SOAPMessageHandler implements MessageHandler{
	
	MessageHandler handler;
	
	public void setHandlerChain(MessageHandler handler){
		this.handler = handler;
	}
}
