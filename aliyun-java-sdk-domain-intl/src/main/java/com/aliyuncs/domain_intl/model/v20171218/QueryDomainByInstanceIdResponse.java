/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.domain_intl.model.v20171218;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.QueryDomainByInstanceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainByInstanceIdResponse extends AcsResponse {

	private String userId;

	private String domainName;

	private String instanceId;

	private String registrationDate;

	private String expirationDate;

	private String registrantOrganization;

	private String registrantName;

	private String email;

	private String updateProhibitionLock;

	private String transferProhibitionLock;

	private Boolean domainNameProxyService;

	private Boolean premium;

	private Integer emailVerificationStatus;

	private Boolean emailVerificationClientHold;

	private List<String> dnsList;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getRegistrantOrganization() {
		return this.registrantOrganization;
	}

	public void setRegistrantOrganization(String registrantOrganization) {
		this.registrantOrganization = registrantOrganization;
	}

	public String getRegistrantName() {
		return this.registrantName;
	}

	public void setRegistrantName(String registrantName) {
		this.registrantName = registrantName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUpdateProhibitionLock() {
		return this.updateProhibitionLock;
	}

	public void setUpdateProhibitionLock(String updateProhibitionLock) {
		this.updateProhibitionLock = updateProhibitionLock;
	}

	public String getTransferProhibitionLock() {
		return this.transferProhibitionLock;
	}

	public void setTransferProhibitionLock(String transferProhibitionLock) {
		this.transferProhibitionLock = transferProhibitionLock;
	}

	public Boolean getDomainNameProxyService() {
		return this.domainNameProxyService;
	}

	public void setDomainNameProxyService(Boolean domainNameProxyService) {
		this.domainNameProxyService = domainNameProxyService;
	}

	public Boolean getPremium() {
		return this.premium;
	}

	public void setPremium(Boolean premium) {
		this.premium = premium;
	}

	public Integer getEmailVerificationStatus() {
		return this.emailVerificationStatus;
	}

	public void setEmailVerificationStatus(Integer emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}

	public Boolean getEmailVerificationClientHold() {
		return this.emailVerificationClientHold;
	}

	public void setEmailVerificationClientHold(Boolean emailVerificationClientHold) {
		this.emailVerificationClientHold = emailVerificationClientHold;
	}

	public List<String> getDnsList() {
		return this.dnsList;
	}

	public void setDnsList(List<String> dnsList) {
		this.dnsList = dnsList;
	}

	@Override
	public QueryDomainByInstanceIdResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainByInstanceIdResponseUnmarshaller.unmarshall(this, context);
	}
}
