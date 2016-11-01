/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.bit.ood.hw1.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbt.bit.ood.hw1.trade.Trade;
import ru.sbt.bit.ood.hw1.trade.TradesDAO;

/**
 *
 * @author HPBrick
 */
@Service
public class CSVUpdater implements Updater<Trade> {
    private final TradesDAO tradesDAO;

    @Autowired
    public CSVUpdater(TradesDAO tradesDao) {
        this.tradesDAO = tradesDao;
    }
    
    public void updateTrades(Iterable<Trade> trades) {
        tradesDAO.deleteAll();
        trades.forEach((tradesDAO::save));
    }
}
