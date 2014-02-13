gradle-console
============
this plugin for [Gradle](http://www.gradle.org/) allows you to easily interact with your Groovy and Java applications using the [Groovy Console](http://groovy.codehaus.org/Groovy+Console). 

![alt text](http://groovy.codehaus.org/download/attachments/36800/GroovyConsole.gif?version=1&modificationDate=1193815296813&api=v2 "Groovy Console")

Just run <code>gradle console</code> and you will get a console window with all your runtime dependencies loaded for you. This is useful in case you need to interact your project dependencies or your source code in a fast and flexible way.



## Instalation
Just add the following snippet of code to your <code>build.gradle</code> file

```groovy
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath group: 'net.carlosgsouza', name: 'gradle-console', version: '1.0'
    }
}
```

## Usage
Invoke the <code>console</code> task using gradle

```
gradle console
```

## About this project
This is just the first version of this plugin and we are couting on your feedback to make it better! 
Don't hesitate to send us an e-mail, create an issue on GitHub or, even better, submit a pull request. 

## Acknowledgement
This plugin was created based on [this post](http://piraguaconsulting.blogspot.com.br/2012/02/gradle-groovy-console.html) by Mike Hugo. Thanks, Mike!
