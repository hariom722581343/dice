package Service;

import twitter4j.*;
import twitter4j.auth.AccessToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwitterService {

    private final Twitter twitter;

    public TwitterService() {
        // Initialize Twitter instance with your API credentials
        String consumerKey = "YOUR_CONSUMER_KEY";
        String consumerSecret = "YOUR_CONSUMER_SECRET";
        String accessToken = "YOUR_ACCESS_TOKEN";
        String accessTokenSecret = "YOUR_ACCESS_TOKEN_SECRET";

        twitter = new TwitterFactory().getInstance();
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
        AccessToken token = new AccessToken(accessToken, accessTokenSecret);
        twitter.setOAuthAccessToken(token);
    }

    public List<Status> searchTweets(String query) throws TwitterException {
        // Perform search for tweets based on the query
        Query twitterQuery = new Query(query);
        QueryResult result = twitter.search(twitterQuery);
        return result.getTweets();
    }

    public List<Status> getUserTweets(String userId) throws TwitterException {
        // Get tweets of a specific user
        Paging paging = new Paging(1, 200); // Adjust count as per your requirement
        return twitter.getUserTimeline(userId, paging);
    }
}


