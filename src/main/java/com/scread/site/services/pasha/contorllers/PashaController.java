package com.scread.site.services.pasha.contorllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scread.site.services.pasha.vo.Pasha;

@RestController
public class PashaController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/pasha")
    public Pasha greeting() {
        return new Pasha(counter.incrementAndGet());
    }


}
