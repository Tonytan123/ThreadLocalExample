package noThreadLocal;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author tucker
 */
public class SharedMapWithUserContext implements Runnable {
    public static Map<Integer, Context> userContextPerUserId = new ConcurrentHashMap<>();
    private Integer userId;
    private UserRepository userRepository = new UserRepository();

    @Override
    public void run() {
        String userName = userRepository.getUserNameForUserId(userId);
        userContextPerUserId.put(userId, new Context(userName));
        System.out.println(SharedMapWithUserContext.userContextPerUserId.size());
    }

    SharedMapWithUserContext(Integer value) {
        this.userId = value;
    }
// standard constructor
}