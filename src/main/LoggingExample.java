package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;

public class LoggingExample {

    static Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
        } catch (SecurityException | IOException e1) {
            Logger.getGlobal();
            e1.printStackTrace();
        }
        logger.setLevel(Level.FINE);
        logger.addHandler(new ConsoleHandler());
        //adding custom handler
        logger.addHandler(new MyHandler());
        try {
            //FileHandler file name with max size and number of log files limit
            Handler fileHandler = new FileHandler("/Users/pankaj/tmp/logger.log", 2000, 5);
            fileHandler.setFormatter(new MyFormatter());
            //setting custom filter for FileHandler
            fileHandler.setFilter(new MyFilter());
            logger.addHandler(fileHandler);

            for(int i=0; i<1000; i++){
                //logging messages
                logger.log(Level.INFO, "Msg" +i);

            }
            logger.log(Level.CONFIG, "Config data");
        } catch (SecurityException | IOException e) {

            e.printStackTrace();
            Logger.getGlobal();
        }
    }

    private static class MyFilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord record) {
            return false;
        }
    }

    private static class MyHandler extends Handler {
        @Override
        public void publish(LogRecord record) {
            throw new UnsupportedOperationException();

        }

        @Override
        public void flush() throws UnsupportedOperationException{
            throw new UnsupportedOperationException();

        }

        @Override
        public void close() throws SecurityException  {
            throw new UnsupportedOperationException();

        }
    }

    private static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return null;
        }
    }
}
