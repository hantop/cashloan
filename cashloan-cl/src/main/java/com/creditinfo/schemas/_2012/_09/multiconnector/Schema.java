
package com.creditinfo.schemas._2012._09.multiconnector;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="request" type="{http://creditinfo.com/schemas/2012/09/MultiConnector}ConnectorSchemaRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "Schema")
public class Schema {

    @XmlElementRef(name = "request", namespace = "http://creditinfo.com/schemas/2012/09/MultiConnector", type = JAXBElement.class, required = false)
    protected JAXBElement<ConnectorSchemaRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConnectorSchemaRequest }{@code >}
     *     
     */
    public JAXBElement<ConnectorSchemaRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConnectorSchemaRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<ConnectorSchemaRequest> value) {
        this.request = value;
    }

}
