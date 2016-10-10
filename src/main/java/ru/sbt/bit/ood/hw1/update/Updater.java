/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.bit.ood.hw1.update;

import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author HPBrick
 */
public interface Updater<T> {
    void updateTrades(Iterable<T> trades);
}
