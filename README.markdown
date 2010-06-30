Once releasetest.api has been installed, you _should_ be able to install releasetest.client, however under
maven 3.0-beta1 the project fails - this builds fine under 2.2.1.

    [master::releasetest.client//releasetest.client]% ~/Applications/apache-maven-3.0-SNAPSHOT/bin/mvn dependency:tree
    [INFO] Scanning for projects...
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building releasetest.client 1.3.5-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD FAILURE
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 2.436s
    [INFO] Finished at: Wed Jun 30 22:26:24 NZST 2010
    [INFO] Final Memory: 4M/81M
    [INFO] ------------------------------------------------------------------------
    [ERROR] Failed to execute goal on project releasetest.client: Couldn't find a version in [1.1.2-SNAPSHOT] to match     range [1.0.0,2.0.0)
      com.talios:releasetest.api:jar:null

    from the specified remote repositories:
      central (http://repo1.maven.org/maven2, releases=true, snapshots=false)
    Path to dependency: 
    	1) com.talios:releasetest.client:pom:1.3.5-SNAPSHOT
    -> [Help 1]
    [ERROR] 
    [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
    [ERROR] Re-run Maven using the -X switch to enable full debug logging.
    [ERROR] 
    [ERROR] For more information about the errors and possible solutions, please read the following articles:
    [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/OverConstrainedVersionException
