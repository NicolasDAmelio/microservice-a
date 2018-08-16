package com.ndamelio.learning.microservicea;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RandomNumberController {

    private static final Logger LOG = LoggerFactory.getLogger(RandomNumberController.class);

    @RequestMapping("/random")
    public List<Integer> random() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(generateRandomNumber());
        }
        LOG.warn("Returning {}", numbers);
        return numbers;
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 1000);
    }
}