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

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$21 {

    static final FunctionDescriptor SSL_set_info_callback$cb$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle SSL_set_info_callback$cb$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;II)V",
        constants$21.SSL_set_info_callback$cb$FUNC, false
    );
    static final FunctionDescriptor SSL_set_info_callback$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_set_info_callback$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_set_info_callback",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$21.SSL_set_info_callback$FUNC, false
    );
    static final FunctionDescriptor SSL_set_verify_result$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SSL_set_verify_result$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_set_verify_result",
        "(Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$21.SSL_set_verify_result$FUNC, false
    );
    static final FunctionDescriptor SSL_get_ex_data_X509_STORE_CTX_idx$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle SSL_get_ex_data_X509_STORE_CTX_idx$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_get_ex_data_X509_STORE_CTX_idx",
        "()I",
        constants$21.SSL_get_ex_data_X509_STORE_CTX_idx$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_set_tmp_dh_callback$dh$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle SSL_CTX_set_tmp_dh_callback$dh$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$21.SSL_CTX_set_tmp_dh_callback$dh$FUNC, false
    );
}


