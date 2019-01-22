/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shardingproxy.backend.jdbc.recognizer;

import org.apache.shardingsphere.shardingproxy.backend.jdbc.recognizer.impl.H2RecognizerTest;
import org.apache.shardingsphere.shardingproxy.backend.jdbc.recognizer.impl.MySQLRecognizerTest;
import org.apache.shardingsphere.shardingproxy.backend.jdbc.recognizer.impl.OracleRecognizerTest;
import org.apache.shardingsphere.shardingproxy.backend.jdbc.recognizer.impl.PostgreSQLRecognizerTest;
import org.apache.shardingsphere.shardingproxy.backend.jdbc.recognizer.impl.SQLServerRecognizerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        JDBCURLRecognizerEngineTest.class,
        MySQLRecognizerTest.class,
        PostgreSQLRecognizerTest.class,
        OracleRecognizerTest.class,
        SQLServerRecognizerTest.class,
        H2RecognizerTest.class
})
public final class AllRecognizerTests {
}