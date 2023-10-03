package com.trail2;

import org.springframework.context.annotation.Primary;

@Primary
public interface Sample1 extends Samplel{
 public default String showName() {
	 return "ajai";
 }
}
