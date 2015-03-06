package org.decomisims.reports;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
        } catch (IOException ex) {
            log.error(ex.getMessage(), ex);
        } catch (JRException ex) {
            log.error(ex.getMessage(), ex);
        } catch (ClassNotFoundException iiex) {
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

    public static JasperReport generate(String path, String output) {
        JasperReport res = null;
        InputStream in = null;
        ObjectInputStream ois = null;
        try {
            in = JasperResourceLoader.class.getResourceAsStream(path + ".ser");
            if (in == null) {
                JasperDesign design = JRXmlLoader.load(JasperResourceLoader.class.getResourceAsStream(path + ".jrxml"));
                res = JasperCompileManager.compileReport(design);

                File fOut = new File(output);
                OutputStream out = new FileOutputStream(fOut);

                ObjectOutputStream objOut = new ObjectOutputStream(out);
                objOut.writeObject(res);
                objOut.flush();
                objOut.close();
            } else {
                ois = new ObjectInputStream(in);
                res = (JasperReport) ois.readObject();
            }
        } catch (IOException ex) {
            log.error(ex.getMessage(), ex);
        } catch (JRException ex) {
            log.error(ex.getMessage(), ex);
        } catch (ClassNotFoundException iiex) {
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

    public static void main(String[] args) {
        // JasperReport t1 = getJasper("org/decomisims/reports/grafica");
        // log.info("Ok 1");
        generate("/org/decomisims/reports/grafica", "grafica.ser");
        log.info("Ok 1");
        generate("/org/decomisims/reports/ramos", "ramos.ser");
        log.info("Ok 2");
        generate("/org/decomisims/reports/comparativo", "comparativo.ser");
        log.info("Ok 3");
    }
}
