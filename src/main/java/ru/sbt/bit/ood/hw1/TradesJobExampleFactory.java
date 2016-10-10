/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.bit.ood.hw1;

import ru.sbt.bit.ood.hw1.download.FTPDownloader;
import ru.sbt.bit.ood.hw1.parse.CSVRecordParser;
import ru.sbt.bit.ood.hw1.update.CSVUpdater;

/**
 *
 * @author HPBrick
 */
public class TradesJobExampleFactory {
    //Just an example factory to show how TradesJob may be initiated now.
    //Have not implemented parameter passing as no such requirement has been given.
    public static TradesJob getTradesJob() {
        return new TradesJob(new FTPDownloader("localhost", 8090, "foo", "password"), 
                new CSVRecordParser(), 
                new CSVUpdater(new TradesDAO()));
    }
}
