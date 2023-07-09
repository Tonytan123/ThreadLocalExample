package noThreadLocal;

import org.junit.Assert;

/**
 * @author tucker
 */
public class NoThreadLocalMain {

    public static void main(String[] args) throws InterruptedException {
        SharedMapWithUserContext firstUser = new SharedMapWithUserContext(1);
        SharedMapWithUserContext secondUser = new SharedMapWithUserContext(2);
        Thread threadOne = new Thread(firstUser);
        Thread threadTwo = new Thread(secondUser);
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        Assert.assertEquals(2, SharedMapWithUserContext.userContextPerUserId.size());
    }
}
