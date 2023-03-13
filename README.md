# hermes-api

This defines the java API interfaces for [hermes](https://github.com/wardle/hermes), making
it easier to use hermes from java clients. 

This is not designed to be referenced directly by client applications. 
Instead, users interested in using Hermes from Java, or another JVM hosted 
language should simply use the hermes library jar directly from their build tool. 

For example:

```xml
<dependency>
  <groupId>com.eldrix</groupId>
  <artifactId>hermes</artifactId>
  <version>1.0.960</version>
</dependency>
```
As the hermes library jar is published to the Clojars repository, you may need
to explicitly reference that repository in your build configuration:

```xml
<repositories>
    <repository>
        <id>clojars.org</id>
        <url>https://clojars.org/repo</url>
    </repository>
</repositories>
```

To use hermes from Java, or another JVM hosted language, you primarily use the
class `com.eldrix.hermes.client.Hermes`. 

You should be able to work out how to use it [from the source code](https://github.com/wardle/hermes-api/blob/main/src/main/java/com/eldrix/hermes/client/Hermes.java).



##### Developer documentation

To deploy the latest version of this library to Clojars, simply run

```shell
mvn clean deploy
```

