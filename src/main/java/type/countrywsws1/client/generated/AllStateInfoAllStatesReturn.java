
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
 *         &lt;element name="FullCountryInfoAllCountriesResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryInfo"/>
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
    "fullCountryInfoAllCountriesResult"
})
@XmlRootElement(name = "FullCountryInfoAllCountriesResponse")
public class AllStateInfoAllStatesReturn {

    @XmlElement(name = "FullCountryInfoAllCountriesResult", required = true)
    protected ListOffStateInfo fullCountryInfoAllCountriesResult;

    /**
     * Gets the value of the fullCountryInfoAllCountriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListOffStateInfo }
     *     
     */
    public ListOffStateInfo getFullCountryInfoAllCountriesResult() {
        return fullCountryInfoAllCountriesResult;
    }

    /**
     * Sets the value of the fullCountryInfoAllCountriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOffStateInfo }
     *     
     */
    public void setFullCountryInfoAllCountriesResult(ListOffStateInfo value) {
        this.fullCountryInfoAllCountriesResult = value;
    }

}
