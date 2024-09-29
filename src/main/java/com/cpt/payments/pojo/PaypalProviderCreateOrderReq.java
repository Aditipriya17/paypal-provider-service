package com.cpt.payments.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaypalProviderCreateOrderReq {

	private String txnRef;
	
	private String currencyCode;
	
	private String amountValue;
	
	private String brandName;
	
	private String locale;
	
	private String returnUrl;
	
	private String cancelUrl;
	
}
