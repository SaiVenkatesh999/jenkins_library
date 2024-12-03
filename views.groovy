def buildStatusViews  = [

    Development :   [
        name    :   "Build Monitor - Work-In-Progress",
        desc    :   "Development / Feature Branches",
        recurse :   true,
        regex   :   "^(?!.*RELEASE.*).*"
    ],
    Release      :   [
        name    :   "Build Monitor - Released",
        desc    :   "Release Branches",
        recurse :   true,
        regex   :   ".*RELEASE.*\$"
    ],
    All          :   [
        name    :   "Work-Items - TV",
        desc    :   "All Work Items",
        recurse :   true,
        regex   :   ".*"
    ],
]


buildStatusViews.each { entry ->
    viewDetails    = entry.value
    buildMonitorView (viewDetails."name") {
        description(viewDetails."desc")
        recurse(viewDetails."recurse")
        jobs {
             regex(viewDetails."regex")
        }
    }
}