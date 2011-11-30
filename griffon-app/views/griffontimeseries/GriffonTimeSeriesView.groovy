package griffontimeseries

import java.awt.FlowLayout

application(title: 'GriffonTimeSeries',
  preferredSize: [700, 480],
  pack: true,
  //location: [50,50],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    // add content here

    panel(layout: new FlowLayout()) {
        //chart(SecondChart)
        chart(ThirdChart)
        button("Add Data", actionPerformed: controller.&addData)
    }
}
