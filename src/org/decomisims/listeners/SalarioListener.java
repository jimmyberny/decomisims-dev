package org.decomisims.listeners;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.decomisims.error.AppException;
import org.decomisims.util.Format;
import org.decomisims.vistas.HorasExtra;

/**
 *
 * @author José Bernardo Gómez-Andrade
 */
public class SalarioListener implements DocumentListener {

    private final JTextField field;
    private final HorasExtra extra;

    public SalarioListener(JTextField field, HorasExtra extra) {
        this.field = field;
        this.extra = extra;
        field.getDocument().addDocumentListener(this);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        eval();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        eval();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        eval();
    }

    private void eval() {
        try {
            Double diario = Format.CURRENCY.parse(field.getText());
            extra.setSalarioHora(Format.CURRENCY.format(diario / 8));
        } catch (AppException ex) {

        }
    }

}
