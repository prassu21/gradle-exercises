Java Plugin:
-----------

1. Look at the structure and see what you infer. src/main/java refers to production code and src/test/java refers to
   unit tests for the production code.

2. From the root project execute 'gradle tasks' and see what happens.

3. From the root project execute 'gradle assemble' and see what happens.

4. Copy the contents of build-2.gradle to build.gradle and analyze the build script.

5. Now, execute 'gradle tasks' and see what happens.

6. You will notice a task titled, integTestClasses. Execute 'gradle integTestClasses' and see what happens. You will
   notice in build/classes all the integration test compiled classes. So you specify the "what" and Gradle figures out
   the "How".

7.  Copy the contents of build-3.gradle to build.gradle and analyze the build script.

8. Now, execute 'gradle tasks' and see what happens.

9. Execute 'gradle integTestJar' and see if the jar gets generated in build/libs directory.

10. Copy the contents of build-4.gradle to build.gradle and analyze the build script.

11. Execute 'gradle tasks' and see what happens.

12. Execute the task 'gradle integrationTest' and see what happens.