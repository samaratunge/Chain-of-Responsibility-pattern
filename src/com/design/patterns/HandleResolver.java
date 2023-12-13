package com.design.patterns;

public class HandleResolver {

	public static void main(String[] args) {
		
		ValidationHandler validation = new ValidationHandler();
		PropertyInjectHandler propertyInject = new PropertyInjectHandler();
		TransformationHandler transform = new TransformationHandler();
		FormattingHandler format = new FormattingHandler();
		
		validation.setHandlerChain(propertyInject);
		propertyInject.setHandlerChain(transform);
		transform.setHandlerChain(format);
		
		MessageContext mc = new MessageContext();
		mc.setMessage("egnutaramas aradu");
		
		validation.handleMessage(mc);
		
		System.out.println(mc.getMessage());
	}

}
