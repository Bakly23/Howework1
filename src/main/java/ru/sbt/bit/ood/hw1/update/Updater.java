/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.bit.ood.hw1.update;

/**
 *
 * @author HPBrick
 */
public interface Updater<Trade> {
    void updateTrades(Iterable<Trade> trades);
}
