This project demonstrates a bug in IntelliJ IDEA.

If you run tests with Maven everything works, regardless of profile:

    mvn -Pworking test

    mvn -Pbroken test

should both work.

However, if you run the JUnit test in IntelliJ IDEA without Maven, with the `broken` profile, the test will fail.

This is because Intellij IDEA's `MavenJUnitPatcher`
only correctly uses the `maven-surefire-plugin` `<argLine>`
if all interpolated properties are present.

If a single property is missing, the `<argLine>`
will not be used by IntelliJ's test runner,
which is horrible to debug.
