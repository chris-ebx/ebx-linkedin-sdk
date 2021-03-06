/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.echobox.api.linkedin.types.v1;

import com.echobox.api.linkedin.jsonmapper.LinkedIn;

import lombok.Getter;

/**
 * Contact info model
 * @author Joanna
 *
 */
public class ContactInfo {
  
  /**
   * Company phone number for the location.
   */
  @Getter
  @LinkedIn("phone1")
  private String phoneOne;

  /**
   * Second company phone number for the location.
   */
  @Getter
  @LinkedIn("phone2")
  private String phoneTwo;

  /**
   * Company fax number for the location.
   */
  @Getter
  @LinkedIn
  private String fax;
}
