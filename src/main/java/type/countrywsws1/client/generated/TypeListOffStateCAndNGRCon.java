
package type.countrywsws1.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCountryCodeAndNameGroupedByContinent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCountryCodeAndNameGroupedByContinent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Continent" type="{http://www.oorsprong.org/websamples.countryinfo}tContinent"/>
 *         &lt;element name="CountryCodeAndNames" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCountryCodeAndNameGroupedByContinent", propOrder = {
    "continent",
    "countryCodeAndNames"
})
public class TypeListOffStateCAndNGRCon {

    @XmlElement(name = "Continent", required = true)
    protected TypeContinent continent;
    @XmlElement(name = "CountryCodeAndNames", required = true)
    protected ListOffCoAndNa countryCodeAndNames;

    /**
     * Gets the value of the continent property.
     * 
     * @return
     *     possible object is
     *     {@link TypeContinent }
     *     
     */
    public TypeContinent getContinent() {
        return continent;
    }

    /**
     * Sets the value of the continent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeContinent }
     *     
     */
    public void setContinent(TypeContinent value) {
        this.continent = value;
    }

    /**
     * Gets the value of the countryCodeAndNames property.
     * 
     * @return
     *     possible object is
     *     {@link ListOffCoAndNa }
     *     
     */
    public ListOffCoAndNa getCountryCodeAndNames() {
        return countryCodeAndNames;
    }

    /**
     * Sets the value of the countryCodeAndNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOffCoAndNa }
     *     
     */
    public void setCountryCodeAndNames(ListOffCoAndNa value) {
        this.countryCodeAndNames = value;
    }

}
