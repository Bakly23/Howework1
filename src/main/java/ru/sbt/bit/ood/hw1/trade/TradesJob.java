package ru.sbt.bit.ood.hw1.trade;


import ru.sbt.bit.ood.hw1.download.Downloader;
import ru.sbt.bit.ood.hw1.parse.Parser;
import ru.sbt.bit.ood.hw1.update.Updater;

public class TradesJob {
    private final Downloader downloader;
    private final Parser<Trade> parser;
    private final Updater<Trade> updater;

    public TradesJob(Downloader downloader, Parser<Trade> parser, Updater<Trade> updater) {
        this.downloader = downloader;
        this.parser = parser;
        this.updater = updater;
    }

    public void run() {
        String fileName = downloader.downloadFrom("public/prod/trades.csv");
        Iterable<Trade> tradeRecords = parser.parse(fileName);
        updater.updateTrades(tradeRecords);
    }
}
