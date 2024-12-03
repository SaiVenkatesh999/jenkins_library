String jenkinsCredentialId = "app-deployer"
String souravGithubToken = "sourav-github"
String abhishekGithubToken = "abhishek-github"

String SCMORG  = "agileguru"
String scmBase = "https://github.com/" + SCMORG + "/"

String SONDORORG  = "SONDOR-life"
String sondorLifeScmBase = "https://github.com/" + SONDORORG + "/"

String SOURAV  = "dsourav155"
String souravScmBase = "https://github.com/" + SOURAV + "/"

String SAI  = "SaiVenkatesh999"
String saiScmBase = "https://github.com/" + SAI + "/"

String ABHI  = "yadav-7abhishek"
String abhiScmBase = "https://github.com/" + ABHI + "/"

def viewJobDefn  = [
Projects    :    
    [ 
        Desc        :    "All Projects",
        Folders     :    
        [                                                                           
            Platform   : 
            [ 
                  plugin        :   [
                    scmUrl  :   scmBase,    
                    project :   "plugins",
                    desc    :   "Maven Plugins Bom", 
                    display :   "Maven Plugins Bom",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   ""
                ],
                  platform        :   [
                    scmUrl  :   scmBase,
                    project :   "platform",
                    desc    :   "Maven Platform Bom",
                    display :   "Maven Platform Bom",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   "Platform/plugin/3.0.0-RELEASE"
                ],
                  frameworks        :   [
                    scmUrl  :   scmBase,
                    project :   "frameworks",
                    desc    :   "Base Framework Bom",
                    display :   "Base Framework Bom",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   "Platform/plugin/3.2.0-RELEASE"
                ],
                 elf        :   [
                    scmUrl  :   scmBase,
                    project :   "elf",
                    desc    :   "Enterprise Logging Framework",
                    display :   "Enterprise Logging Framework",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   ""
                ]
            ],
            Applications   :
            [
                  playground        :   [
                    scmUrl  :   scmBase,
                    project :   "playground",
                    desc    :   "PlayGround For Research",
                    display :   "PlayGround For Research",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   "Platform/platform/main"
                ],
                  multiuserquiz        :   [
                    scmUrl  :   scmBase,
                    project :   "multiuserquiz",
                    desc    :   "Quiz Application",
                    display :   "Quiz Application",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   "Platform/platform/1.0-RELEASE"
                ],
                  authserver        :   [
                    scmUrl  :   scmBase,
                    project :   "authserver",
                    desc    :   "Auth Server",
                    display :   "Auth Server",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   "Platform/platform/1.0-RELEASE"
                ],
                 sipcalulator        :   [
                    scmUrl  :   souravScmBase,
                    project :   "sipcalulator",
                    desc    :   "SIP Calculator",
                    display :   "SIP Calculator",
                    cred    :   souravGithubToken,
                    org     :   SOURAV,
                    after   :   ""
                ],
                gowebapp        :   [
                    scmUrl  :   souravScmBase,
                    project :   "golang-web-app",
                    desc    :   "Golang Web Application",
                    display :   "Golang Web Application",
                    cred    :   souravGithubToken,
                    org     :   SOURAV,
                    after   :   ""
                ],
                temples        :   [
                    scmUrl  :   abhiScmBase,
                    project :   "visittemple",
                    desc    :   "Visit Temple Application",
                    display :   "Indian Holy Places",
                    cred    :   abhishekGithubToken,
                    org     :   ABHI,
                    after   :   ""
                ],
                 tickle              :   [
                    scmUrl  :   scmBase,
                    project :   "tickle",
                    desc    :   "Tickle Application",
                    display :   "Tickle Application",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   ""
                ],
                saisipcal        :   [
                    scmUrl  :   saiScmBase,
                    project :   "sipcalculator",
                    desc    :   "Sai SIP Calculator",
                    display :   "Sai Calculator",
                    cred    :   jenkinsCredentialId,
                    org     :   SAI,
                    after   :   ""
                ],
                motoib        :   [
                    scmUrl  :   scmBase,
                    project :   "motoib",
                    desc    :   "Moto Investments",
                    display :   "Moto Investments",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   ""
                ],
            ],
        ],
    ],
Tools    :    
    [ 
        Desc        :    "All Tools",
        Folders     :    
        [                                                                           
            Maven   : 
            [ 
                  Maven        :   [
                    scmUrl  :   scmBase,    
                    project :   "Maven",
                    desc    :   "Maven Build Tool", 
                    display :   "Maven Build Tool",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   ""
                ]
            ],
            BaseImages   : 
            [ 
                  baseimages        :   [
                    scmUrl  :   scmBase,    
                    project :   "baseimages",
                    desc    :   "Base Images For Apps", 
                    display :   "Base Images For Apps",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   ""
                ]
            ],            
        ],
    ],
Sondor    :
    [
        Desc        :    "Sondor",
        Folders     :
        [
            SondorServices   :
            [
                  ServicesPortal        :   [
                    scmUrl  :   sondorLifeScmBase,
                    project :   "service_portal",
                    desc    :   "Services Portal",
                    display :   "Services Portal",
                    cred    :   jenkinsCredentialId,
                    org     :   SONDORORG,
                    after   :   ""
                ],
                  Portal        :   [
                    scmUrl  :   sondorLifeScmBase,
                    project :   "portal",
                    desc    :   "Content Portal",
                    display :   "Content Portal",
                    cred    :   jenkinsCredentialId,
                    org     :   SONDORORG,
                    after   :   ""
                ]
            ],
        ],
    ],
Alacrity    :
    [
        Desc        :    "Alacrity Integrated",
        Folders     :
        [
            Tools   :
            [
                  Radar        :   [
                    scmUrl  :   scmBase,
                    project :   "radar",
                    desc    :   "Tech Radar",
                    display :   "Tech Radar",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   ""
                ],
                 Portal        :   [
                    scmUrl  :   scmBase,
                    project :   "portal",
                    desc    :   "Multi Tenant Portal",
                    display :   "Multi Tenant Portal",
                    cred    :   jenkinsCredentialId,
                    org     :   SCMORG,
                    after   :   ""
                ]
            ],
        ],
    ]    
]

// Don't change unless you know what you doing             
viewJobDefn.each { entry ->
    // Create a List View
    listView(entry.key) {
        // View Details 
        viewDetails    = entry.value
        
        // Set Description 
        description(viewDetails."Desc")
        
        // Get Folders and create the jobs
        viewDetails."Folders".each { folder ->
            buildJobs(folder)
        }
        
        // Add Jobs to the View
        viewDetails."Folders".each { folder ->
            jobs {
                name(folder.key)
            }
        }
        // View Customization 
        columns {
            status()
            weather()
            name()
            lastSuccess()
            lastFailure()
            lastDuration()
            buildButton()
        }
    }
}

// Build the jobs 
def buildJobs( data ) { 
    data.each { entry ->
        // Create / Update Folder by Key 
        folder( entry.key )
        // In each folder Create Jobs
        entry.value.each { job -> 
            jobName = entry.key + "/" + job.key;
            jobDetails = job.value
            jobVCS = jobDetails."scmUrl" + jobDetails."project" + ".git";
            repoUrl = jobDetails."scmUrl" + jobDetails."project";
            jobDesc = jobDetails."desc"
            jobDisplayName = jobDetails."display"
            scmCred =  jobDetails."cred"
            upstreamJobs = jobDetails."after"
            buildMultiBranchJob(jobName, jobVCS, scmCred, jobDesc, jobDisplayName, 
                                jobDetails."scmUrl", jobDetails."project", repoUrl, 
                                jobDetails."org", upstreamJobs)
        }
    }
}
// Define method to build the job 
def buildMultiBranchJob(jobName, jobVCS, credentials, desc, display, scmBase , scmProject, repoLink, org, upstreamJobs) {
    // Create job
    multibranchPipelineJob(jobName) {
        // Desc  and Display name 
        description(desc)
        displayName(display)
        if ( upstreamJobs != null && !upstreamJobs.trim().isEmpty() ) {
            // properties {
            //     pipelineTriggers { 
            //         triggers { 
            //             githubPush()
            //             upstream(upstreamJobs, threshold = 'SUCCESS')
            //         }
            //     }
            // }
        }
        // Define source
        branchSources {
            branchSource {
                source {
                    github {
                        id(jobName + jobVCS)
                        repositoryUrl(jobVCS)
                        repoOwner(org)
                        repository(scmProject)
                        configuredByUrl(true)
                        credentialsId(credentials)
                        traits {
                            gitHubBranchDiscovery {
                                strategyId(1)
                            }
                            wipeWorkspaceTrait()
                            browser {
                                browser {
                                    github {
                                        repoUrl(repoLink)
                                    }
                                }
                            }
                        }
                    }
                }
                strategy {
                    allBranchesSame {
                        props {
                            buildRetention {
                                buildDiscarder {
                                    logRotator {
                                        numToKeepStr ("5")
                                        daysToKeepStr ("")
                                        artifactDaysToKeepStr("")
                                        artifactNumToKeepStr("")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } // End source
        // How Many Items in the history
        orphanedItemStrategy {
            discardOldItems {
                numToKeep(5)
                // daysToKeep(5)
            }
        } // End Orphaned
    } // End Creating
} // End Method 