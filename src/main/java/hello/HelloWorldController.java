package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.json.simple.JSONObject;
@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj){

       // System.out.println(obj);
       //JSONObject obj1 = new JSONObject(obj);
       //String n = obj1.getString("result");
        String n="Hello,I am Sakshi";
        return new WebhookResponse("Hello! " + n, "Text " + obj);
    }
}
