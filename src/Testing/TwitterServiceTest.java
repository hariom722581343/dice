package Testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import twitter4j.Status;
import twitter4j.TwitterException;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TwitterServiceTest {

    @Mock
    private TwitterRepository twitterRepository;

    @InjectMocks
    private TwitterService twitterService;

    @Test
    public void testSearchTweets() throws TwitterException {
        // Mocking the repository method to return dummy data
        List<Status> dummyTweets = new ArrayList<>();
        // Add dummy tweets to the list
        when(twitterRepository.searchTweets(anyString())).thenReturn(dummyTweets);

        // Calling the service method
        List<Status> searchResult = twitterService.searchTweets("java");

        // Assertions
        assertEquals(0, searchResult.size()); // Update with expected size and content
    }

    @Test
    public void testGetUserTweets() throws TwitterException {
        // Mocking the repository method to return dummy data
        List<Status> dummyUserTweets = new ArrayList<>();
        // Add dummy tweets to the list
        when(twitterRepository.getUserTweets(anyString())).thenReturn(dummyUserTweets);

        // Calling the service method
        List<Status> userTweets = twitterService.getUserTweets("user1");

        // Assertions
        assertEquals(0, userTweets.size()); // Update with expected size and content
    }
}
