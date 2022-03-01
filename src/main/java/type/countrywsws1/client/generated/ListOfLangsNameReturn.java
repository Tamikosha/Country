
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
 *         &lt;element name="ListOfLanguagesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftLanguage"/>
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
    "listOfLanguagesByNameResult"
})
@XmlRootElement(name = "ListOfLangsNameReturn")
public class ListOfLangsNameReturn {

    @XmlElement(name = "ListOfLanguagesByNameResult", required = true)
    protected ListOffLang listOfLanguagesByNameResult;

    /**
     * Gets the value of the listOfLanguagesByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListOffLang }
     *     
     */
    public ListOffLang getListOfLanguagesByNameResult() {
        return listOfLanguagesByNameResult;
    }

    /**
     * Sets the value of the listOfLanguagesByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOffLang }
     *     
     */
    public void setListOfLanguagesByNameResult(ListOffLang value) {
        this.listOfLanguagesByNameResult = value;
    }

}
