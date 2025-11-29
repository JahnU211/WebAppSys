package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pleaseSaw")
public class Sawing implements Work {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sawing.class);

    @Override
    public void doWork() {
        LOGGER.info(" ---> sawing a plank of wood");
    }
}
