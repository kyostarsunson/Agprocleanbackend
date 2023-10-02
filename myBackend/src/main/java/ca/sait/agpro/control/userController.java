package ca.sait.agpro.control;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sait.agpro.utility.AccountInfo;
import ca.sait.agpro.utility.MyResult;

@RestController
public class userController {

//	@RequestMapping("/user")
//	public String User() {
//
//		return "user!!!!!!!!!!!!!!!";
//	}

	@RequestMapping("/userLogin")
	public MyResult login(@RequestBody AccountInfo accountInfo) {
		return MyResult.ok("User success login", accountInfo);
	}

	@RequestMapping("/appointment")
	public MyResult queryAppointment(@RequestBody AccountInfo accountInfo) {
		return MyResult.ok("queryAppointment success login", accountInfo);
	}
}
