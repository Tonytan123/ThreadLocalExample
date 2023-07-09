package ThreadLocal;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tucker
 */
public class UserRepository {

    String getUserNameForUserId(Integer userId) {
        Map<Integer, String> userIdMap = new HashMap<>();
        userIdMap.put(1, "Alice");
        userIdMap.put(2, "Bob");
        return userIdMap.get(userId);
    }
}
