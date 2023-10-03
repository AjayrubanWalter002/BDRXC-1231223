package com.email.Entity;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
 private String recepient;
 private String msgBody;
 private String subject;
 private String attachment;
public String getRecepient() {
	return recepient;
}
public void setRecepient(String recepient) {
	this.recepient = recepient;
}
public String getMsgBody() {
	return msgBody;
}
public void setMsgBody(String msgBody) {
	this.msgBody = msgBody;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getAttachment() {
	return attachment;
}
public void setAttachment(String attachment) {
	this.attachment = attachment;
}
 
}
