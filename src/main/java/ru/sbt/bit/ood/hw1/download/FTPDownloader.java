/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.bit.ood.hw1.download;

import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author HPBrick
 */
public class FTPDownloader implements Downloader {
    private final String hostName;
    private final int port;
    private final String login;
    private final String password;
    private final FTPClient ftpClient;

    public FTPDownloader(String hostName, int port, String login, String password) {
        this.hostName = hostName;
        this.port = port;
        this.login = login;
        this.password = password;
        ftpClient = new FTPClient();
    }

    public String downloadFrom(String path) {
        try {
            ftpClient.connect(hostName, port);
            ftpClient.login(login, password);
            File tempFile = File.createTempFile("trades", "download");
            OutputStream out = new FileOutputStream(tempFile);
            ftpClient.retrieveFile(path, out);
            out.close();
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not download the file");
        }
    }
    
}
