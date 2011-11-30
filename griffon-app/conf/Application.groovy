application {
    title = 'GriffonTimeSeries'
    startupGroups = ['griffonTimeSeries']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "griffonTimeSeries"
    'griffonTimeSeries' {
        model      = 'griffontimeseries.GriffonTimeSeriesModel'
        view       = 'griffontimeseries.GriffonTimeSeriesView'
        controller = 'griffontimeseries.GriffonTimeSeriesController'
    }

    // MVC Group for "griffonTimeSeries"
    'griffonTimeSeries' {
        model      = 'griffontimeseries.GriffonTimeSeriesModel'
        view       = 'griffontimeseries.GriffonTimeSeriesView'
        controller = 'griffontimeseries.GriffonTimeSeriesController'
    }

}
