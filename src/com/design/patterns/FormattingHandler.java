package com.design.patterns;

public class FormattingHandler extends SOAPMessageHandler{

	@Override
	public boolean handleMessage(MessageContext mc) {
		System.out.println("\nUppercase Format Handler");
		System.out.println("=========================");
		
		mc.setMessage(mc.getMessage().toUpperCase());
		
		if(handler != null){
			System.out.println(mc.getMessage());
			handler.handleMessage(mc);
		}
		return false;
	}

	@Override
	public boolean handleFault(MessageContext mc) {
		System.out.println("Uppercase Format Fault");
		return false;
	}

	@Override
	public void close(MessageContext mc) {
		System.out.println("Uppercase Format close");
	}
}
