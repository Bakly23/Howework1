/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.bit.ood.hw1.parse;

import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author HPBrick
 */
public interface Parser<T> {
    Iterable<T> parse(String fileName);
}
