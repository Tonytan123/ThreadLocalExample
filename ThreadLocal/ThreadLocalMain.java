package ThreadLocal;


/**
 * @author tucker
 */
public class ThreadLocalMain {

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalWithUserContext firstUser = new ThreadLocalWithUserContext(1);
        ThreadLocalWithUserContext secondUser = new ThreadLocalWithUserContext(2);
        Thread threadOne = new Thread(firstUser);
        Thread threadTwo = new Thread(secondUser);
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();

    }
}
