package JunitTestSystem;

import org.junit.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class DataServiceTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Run before every test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Run after every test");
    }

    @BeforeClass
    public static void setUpAll() {

    }

    @AfterClass
    public static void afterAll() {

    }

    @Test
    public void test() {
        System.out.println("Hi?");
    }

    @Test
    public void testFindMax() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> numbers2 = Arrays.asList(13, 232, 3, 43, 5, 6, 7);


        int max = DataService.findMax(numbers);
        int max2 = DataService.findMax(numbers2);

        assertThat(max).isEqualTo(7);
        assertThat(max2).isNotNull()
                .isGreaterThan(60)
                .isLessThan(100)
                .isEqualTo(232);
    }

    @Test(expected = Exception.class)
    public void testFindMaxException() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        DataService.findMax(numbers);
    }

    @Test
    public void testFindMaxByStreams() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> numbers2 = Arrays.asList(13, 232, 3, 43, 5, 6, 7, 1000);


        int max = DataService.findMaxByStreams(numbers);
        int max2 = DataService.findMaxByStreams(numbers2);

        assertThat(max).isEqualTo(7);
        assertThat(max2).isEqualTo(232);
    }

    @Test(expected = Exception.class)
    public void testFindMaxExceptionByStreams() throws Exception {
        List<Integer> numbers = null;

        DataService.findMaxByStreams(numbers);
    }

    @Test(timeout = 100)
    public void testPerformance() throws Exception {

        List<Integer> numbers = Stream.iterate(0, n -> n + 1).limit(2000)
                .collect(Collectors.toList());

        DataService.findMaxByStreams(numbers);
    }
}