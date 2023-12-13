package com.design.patterns;

public class TransformationHandler extends SOAPMessageHandler{

	@Override
	public boolean handleMessage(MessageContext mc) {
		System.out.println("Transformation Handler");
		
		StringBuilder appendMessage = new StringBuilder(mc.getMessage());
		appendMessage.reverse(); 
		mc.setMessage(appendMessage.toString());
		
		if(handler != null){
			System.out.println("=========================");
			System.out.println(mc.getMessage());
			handler.handleMessage(mc);
		}
		return false;
	}

	@Override
	public boolean handleFault(MessageContext mc) {
		System.out.println("Transformation Fault");
		return false;
	}

	@Override
	public void close(MessageContext mc) {
		System.out.println("Transformation close");
	}
}
