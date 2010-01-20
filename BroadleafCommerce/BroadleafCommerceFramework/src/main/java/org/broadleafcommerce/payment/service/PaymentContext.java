/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.broadleafcommerce.payment.service;

import org.broadleafcommerce.payment.domain.PaymentInfo;
import org.broadleafcommerce.payment.domain.Referenced;
import org.broadleafcommerce.util.money.Money;

public interface PaymentContext {

    public Money getOriginalPaymentAmount();

    public Money getRemainingPaymentAmount();

    public PaymentInfo getPaymentInfo();

    public Referenced getReferencedPaymentInfo();

    public String getTransactionId();

    public void setTransactionId(String transactionId);

    public String getUserName() ;
	
}
