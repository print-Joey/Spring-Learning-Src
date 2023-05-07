import com.joey.config.SpringConfig;
import com.joey.domain.Account;
import com.joey.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        Account a = accountService.findById(1);
    }
    @Test
    public void testFindAll(){
        List<Account> a = accountService.findAll();
    }
}
