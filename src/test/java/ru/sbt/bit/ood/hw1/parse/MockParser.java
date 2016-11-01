package ru.sbt.bit.ood.hw1.parse;

import org.springframework.stereotype.Service;
import ru.sbt.bit.ood.hw1.trade.Trade;

import java.util.ArrayList;

@Service
public class MockParser implements Parser<Trade> {
    @Override
    public Iterable<Trade> parse(String fileName) {
        System.out.println("Executing parsing.");
        return new ArrayList<>();
    }
}
