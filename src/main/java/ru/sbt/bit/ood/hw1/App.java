package ru.sbt.bit.ood.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import ru.sbt.bit.ood.hw1.trade.TradesJob;

/**
 * Created by Georgii Kolpakov on 01.11.16.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("bean.xml");
        TradesJob job = ctx.getBean("csvFtpJob", TradesJob.class);
        job.run();
    }
}
