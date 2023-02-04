
package com.servico.gerarcalculos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de geraCalculoRetangulo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="geraCalculoRetangulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geraCalculoRetangulo", propOrder = {
    "base",
    "altura"
})
public class GeraCalculoRetangulo {

    protected int base;
    protected int altura;

    /**
     * Obtém o valor da propriedade base.
     * 
     */
    public int getBase() {
        return base;
    }

    /**
     * Define o valor da propriedade base.
     * 
     */
    public void setBase(int value) {
        this.base = value;
    }

    /**
     * Obtém o valor da propriedade altura.
     * 
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Define o valor da propriedade altura.
     * 
     */
    public void setAltura(int value) {
        this.altura = value;
    }

}
