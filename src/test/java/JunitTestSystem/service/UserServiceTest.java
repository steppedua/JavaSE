package JunitTestSystem.service;

import JunitTestSystem.dao.UserDao;
import JunitTestSystem.model.User;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class UserServiceTest {

    @Mock
    private UserDao userDao;

    private UserService userService;

    public UserServiceTest() {
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

        //verify
        verify(userDao).getUserByUsername("olga@gmail.com");
    }

    @Test
    public void checkUserPresence_Should_Return_False() throws Exception {
        given(userDao.getUserByUsername("olga@gmail.com"))
                .willReturn(null);

        boolean userExists = userService
                .checkUserPresence(new User("olga@gmail.com"));

        assertThat(userExists).isFalse();
    }

    @Test(expected = Exception.class)
    public void checkUserPresence_Should_Throw_Exception() throws Exception {
        given(userDao.getUserByUsername(anyString()))
                .willThrow(Exception.class);

        userService
                .checkUserPresence(new User("olga@gmail.com"));
    }

    @Test
    public void testCaptor() throws Exception {
        given(userDao.getUserByUsername(anyString()))
                .willReturn(new User("olga@gmail.com"));

        boolean b = userService.checkUserPresence(new User("olga@gmail.com"));

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(userDao).getUserByUsername(captor.capture());
        String argument = captor.getValue();

        assertThat(argument).isEqualTo("olga@gmail.com");
    }
}