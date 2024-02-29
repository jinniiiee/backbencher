FROM openjdk:11-alpine
ENTRYPOINT ["/usr/bin/ExploreMe.sh"]

COPY ExploreMe.sh /usr/bin/ExploreMe.sh
COPY target/ExploreMe.jar /usr/share/ExploreMe/ExploreMe.jar
