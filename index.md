##### Release status:
[![Build Status](https://travis-ci.org/bitofcode/aviation-edge-sdk.svg?branch=master)](https://travis-ci.org/bitofcode/aviation-edge-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.bitofcode.oss.sdk/aviation-edge-sdk/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.bitofcode.oss.sdk/aviation-edge-sdk)

##### Development status:
[![Build Status](https://travis-ci.org/bitofcode/aviation-edge-sdk.svg?branch=develop)](https://travis-ci.org/bitofcode/aviation-edge-sdk)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=bitofcode_aviation-edge-sdk&metric=alert_status)](https://sonarcloud.io/dashboard?id=bitofcode_aviation-edge-sdk)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=bitofcode_aviation-edge-sdk&metric=coverage)](https://sonarcloud.io/dashboard?id=bitofcode_aviation-edge-sdk)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=bitofcode_aviation-edge-sdk&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=bitofcode_aviation-edge-sdk)

# Aviation Edge SDK 
The Java SDK of the [Aviation Edge](https://aviation-edge.com) Web API. 
The Documentation of the Web API can be seen here [https://aviation-edge.com/developers](https://aviation-edge.com/developers).

*I would like to thank aviation-edge.com for the support of this project.*

## Installation and Getting Started

*Note: This Project is in the early development phase. The Repository is changing often. The Documentation and this readme file will be updated continuously.*

### Add to your Dependencies

#### Maven
```xml
<dependency>
  <groupId>com.bitofcode.oss.sdk</groupId>
  <artifactId>aviation-edge-sdk</artifactId>
  <version>0.2.0</version>
</dependency>
```

#### Gradle Kotlin DSL
```kotlin
compile("com.bitofcode.oss.sdk:aviation-edge-sdk:0.2.0)
```

#### Gradle Groovy DSL
```groovy
implementation 'com.bitofcode.oss.sdk:aviation-edge-sdk:0.2.0'
```
#### Download Binaries from:
[https://repo1.maven.org/maven2/com/bitofcode/oss/sdk/aviation-edge-sdk/](https://repo1.maven.org/maven2/com/bitofcode/oss/sdk/aviation-edge-sdk/)

### Example Usage in Java

```java
package com.bitofcode.oss.sdk.com.aviationedge.examples;

import com.bitofcode.oss.sdk.com.aviationedge.dtos.AirlineDto;
import com.bitofcode.oss.sdk.com.aviationedge.resources.*;
import org.slf4j.Logger;

class AirlineExample {

  private static final Logger log = org.slf4j.LoggerFactory.getLogger(AirlineExample.class);

  public static void main(String[] args) {
    // Create a Configuration with the API Key
    ApiConfigurationRepository uriConfigs = new ApiConfigurationRepository(args[0]);
    // Instanciate a factory to create individual Resources
    ApiResourceFactory apiResourceFactory = new ApiResourceFactory(uriConfigs);
    // Create an airline resource
    ApiResource<AirlineDto> airlineResource = apiResourceFactory.createAirlineResource();

    // Get all airlines
    List<AirlineDto> allAirlines = airlineResource.retrieveAll();
    // Log each AirlineDto
    allAirlines.forEach(item -> log.info(item.toString()));

    // Get all airline which their country is Germany (DE)
    List<AirlineDto> germanAirlines = airlineResource.retrieve(new ResourceRequestWithQueryParameter().withCountryIso2Code("DE"));
    // Log each AirlineDto
    germanAirlines.forEach(item -> log.info(item.toString()));
  }

}

```

## Reporting Issues

## Building from Source

## License
Aviation Edge SDK is an open source project and 
it is **[licensed](https://raw.githubusercontent.com/bitofcode/aviation-edge-sdk/master/LICENSE)** under 
the **[MIT License](https://opensource.org/licenses/MIT)**. 
The terms of the license are as follows:

```
MIT License

Copyright (c) 2019 Wassim Akachi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
