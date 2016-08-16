/*
 * Copyright (c) 2016 Lokra Studio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.lokraplatform.seaweedfs.core.topology;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Chiho Sin
 */
public class ReplicaPlacement {

    @JsonProperty("SameRackCount")
    private int sameRackCount;
    @JsonProperty("DiffRackCount")
    private int diffRackCount;
    @JsonProperty("DiffDataCenterCount")
    private int diffDataCenterCount;

    public int getSameRackCount() {
        return sameRackCount;
    }

    public void setSameRackCount(int sameRackCount) {
        this.sameRackCount = sameRackCount;
    }

    public int getDiffRackCount() {
        return diffRackCount;
    }

    public void setDiffRackCount(int diffRackCount) {
        this.diffRackCount = diffRackCount;
    }

    public int getDiffDataCenterCount() {
        return diffDataCenterCount;
    }

    public void setDiffDataCenterCount(int diffDataCenterCount) {
        this.diffDataCenterCount = diffDataCenterCount;
    }

    @Override
    public String toString() {
        return "ReplicaPlacement{" +
                "sameRackCount=" + sameRackCount +
                ", diffRackCount=" + diffRackCount +
                ", diffDataCenterCount=" + diffDataCenterCount +
                '}';
    }
}