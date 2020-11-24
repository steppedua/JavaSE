package JunitTestSystem.dao;

import JunitTestSystem.model.User;
import JunitTestSystem.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;


public class UserDaoTest {

    @Mock
    private UserDao userDao;

    private UserService userService;

    public UserDaoTest() {
        MockitoAnnotations.initMocks(this);
        this.userService = new UserService(userDao);
    }

    @Test
    public void checkUserPresence_Should_Return_True() throws Exception {
        given(userDao.getUserByUsername("olga@gmail.com"))
                .willReturn(new User("olga@gmail.com"));

        boolean userExists = userService
                .checkUserPresence(new User("olga@gmail.com"));

        assertThat(userExists).isTrue();
    }

    @Before
    public void setUp() throws Exception {
        this.userDao = new UserDaoImpl();
    }

    @Test
    public void getUserByUsername_Should_Return_True() throws Exception {
        User remy = userDao.getUserByUsername("remy@gmail.com");

        assertThat(remy).isNotNull();
        assertThat(remy.getUsername()).isEqualTo("remy@gmail.com");
    }

    @Test
    public void getUserByUsername_Null_User() throws Exception {
        User alex = userDao.getUserByUsername("alex@gmail.com");

        assertThat(alex).isNull();

    }

    @Test
    public void findAllUsers_Contain() throws Exception {
        List<User> allUsers = userDao.findAllUsers();
        assertThat(allUsers.get(2)).isEqualToComparingFieldByField(
                new User("remy@gmail.com", "ADMIN"));

        assertThat(allUsers).contains(new User("remy@gmail.com", "ADMIN"));
    }
}