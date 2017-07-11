/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.hive.cube.web.service;

import java.io.InputStream;

import com.alibaba.fastjson.JSONArray;

/**
 * Hadoop hdfs menu service interface.
 * 
 * @author smartloli.
 *
 *         Created by Jan 19, 2017
 */
public interface HdfsService {

	/** List hdfs menu interface. */
	public JSONArray dir(String path);

	/** Delete file or menu from hdfs interface. */
	public void delete(String path);

	/** Download file from hdfs interface. */
	public InputStream download(String fileName);

	/** Read content from hdfs interface. */
	public String read(String path);

}