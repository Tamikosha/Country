
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
 *         &lt;element name="FullCountryInfoResult" type="{http://www.oorsprong.org/websamples.countryinfo}tCountryInfo"/>
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
        "AllStateInfoReturn"
})
@XmlRootElement(name = "FullCountryInfoResponse")
public class AllStateInfoReturn {

    @XmlElement(name = "FullCountryInfoResult", required = true)
    protected TypeCountryInfo AllStateInfoReturn;

    /**
     * Gets the value of the fullCountryInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCountryInfo }
     *     
     */
    public TypeCountryInfo getAllStateInfoReturn() {
        return AllStateInfoReturn;
    }

    /**
     * Sets the value of the fullCountryInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCountryInfo }
     *     
     */
    public void setAllStateInfoReturn(TypeCountryInfo value) {
        this.AllStateInfoReturn = value;
    }

}
