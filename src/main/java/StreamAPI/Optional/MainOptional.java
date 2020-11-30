package StreamAPI.Optional;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        Optional<String> name1 = Optional.of("John");
        System.out.println(name1); //output Optional[John]

//        Optional<String> name2 = Optional.of(null); // java.lang.NullPointerException
//        System.out.println(name2);

        Optional<String> name3 = Optional.ofNullable("John");
        System.out.println(name3); //output Optional[John]

        String john = null;
        Optional<String> name4 = Optional.ofNullable(john);
        System.out.println(name4); //output Optional.empty

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional); //output Optional.empty

        Optional<String> john1 = Optional.of("John");
        if (john1.isPresent()) {             //условие выполнится и мы увидим имя
            System.out.println(john1.get()); //output John
        }

        Optional<Object> empty1 = Optional.empty();
        if (empty1.isPresent()) {            //условие не выполнится, значит исключения не будет
            System.out.println(empty1.get());
        }


        Optional<String> john2 = Optional.of("John");
        john2.ifPresent(val -> System.out.println(val)); //условие выполнится и мы увидим John

        Optional<Object> empty2 = Optional.empty();
        empty2.ifPresent(System.out::println); //условие не выполнится, действие игнорируется

        Optional<String> orElseJohn1 = Optional.of("John");
        System.out.println(orElseJohn1.orElse("blank"));

        Optional<String> orElseJohn2 = Optional.of("LOL");
        System.out.println(orElseJohn2.orElseThrow(RuntimeException::new));

        Optional<String> name = Optional.of("JOHN");
        System.out.println(name.map(String::toLowerCase));  //output Optional[john]

        Optional<String> empty3 = Optional.empty();
        System.out.println(empty3.map(String::toLowerCase)); //output Optional.empty

        Optional<Optional<String>> name5 = Optional.of(Optional.of("JOHN"));
        Optional<String> lowerCaseName = name5.flatMap(o -> o.map(String::toLowerCase));
        System.out.println(lowerCaseName);  //output Optional[john]

        Optional<Optional<String>> empty4 = Optional.of(Optional.empty());
        System.out.println(empty4.flatMap(o -> o.map(String::toLowerCase))); //output Optional.empty
    }
}