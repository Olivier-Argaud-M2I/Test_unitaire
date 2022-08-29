import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;



public class Log4jExtension implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object o, ExtensionContext extensionContext) throws Exception {
        Logger logger = LogManager.getLogger(o.getClass());
        o.getClass().getMethod("setLogger",Logger.class).invoke(o,logger);
    }
}






