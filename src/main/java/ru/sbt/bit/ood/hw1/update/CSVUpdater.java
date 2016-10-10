/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.bit.ood.hw1.update;

import org.apache.commons.csv.CSVRecord;
import ru.sbt.bit.ood.hw1.Trade;
import ru.sbt.bit.ood.hw1.TradesDAO;

/**
 *
 * @author HPBrick
 */
public class CSVUpdater implements Updater<CSVRecord> {
    private final TradesDAO tradesDAO;

    public CSVUpdater(TradesDAO tradesDao) {
        this.tradesDAO = tradesDao;
    }
    
    public void updateTrades(Iterable<CSVRecord> trades) {
        tradesDAO.deleteAll();
        for (CSVRecord tradeRecord : trades) {
            Trade trade = new Trade(tradeRecord.toMap());
            tradesDAO.save(trade);
        }
    }
}
