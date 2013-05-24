# Karaf assembly sample

Get a Karaf distribution, add bundles and features then package them all in a custom distribution.

## Build distribution

    mvn -DskipTests -Pwith-assembly clean install

then go to ./karaf/assembly/target, unpack the tar.gz file and launch bin/petals.