
package com.servico.energiaeletrica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de calcularConsumo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="calcularConsumo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leituraAnterior" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="leituraAtual" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularConsumo", propOrder = {
    "nome",
    "endereco",
    "leituraAnterior",
    "leituraAtual"
})
public class CalcularConsumo {

    protected String nome;
    protected String endereco;
    protected double leituraAnterior;
    protected double leituraAtual;

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
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade leituraAnterior.
     * 
     */
    public double getLeituraAnterior() {
        return leituraAnterior;
    }

    /**
     * Define o valor da propriedade leituraAnterior.
     * 
     */
    public void setLeituraAnterior(double value) {
        this.leituraAnterior = value;
    }

    /**
     * Obtém o valor da propriedade leituraAtual.
     * 
     */
    public double getLeituraAtual() {
        return leituraAtual;
    }

    /**
     * Define o valor da propriedade leituraAtual.
     * 
     */
    public void setLeituraAtual(double value) {
        this.leituraAtual = value;
    }

}
