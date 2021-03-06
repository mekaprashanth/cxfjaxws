/**
 * 
 */
package com.prash.sample.rest.values;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author prashanthmeka
 *
 */
@XmlRootElement
public class CardInputDetails {
	
	private String proxyNumber;
	private String cardType;
	
	public String getProxyNumber() {
		return proxyNumber;
	}
	public void setProxyNumber(String proxyNumber) {
		this.proxyNumber = proxyNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	@Override
	public String toString() {
		return "CardInputDetails [proxyNumber=" + proxyNumber + ", cardType="
				+ cardType + "]";
	}
}
