package Service;

import twitter4j.*;
import twitter4j.auth.AccessToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwitterService {

    private RestTemplate restTemplate;
    private final String TWITTER_API_URL = "https://api.twitter.com/1.1";

    @Autowired
    public TwitterService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<Object> searchTweetUser(String username) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer YOUR_TWITTER_API_KEY");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String url = TWITTER_API_URL + "/search/tweets.json?q=" + username;
        return restTemplate.exchange(url, HttpMethod.GET, entity, Object.class);
    }

    public ResponseEntity<Object> getTweetsOfUser(String userId) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer YOUR_TWITTER_API_KEY");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String url = TWITTER_API_URL + "/statuses/user_timeline.json?user_id=" + userId;
        return restTemplate.exchange(url, HttpMethod.GET, entity, Object.class);
    }
}
