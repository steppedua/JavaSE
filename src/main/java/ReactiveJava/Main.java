package ReactiveJava;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Mono.empty();
        Flux.empty();
        Mono<Integer> mono = Mono.just(1);
        Flux<Integer> flux = Flux.just(1, 2, 3);

        Flux<Integer> fluxFromMono = mono.flux();
        Mono<Boolean> monoFromFlux = flux.any(s -> s.equals(1));
        Mono<Integer> integerMono = flux.elementAt(1);

        Flux.range(1, 5);
        Flux.fromIterable(Arrays.asList(1, 2, 3));

        Flux.<String>generate(sink -> {
            sink.next("hello");
        })
                .delayElements(Duration.ofMillis(500))
                .take(4);

        Flux<Object> telegramProducer = Flux.generate(
                () -> 2354,
                (state, sink) -> {
                    if (state > 2366) {
                        sink.complete();
                    } else {
                        sink.next("Step: " + state);
                    }
                    return state + 3;
                }
        );

        Flux
                .create(sink -> {
                    //Первый способ
                    telegramProducer.subscribe(new BaseSubscriber<Object>() {
                        @Override
                        protected void hookOnNext(Object value) {
                            sink.next(value);
                        }

                        @Override
                        protected void hookOnComplete() {
                            sink.complete();
                        }
                    });
                    //Второй способ
                    sink.onRequest(r -> {
                        sink.next("DB returns " + telegramProducer.blockFirst());
                    });
                });

        Flux<String> second = Flux
                .just("World", "coder")
                .repeat();

        Flux<String> sumFlux = Flux
                .just("hello", "ed", "java", "Linus", "Asia", "java")
                .zipWith(second, (f, s) -> String.format("%s %s", f, s));

        Flux<String> stringFlux = sumFlux.
                delayElements(Duration.ofMillis(1300))
                .timeout(Duration.ofSeconds(1))
//                .retry(3)
//                .onErrorReturn("Too slow")
                .onErrorResume(throwable ->
                        Flux.interval(Duration.ofMillis(300))
                                .map(String::valueOf)
                )
                .skip(2)
                .take(3);


        stringFlux.subscribe(
                v -> System.out.println(v),
                e -> System.out.println(e),
                () -> System.out.println("finished")
        );

        Thread.sleep(40001);
    }
}
