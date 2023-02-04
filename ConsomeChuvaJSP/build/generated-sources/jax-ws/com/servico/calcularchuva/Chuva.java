
package com.servico.calcularchuva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de chuva complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="chuva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duracao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="indice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chuva", propOrder = {
    "duracao",
    "indice",
    "local",
    "qtd"
})
public class Chuva {

    protected double duracao;
    protected double indice;
    protected String local;
    protected double qtd;

    /**
     * Obtém o valor da propriedade duracao.
     * 
     */
    public double getDuracao() {
        return duracao;
    }

    /**
     * Define o valor da propriedade duracao.
     * 
     */
    public void setDuracao(double value) {
        this.duracao = value;
    }

    /**
     * Obtém o valor da propriedade indice.
     * 
     */
    public double getIndice() {
        return indice;
    }

    /**
     * Define o valor da propriedade indice.
     * 
     */
    public void setIndice(double value) {
        this.indice = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade qtd.
     * 
     */
    public double getQtd() {
        return qtd;
    }

    /**
     * Define o valor da propriedade qtd.
     * 
     */
    public void setQtd(double value) {
        this.qtd = value;
    }

}
