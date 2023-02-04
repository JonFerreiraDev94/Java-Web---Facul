
package com.servico.calculararimc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de individuo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="individuo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="imc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individuo", propOrder = {
    "altura",
    "imc",
    "nome",
    "peso"
})
public class Individuo {

    protected double altura;
    protected double imc;
    protected String nome;
    protected double peso;

    /**
     * Obtém o valor da propriedade altura.
     * 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define o valor da propriedade altura.
     * 
     */
    public void setAltura(double value) {
        this.altura = value;
    }

    /**
     * Obtém o valor da propriedade imc.
     * 
     */
    public double getImc() {
        return imc;
    }

    /**
     * Define o valor da propriedade imc.
     * 
     */
    public void setImc(double value) {
        this.imc = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade peso.
     * 
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Define o valor da propriedade peso.
     * 
     */
    public void setPeso(double value) {
        this.peso = value;
    }

}
