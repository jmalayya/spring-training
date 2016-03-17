import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jweeta.malayya on 3/14/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/app-context.xml")
public class InitDisposableBeanTest {

    @Test
    public void InitDisposableBeanTest() {
        System.out.println("##testing InitDisposableBeanTest##");
    }

}
