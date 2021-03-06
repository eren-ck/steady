/**
 * This file is part of Eclipse Steady.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.sap.psr.vulas.shared.json.model;

import java.util.Set;

public interface IExemption {
	
	/**
	 * Returns true if the given {@link VulnerableDependency} is exempted, false otherwise.
	 * 
	 * @param the vulnerable dependency to be checked
	 * @return true if the vulnerable dependency is exemption, false otherwise
	 */
	public boolean isExempted(VulnerableDependency _vd);
	
	/**
	 * Returns the exemption reason. Only relevant if {@link #isExempted(VulnerableDependency)} returns true.
	 * 
	 * @return the reason for the exemption
	 */
	public String getReason();
	
	/**
	 * Returns a short representation of the exemption.
	 */
	public String toShortString();
}
