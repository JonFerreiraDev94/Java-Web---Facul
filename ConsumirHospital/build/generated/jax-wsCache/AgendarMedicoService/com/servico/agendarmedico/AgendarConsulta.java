
package com.servico.agendarmedico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AgendarConsulta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AgendarConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgendarConsulta", propOrder = {
    "medico",
    "dia"
})
public class AgendarConsulta {

    protected String medico;
    protected String dia;

    /**
     * Obtém o valor da propriedade medico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedico() {
        return medico;
    }

    /**
     * Define o valor da propriedade medico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedico(String value) {
        this.medico = value;
    }

    /**
     * Obtém o valor da propriedade dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDia() {
        return dia;
    }

    /**
     * Define o valor da propriedade dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDia(String value) {
        this.dia = value;
    }

}
