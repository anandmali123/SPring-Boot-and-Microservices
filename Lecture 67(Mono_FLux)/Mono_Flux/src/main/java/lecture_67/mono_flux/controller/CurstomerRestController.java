package lecture_67.mono_flux.controller;

import lecture_67.mono_flux.binding.customerEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

@RestController
public class CurstomerRestController {
    @GetMapping(value = "/event", produces = "application/json")
    public ResponseEntity<Mono<customerEvent>> getEvent(){
        customerEvent event=new customerEvent("Ashok", new Date());

        Mono<customerEvent> customerMono= Mono.just(event);

        return new ResponseEntity<Mono<customerEvent>>(customerMono, HttpStatus.OK);
    }

    @GetMapping(value = "/events",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Flux<customerEvent>> getevent(){


        //creating binding object with data

        customerEvent event = new customerEvent("Ashok", new Date());

        //creating stream for binding object

        Stream<customerEvent> customerStream = Stream.generate(()-> event);

        //create Flux object using stream

        Flux<customerEvent> cflux = Flux.fromStream(customerStream);

        //setting response interval

        Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(5));

        //combine interval flux and customer event flux
        Flux<Tuple2<Long,customerEvent>> zip = Flux.zip(intervalFlux,cflux);

        //getting Tuple value as T2

        Flux<customerEvent> fluxmap = zip.map(Tuple2::getT2);

        //sending response

        return new ResponseEntity<>(fluxmap,HttpStatus.OK);

    }


}
