package com.messageservice.Hello;

public class Email {
 private String to;
 private String body;
 public void setTo(String to) {
	 this.to=to;
 }
 public String getTo() {
	 return to;
 }
 public void setBody(String body) {
	 this.body=body;
 }
 public String getBody() {
	 return body;
 }
 public Email() {
 }
 public Email(String to,String body) {
	 this.body=body;
	 this.to=to;
 }

}
