package ru.sbt.bit.ood.hw1.download;

import org.springframework.stereotype.Service;

@Service
public class MockDownloader implements Downloader {
    @Override
    public String downloadFrom(String path) {
        System.out.println("Executing download");
        return "";
    }
}
