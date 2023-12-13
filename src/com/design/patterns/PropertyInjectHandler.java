package com.design.patterns;

public class PropertyInjectHandler extends SOAPMessageHandler{

	@Override
	public boolean handleMessage(MessageContext mc) {
		System.out.println("Property Inject Handler");
		
		StringBuilder appendMessage = new StringBuilder(mc.getMessage());
		appendMessage.append("si "); 
		appendMessage.append("eman "); 
		appendMessage.append("ruoy"); 
		mc.setMessage(appendMessage.toString());
		
		if(handler != null){
			System.out.println("=========================");
			System.out.println(mc.getMessage());
			System.out.println();
			handler.handleMessage(mc);
		}
		return false;
	}

	@Override
	public boolean handleFault(MessageContext mc) {
		System.out.println("Property Inject Fault");
		return false;
	}

	@Override
	public void close(MessageContext mc) {
		System.out.println("Property Inject close");
	}

}
