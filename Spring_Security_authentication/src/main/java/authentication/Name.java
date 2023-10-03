package authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
 @GetMapping("/All")
public String name1()	{
	 return "Hello All User";
 }
 @GetMapping("/user")
 public String name2() {
	 return "Hello user";
 }
 @GetMapping("/Admin")
 public String name3() {
	 return "hello Admin";
 }
}
