package griffontimeseries

import java.awt.event.ActionEvent
import org.jfree.data.time.TimeSeries
import org.jfree.data.time.Second
import org.jfree.data.time.TimeSeriesDataItem

//import java.util.timer.Timer

class GriffonTimeSeriesController {
    // these will be injected by Griffon
    def model
    def view

     //void mvcGroupInit(Map args) {
        // this method is called after model and view are injected
     //}

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    /*
        Remember that actions will be called outside of the UI thread
        by default. You can change this setting of course.
        Please read chapter 9 of the Griffon Guide to know more.
       
    def action = { evt = null ->
    }
    */

    def addData = { evt = null ->
        //model.dataSet.addValue 500, "no.1", "Dec"
        model.timeSeriesDataSet.getSeries("foo").addOrUpdate(new Second(), new Random().nextInt(1000))
    }

    public GriffonTimeSeriesController() {

        new Timer().scheduleAtFixedRate(new TimerTask() {
            public void run() {
                addData()
            }
        }, 1000, 1000)
    }
}
