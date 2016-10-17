/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.bit.ood.hw1.parse;

import org.apache.commons.csv.CSVFormat;
import ru.sbt.bit.ood.hw1.Trade;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author HPBrick
 */
public class CSVRecordParser implements Parser<Trade> {

    public Iterable<Trade> parse(String fileName) {
        try {
            Reader in = new FileReader(fileName);
            Collection<Trade> trades = new ArrayList<>();
            CSVFormat.EXCEL.parse(in).forEach((csvRecord) ->
                    trades.add(new Trade(csvRecord.toMap()))
            );
            return trades;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }
    
}
