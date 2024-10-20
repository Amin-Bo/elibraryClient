
package com.reservation.elibrary.proxy.reservations;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="reservation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bookId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "id",
    "dateDebut",
    "dateFin",
    "etat",
    "userId",
    "bookId"
})
public class Reservation {

    protected int id;
    protected String dateDebut;
    protected String dateFin;
    protected String etat;
    protected long userId;
    protected long bookId;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDebut() {
        return dateDebut;
    }

    /**
     * Définit la valeur de la propriété dateDebut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDebut(String value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFin() {
        return dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFin(String value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propriété etat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtat(String value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propriété userId.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Obtient la valeur de la propriété bookId.
     * 
     */
    public long getBookId() {
        return bookId;
    }

    /**
     * Définit la valeur de la propriété bookId.
     * 
     */
    public void setBookId(long value) {
        this.bookId = value;
    }

}
