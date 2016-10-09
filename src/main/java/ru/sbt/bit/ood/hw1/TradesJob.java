package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.net.ftp.FTPClient;

import java.io.*;
import ru.sbt.bit.ood.hw1.download.Downloader;
import ru.sbt.bit.ood.hw1.download.FTPDownloader;
import ru.sbt.bit.ood.hw1.parse.CSVRecordParser;
import ru.sbt.bit.ood.hw1.parse.Parser;
import ru.sbt.bit.ood.hw1.update.Updater;
import ru.sbt.bit.ood.hw1.update.UpdaterImpl;

public class TradesJob {

    private final Downloader downloader;
    private final Parser parser;
    private final Updater updater;

    public TradesJob(Downloader downloader, Parser parser, Updater updater) {
        this.downloader = downloader;
        this.parser = parser;
        this.updater = updater;
    }    

    public void run() {
        String fileName = downloader.downloadFrom("public/prod/trades.csv");
        Iterable<CSVRecord> tradeRecords = parser.parse(fileName);
        updater.updateTrades(tradeRecords);
    }
}
