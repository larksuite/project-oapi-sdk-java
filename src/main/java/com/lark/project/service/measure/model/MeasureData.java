/*
 * Copyright (c) 2023 Lark Technologies Pte. Ltd.
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
 */

package com.lark.project.service.measure.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MeasureData {
    /**
     *
     */
    @SerializedName("name")
    private String name;

    /**
     *
     */
    @SerializedName("chart_id")
    private String chartID;

    /**
     *
     */
    @SerializedName("chart_data_list")
    private List<List<ChartData>> chartDataList;

    /**
     *
     */
    @SerializedName("dim_titles")
    private List<String> dimTitles;

    /**
     *
     */
    @SerializedName("quota_titles")
    private List<String> quotaTitles;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChartID() {
        return this.chartID;
    }

    public void setChartID(String chartID) {
        this.chartID = chartID;
    }

    public List<List<ChartData>> getChartDataList() {
        return this.chartDataList;
    }

    public void setChartDataList(List<List<ChartData>> chartDataList) {
        this.chartDataList = chartDataList;
    }

    public List<String> getDimTitles() {
        return this.dimTitles;
    }

    public void setDimTitles(List<String> dimTitles) {
        this.dimTitles = dimTitles;
    }

    public List<String> getQuotaTitles() {
        return this.quotaTitles;
    }

    public void setQuotaTitles(List<String> quotaTitles) {
        this.quotaTitles = quotaTitles;
    }

}