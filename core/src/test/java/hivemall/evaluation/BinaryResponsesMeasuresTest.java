/*
 * Hivemall: Hive scalable Machine Learning Library
 *
 * Copyright (C) 2015 Makoto YUI
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hivemall.evaluation;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BinaryResponsesMeasuresTest {

    @Test
    public void testNDCG() {
        List<Integer> rankedList = Arrays.asList(1, 3, 2, 6);
        List<Integer> groundTruth = Arrays.asList(1, 2, 4);

        double actual = BinaryResponsesMeasures.nDCG(rankedList, groundTruth, rankedList.size());
        Assert.assertEquals(0.7039180890341348d, actual, 0.0001d);

        actual = BinaryResponsesMeasures.nDCG(rankedList, groundTruth, 2);
        Assert.assertEquals(0.6131471927654585d, actual, 0.0001d);
    }

}
