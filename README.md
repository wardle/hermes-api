# hermes-api

This defines the Java API interfaces for [hermes](https://github.com/wardle/hermes), making
it easier to use hermes from Java, or other JVM languages. 

This library is not designed to be referenced directly by client applications. 
It is actually a dependency of the main hermes library and so will be included 
in your project as a transitive dependency when you use hermes.

DO NOT specify hermes-api in your pom.xml. 

Therefore, users interested in using hermes from Java, or another JVM hosted 
language should simply use the hermes library jar directly from their build tool. 

For example, here is how I use this from a Java application using maven:

```xml
<dependency>
  <groupId>com.eldrix</groupId>
  <artifactId>hermes</artifactId>
  <version>*******</version>
</dependency>
```

You will want to double check that you are using the [latest version](https://clojars.org/com.eldrix/hermes).

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

To publish the latest version of this library to sonatype, run

```shell
mvn clean deploy
```

For this to work successfully, you will need the appropriate credentials.
Make sure you have a valid .m2/settings.xml file:
```xml
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>wardle</username>
      <password>*******</password>
    </server>
  </servers>
</settings>
```

Make sure you have a valid GPG key and it is uploaded to a public key server. e.g.
```shell
gpg --gen-key
gpg --list-keys
gpg --keyserver keyserver.ubuntu.com --send-keys XXXXXXX
```
