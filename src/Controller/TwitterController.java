package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/twitter")
public class TwitterController {

    private final TwitterService twitterService;

    @Autowired
    public TwitterController(TwitterService twitterService) {
        this.twitterService = twitterService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Status>> searchTweets(@RequestParam String query) {
        try {
            List<Status> tweets = twitterService.searchTweets(query);
            return ResponseEntity.ok(tweets);
        } catch (TwitterException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while searching tweets: " + e.getMessage());
        }
    }

    @GetMapping("/user/{userId}/tweets")
    public ResponseEntity<List<Status>> getUserTweets(@PathVariable String userId) {
        try {
            List<Status> userTweets = twitterService.getUserTweets(userId);
            return ResponseEntity.ok(userTweets);
        } catch (TwitterException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while getting user tweets: " + e.getMessage());
        }
    }
}
