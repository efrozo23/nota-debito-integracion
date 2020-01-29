package com.itau.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.swagger.annotations.ApiModel;

@XmlRootElement
@JsonAutoDetect
@JsonSerialize
@ApiModel(description = "Request DTO Object")

public class Request {
	
	@JsonProperty("AccounRecord")
	public AccounRecord accounRecord = new AccounRecord();
	
	@JacksonXmlRootElement(localName = "AccounRecord")
	public class AccounRecord {
		public static final String DEF_NMS = "http://itau.com.co/commoncannonical/v2/schemas";

		@JsonProperty(value = "PaidCurAmt")
		@JacksonXmlProperty(localName = "PaidCurAmt")
		public PaidCurAmt publiCurAmt = new PaidCurAmt();

		@JsonProperty
		@JacksonXmlProperty(localName = "acctType")
		public String acctType = "";

		@JacksonXmlProperty(localName = "acctId")
		public String accId = "";

		@JsonProperty
		@JacksonXmlProperty(localName = "chargeCode")
		public String chargeCode = "";

		@JsonProperty
		@JacksonXmlProperty(localName = "trnCategory")
		public String trnCategory = "";

		@JsonProperty
		@JacksonXmlProperty(localName = "desc")
		public String desc = "";

		@JsonProperty
		@JacksonXmlProperty(localName = "branchId")
		public String branchId = "";

		public class PaidCurAmt {

			@JsonProperty
			@JacksonXmlProperty(localName = "amt", namespace = DEF_NMS)
			public String amt = "";
			@JsonProperty
			@JacksonXmlProperty(localName = "curCode", namespace = DEF_NMS)
			public String curCode = "";

		}
	}
}
