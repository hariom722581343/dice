package Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TweetRepository {

    private final EntityManager entityManager;

    @Autowired
    public TweetRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Tweet tweet) {
        entityManager.persist(tweet);
    }

    public Tweet findById(String id) {
        return entityManager.find(Tweet.class, id);
    }

    public List<Tweet> findByUserId(String userId) {
        Query query = entityManager.createQuery("SELECT t FROM Tweet t WHERE t.user.id = :userId");
        query.setParameter("userId", userId);
        return query.getResultList();
    }

}
