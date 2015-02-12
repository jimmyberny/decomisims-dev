package org.decomisims.reports;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jimmy
 */
public class JasperResourceLoader {

    public static Logger log = LoggerFactory.getLogger(JasperResourceLoader.class);
    //

    public static JasperReport getJasper(String path) {
        JasperReport res = null;
        InputStream in = null;
        ObjectInputStream ois = null;
        try {
            in = JasperResourceLoader.class.getResourceAsStream(path + ".ser");
            if (in == null) {
                JasperDesign design = JRXmlLoader.load(JasperResourceLoader.class.getResourceAsStream(path + ".jrxml"));
                res = JasperCompileManager.compileReport(design);
            } else {
                ois = new ObjectInputStream(in);
                res = (JasperReport) ois.readObject();
            }
        } catch (IOException | JRException | ClassNotFoundException iiex) {
            log.error(iiex.getMessage(), iiex);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ioex) {
                    log.error(ioex.getMessage(), ioex);
                }
            }
        }
        return res;
    }
}
