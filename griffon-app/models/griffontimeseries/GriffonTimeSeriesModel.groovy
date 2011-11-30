package griffontimeseries

import groovy.beans.Bindable
import org.jfree.data.category.DefaultCategoryDataset
import org.jfree.data.time.TimeSeriesCollection
import org.jfree.data.time.TimeSeriesDataItem
import org.jfree.data.time.Second
import org.jfree.data.time.TimeSeries
import org.jfree.data.time.Month
import org.jfree.chart.plot.XYPlot
import java.awt.Color
import org.jfree.chart.renderer.xy.XYSplineRenderer

class GriffonTimeSeriesModel {
    @Bindable String valueAxisLabel = "Items"
    @Bindable String categoryAxisLabel = "Month"

    @Bindable DefaultCategoryDataset dataSet = new DefaultCategoryDataset()
    @Bindable TimeSeriesCollection timeSeriesDataSet = new TimeSeriesCollection()

    public GriffonTimeSeriesModel() {
        dataSet.with {
            addValue 150, "no.1", "Jan"
            addValue 210, "no.1", "Feb"
            addValue 390, "no.1", "Mar"
            addValue 300, "no.2", "Jan"
            addValue 400, "no.2", "Feb"
            addValue 200, "no.2", "Mar"
        }

        TimeSeriesDataItem dataItem = new TimeSeriesDataItem(new Second(), 100.0)
        TimeSeries timeSeries = new TimeSeries("foo")
        timeSeries.setMaximumItemAge(10)
        timeSeries.add(dataItem)
        timeSeriesDataSet.addSeries(timeSeries)
        timeSeriesDataSet.setDomainIsPointsInTime(true);
    }


}