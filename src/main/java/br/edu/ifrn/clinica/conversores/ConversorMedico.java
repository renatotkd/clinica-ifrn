package br.edu.ifrn.clinica.conversores;

import br.edu.ifrn.clinica.models.Medico;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author maykon-oliveira
 */
@FacesConverter(value = "conversorMedico")
public class ConversorMedico implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        Medico medico = new Medico();
        medico.setId(Long.valueOf(value));
        return medico;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }
        Medico autor = (Medico) value;
        return autor.getId().toString();
    }

}
