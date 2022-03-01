
package type.countrywsws1.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCurrencyResult" type="{http://www.oorsprong.org/websamples.countryinfo}tCurrency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "stateCurrResult"
})
@XmlRootElement(name = "CountryCurrencyResponse")
public class StateCurrReturn {

    @XmlElement(name = "CountryCurrencyResult", required = true)
    protected TypeCurrency stateCurrResult;

    /**
     * Gets the value of the countryCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCurrency }
     *     
     */
    public TypeCurrency getStateCurrResult() {
        return stateCurrResult;
    }

    /**
     * Sets the value of the countryCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCurrency }
     *     
     */
    public void setStateCurrResult(TypeCurrency value) {
        this.stateCurrResult = value;
    }

}
