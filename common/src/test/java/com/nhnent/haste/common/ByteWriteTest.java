/*
* Copyright 2016 NHN Entertainment Corp.
*
* NHN Entertainment Corp. licenses this file to you under the Apache License,
* version 2.0 (the "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at:
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.nhnent.haste.common;

import org.junit.Assert;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteWriteTest {
    @Test
    public void testByte() {
        final byte TEST_CASE = 111;
        ByteBuffer buffer = ByteBuffer.allocate(1);
        buffer = buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.put(TEST_CASE);

        byte[] writeData = new byte[1];
        ByteWrite.set(TEST_CASE, writeData, 0);

        Assert.assertArrayEquals(buffer.array(), writeData);
    }

    @Test
    public void testShort() {
        final short TEST_CASE = (short) 62510;
        ByteBuffer buffer = ByteBuffer.allocate(2);
        buffer = buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.putShort(TEST_CASE);

        byte[] writeData = new byte[2];
        ByteWrite.set(TEST_CASE, writeData, 0);

        Assert.assertArrayEquals(buffer.array(), writeData);
    }

    @Test
    public void testInt() {
        final int TEST_CASE = 164214632;
        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer = buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.putInt(TEST_CASE);

        byte[] writeData = new byte[4];
        ByteWrite.set(TEST_CASE, writeData, 0);

        Assert.assertArrayEquals(buffer.array(), writeData);
    }


    @Test
    public void testLong() {
        final long TEST_CASE = 1642146535132L;
        ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer = buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.putLong(TEST_CASE);

        byte[] writeData = new byte[8];
        ByteWrite.set(TEST_CASE, writeData, 0);

        Assert.assertArrayEquals(buffer.array(), writeData);
    }
}
