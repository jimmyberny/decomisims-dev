package org.decomisims.reports;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import org.slf4j.LoggerFactory;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class JasperHelper {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(JasperHelper.class);

    /**
     * 
     * @param file
     * @return 
     */
    public static JasperReport load(String file) {
        JasperReport res = null;
        InputStream is = JasperHelper.class.getResourceAsStream(file);
        if (is != null) {
            try {
                ObjectInputStream ois = new ObjectInputStream(is);
                res = (JasperReport) ois.readObject();
            } catch (IOException ex) {
                log.error(ex.getMessage(), ex);
            } catch (ClassNotFoundException ex) {
                log.error(ex.getMessage(), ex);
            }
        }
        return res;
    }

    /**
     * 
     */
    public static void compile() {
        try {
            // Gŕafica
            URL grafica = JasperResourceLoader.class.getResource("/org/decomisims/reports/grafica.jrxml");
            JasperCompileManager.compileReportToFile(grafica.getFile());
            // Detalle Ramos SS
            URL ramos = JasperResourceLoader.class.getResource("/org/decomisims/reports/ramos.jrxml");
            JasperCompileManager.compileReportToFile(ramos.getFile());
            // Comparativo
            URL comp = JasperResourceLoader.class.getResource("/org/decomisims/reports/comparativo.jrxml");
            JasperCompileManager.compileReportToFile(comp.getFile());

        } catch (JRException ex) {
            log.error(ex.getMessage(), ex);
        }
    }

    public static void main(String[] args) {
        compile();
    }
}
