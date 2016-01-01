package application.web.controllers;

import application.services.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Harry on 01/01/2016.
 */
@Controller
public class TwitterController {

    @Autowired
    private TwitterService twitterService;

    //region Public Methods

    @RequestMapping("/")
    public String home(){
        return "home";
    }


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public void counter() throws Exception {


    }

    //endregion

    //region Private Methods

    //endregion

}
