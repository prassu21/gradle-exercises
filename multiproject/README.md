Multi Project Builds:
--------------------

1. Create settings.gradle and include the module projects.

2. Investigate the structure of the multi project build. Execute the build task from the root project
   and observe what is happening.

3. Execute 'gradle projects' from the root directory and see what shows up.

4. Go to shared and do a 'gradle build' and see what happens.

5. Go to the api project. Execute build from there. We need build.gradle in API in order to define its dependencies.
   Also, notice Gradle automatically built shared before API as its a dependency.

6. In API, Execute also buildNeeded and buildDependent ('gradle buildNeeded buildDependent). See what is different
   compared to executing the build task. You will see API is fully built and tested and web service is fully built
   and tested.

7. Execute the build task of the api project from the root project directory. 'gradle :api:build'

8. Execute 'gradle projects' and 'gradle :projects' from the services directory and see what happens.

9. Execute 'gradle tasks' and 'gradle :api:tasks' from the root project directory and see what happens.

10. Execute 'gradle :services:webservice:properties' from the root project directory and see what happens.

11. Execute 'gradle --profile clean build' from the root project. Have a look at the profile
    report in: build/reports/profile