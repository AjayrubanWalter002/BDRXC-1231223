package com.messageservice.Hello;

public @interface JmsListener {

	String destination();

	String containerFactory();

}
