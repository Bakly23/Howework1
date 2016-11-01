package ru.sbt.bit.ood.hw1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.sbt.bit.ood.hw1.trade.TradesJob;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/simple-test-config.xml")
public class TestCsvFtpJob {
    @Autowired
    private TradesJob job;

    @Test
    public void simpleLaunch() {
        job.run();
    }
}
