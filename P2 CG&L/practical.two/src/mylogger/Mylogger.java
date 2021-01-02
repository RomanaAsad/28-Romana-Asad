package mylogger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Mylogger {

    
    public static void main(String[] args) throws IOException {
       Logger l=Logger.getLogger(Mylogger.class.getName());
FileHandler fh;
try
{
fh=new FileHandler("d:/mylogfile.log",true);
l.addHandler(fh);
l.setLevel(Level.ALL);
SimpleFormatter sf=new SimpleFormatter();
fh.setFormatter(sf);
l.info("My first log");
}
catch(SecurityException e)
{
e.printStackTrace();
}

catch(IOException e)
{
e.printStackTrace();
}
l.info("Hi How r u?");
    }
    
}