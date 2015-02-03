package org.decomisims.reports;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.decomisims.modelo.RamoISR;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jimmy
 */
public class JRComparativo extends javax.swing.JPanel {

    private static final long serialVersionUID = 1123581321L;
    private static final Logger log = LoggerFactory.getLogger(JRComparativo.class);
    //
    private JasperReport jr;

    public JRComparativo() {
        initComponents();

        InputStream is = getClass().getResourceAsStream("/org/decomisims/reports/comparativo.ser");
        try {
            if (is == null) {
                JasperDesign jd = JRXmlLoader.load(
                        getClass().getResourceAsStream("/org/decomisims/reports/comparativo.jrxml"));
                jr = JasperCompileManager.compileReport(jd);

                OutputStream os = new FileOutputStream("vale_mini.ser");
                OutputStream bos = new BufferedOutputStream(os, 32);

                ObjectOutputStream oos = new ObjectOutputStream(bos);
                oos.writeObject(jr);
                oos.close();
            } else {
                ObjectInputStream ois = new ObjectInputStream(is);
                jr = (JasperReport) ois.readObject();
                ois.close();
            }
        } catch (ClassNotFoundException cnfex) {
            log.error(cnfex.getMessage(), cnfex);
        } catch (IOException ioex) {
            log.error(ioex.getMessage(), ioex);
        } catch (JRException ex) {
            log.error(ex.getMessage(), ex);
        }
    }

    public boolean isAvailable() {
        return jr != null;
    }

    public void doReport(Comparativo comp, 
            List<BaseTributaria> datos,
            List<RamoISR> ramos) {
        if (jr == null) {
            return;
        }
        try {
            Map<String, Object> params = new HashMap<>(4);

            // 
            params.put("FECHA", new Date());
            params.put("COMPARATIVO", comp);
            params.put("RAMOS", ramos);
            params.put("GRAFICA", datos);
            // Esta
            ResourceBundle bundle = ResourceBundle.getBundle("org/decomisims/reports/comparativo", Locale.getDefault());
            params.put("REPORT_RESOURCE_BUNDLE", bundle);

            // 
            
            JasperPrint jp = JasperFillManager.fillReport(jr, params, new JREmptyDataSource(1));
            jrvView.update(jp);
        } catch (JRException jrex) {
            log.error(jrex.getMessage(), jrex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrvView = new org.decomisims.reports.JRViewerExt();

        setLayout(new java.awt.BorderLayout());
        add(jrvView, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.decomisims.reports.JRViewerExt jrvView;
    // End of variables declaration//GEN-END:variables
}
