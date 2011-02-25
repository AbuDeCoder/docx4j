package org.docx4j.wml;

import org.jvnet.jaxb2_commons.ppp.Child;

//import javax.xml.bind.Unmarshaller;

/**
 * @since 2.7
 *
 */
public interface SdtElement extends Child {

    /**
     * Gets the value of the sdtPr property.
     * 
     * @return
     *     possible object is
     *     {@link SdtPr }
     *     
     */
    public SdtPr getSdtPr();

    /**
     * Sets the value of the sdtPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SdtPr }
     *     
     */
    public void setSdtPr(SdtPr value);

    /**
     * Gets the value of the sdtEndPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTSdtEndPr }
     *     
     */
    public CTSdtEndPr getSdtEndPr();

    /**
     * Sets the value of the sdtEndPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSdtEndPr }
     *     
     */
    public void setSdtEndPr(CTSdtEndPr value);

    
    public SdtContent getContent();
    
//    /**
//     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
//     * 
//     * @param parent
//     *     The parent object in the object tree.
//     * @param unmarshaller
//     *     The unmarshaller that generated the instance.
//     */
//    void afterUnmarshal(Unmarshaller unmarshaller, Object parent);

}