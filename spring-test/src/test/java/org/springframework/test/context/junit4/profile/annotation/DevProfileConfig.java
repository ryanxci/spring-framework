/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.test.context.junit4.profile.annotation;

import org.springframework.beans.test.fixtures.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Sam Brannen
 * @since 3.1
 */
@Profile("dev")
@Configuration
public class DevProfileConfig {

	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		employee.setName("John Smith");
		employee.setAge(42);
		employee.setCompany("Acme Widgets, Inc.");
		return employee;
	}

}
