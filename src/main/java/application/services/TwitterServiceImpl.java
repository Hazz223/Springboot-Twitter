package application.services;

import application.web.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import twitter4j.*;

/**
 * Created by Harry on 01/01/2016.
 */
@Service
public class TwitterServiceImpl implements TwitterService{

    @Autowired
    public SimpMessageSendingOperations messagingTemplate;

    //region Public Methods

    @Async
    @Override
    public void twitterStream() {
        TwitterStream twitterStream = new TwitterStreamFactory().getInstance();

        TwitterListener listener = new TwitterListener(this.messagingTemplate);

        twitterStream.addListener(listener);

        FilterQuery filter = new FilterQuery();
        String[] keywordsArray = { "cats", "dogs" };
        filter.track(keywordsArray);
        twitterStream.filter(filter);
    }


    //endregion

    //region Private Methods

    //endregion

}
