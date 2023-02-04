
package com.servico.energiaeletrica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de unidadeConsumidora complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="unidadeConsumidora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leituraAnterior" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="leituraAtual" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nomeProprietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidadeConsumida" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="valorPagar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="valorTarifa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unidadeConsumidora", propOrder = {
    "endereco",
    "leituraAnterior",
    "leituraAtual",
    "nomeProprietario",
    "quantidadeConsumida",
    "valorPagar",
    "valorTarifa"
})
public class UnidadeConsumidora {

    protected String endereco;
    protected double leituraAnterior;
    protected double leituraAtual;
    protected String nomeProprietario;
    protected double quantidadeConsumida;
    protected double valorPagar;
    protected double valorTarifa;

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

    /**
     * Obtém o valor da propriedade nomeProprietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    /**
     * Define o valor da propriedade nomeProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProprietario(String value) {
        this.nomeProprietario = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeConsumida.
     * 
     */
    public double getQuantidadeConsumida() {
        return quantidadeConsumida;
    }

    /**
     * Define o valor da propriedade quantidadeConsumida.
     * 
     */
    public void setQuantidadeConsumida(double value) {
        this.quantidadeConsumida = value;
    }

    /**
     * Obtém o valor da propriedade valorPagar.
     * 
     */
    public double getValorPagar() {
        return valorPagar;
    }

    /**
     * Define o valor da propriedade valorPagar.
     * 
     */
    public void setValorPagar(double value) {
        this.valorPagar = value;
    }

    /**
     * Obtém o valor da propriedade valorTarifa.
     * 
     */
    public double getValorTarifa() {
        return valorTarifa;
    }

    /**
     * Define o valor da propriedade valorTarifa.
     * 
     */
    public void setValorTarifa(double value) {
        this.valorTarifa = value;
    }

}
