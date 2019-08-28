
package testsoap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardProgressStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cardProgressStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UEO_INITIALIZED"/>
 *     &lt;enumeration value="DEO_TO_UEO"/>
 *     &lt;enumeration value="REO_TO_UEO"/>
 *     &lt;enumeration value="AD_TO_UEO"/>
 *     &lt;enumeration value="DD_TO_UEO"/>
 *     &lt;enumeration value="DIRECTOR_TO_UEO"/>
 *     &lt;enumeration value="DG_TO_UEO"/>
 *     &lt;enumeration value="UEO_TO_DEO"/>
 *     &lt;enumeration value="AUTO_TO_DEO"/>
 *     &lt;enumeration value="DEO_TO_REO"/>
 *     &lt;enumeration value="AUTO_TO_REO"/>
 *     &lt;enumeration value="REO_TO_AD"/>
 *     &lt;enumeration value="AUTO_TO_AD"/>
 *     &lt;enumeration value="AD_TO_DD"/>
 *     &lt;enumeration value="DD_TO_DIRECTOR"/>
 *     &lt;enumeration value="DIRECTOR_TO_DG"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cardProgressStatus")
@XmlEnum
public enum CardProgressStatus {

    UEO_INITIALIZED,
    DEO_TO_UEO,
    REO_TO_UEO,
    AD_TO_UEO,
    DD_TO_UEO,
    DIRECTOR_TO_UEO,
    DG_TO_UEO,
    UEO_TO_DEO,
    AUTO_TO_DEO,
    DEO_TO_REO,
    AUTO_TO_REO,
    REO_TO_AD,
    AUTO_TO_AD,
    AD_TO_DD,
    DD_TO_DIRECTOR,
    DIRECTOR_TO_DG,
    APPROVED,
    REJECTED;

    public String value() {
        return name();
    }

    public static CardProgressStatus fromValue(String v) {
        return valueOf(v);
    }

}
