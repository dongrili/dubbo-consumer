package web;

import java.text.SimpleDateFormat;
import java.util.Date;

import im.dubbo.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	@Autowired
			private CountService countService;
	
	int i = 0;
	
	@ResponseBody
	@RequestMapping("/sayHello.json")
	public String sayHello(){
		
		return "hi"+ (++i);
	}
	@ResponseBody
	@RequestMapping(value="getTime")
	public String getTime(){
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		int i = countService.getCount(8);
		System.out.println(i+"_______________________________________");

		return format.format(date)+" count:"+i;
	}

}
