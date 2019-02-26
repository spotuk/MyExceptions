INFO: Starting Servlet Engine: Apache Tomcat/9.0.13
фев 26, 2019 9:46:01 PM org.apache.jasper.servlet.TldScanner scanJars
INFO: At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
фев 26, 2019 9:46:01 PM org.apache.catalina.core.ContainerBase startInternal
SEVERE: A child container failed during start
java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/myTest]]
	at java.util.concurrent.FutureTask.report(Unknown Source)
	at java.util.concurrent.FutureTask.get(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:951)
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:831)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1432)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1422)
	at java.util.concurrent.FutureTask.run(Unknown Source)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:944)
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:261)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:801)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.startup.Catalina.start(Catalina.java:695)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:350)
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:492)
Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/myTest]]
	at org.apache.catalina.util.LifecycleBase.handleSubClassException(LifecycleBase.java:441)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:198)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1432)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1422)
	at java.util.concurrent.FutureTask.run(Unknown Source)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:944)
	... 21 more
Caused by: java.lang.NoClassDefFoundError: Lorg/apache/log4j/Logger;
	at java.lang.Class.getDeclaredFields0(Native Method)
	at java.lang.Class.privateGetDeclaredFields(Unknown Source)
	at java.lang.Class.getDeclaredFields(Unknown Source)
	at org.apache.catalina.util.Introspection.getDeclaredFields(Introspection.java:110)
	at org.apache.catalina.startup.WebAnnotationSet.loadFieldsAnnotation(WebAnnotationSet.java:269)
	at org.apache.catalina.startup.WebAnnotationSet.loadApplicationServletAnnotations(WebAnnotationSet.java:137)
	at org.apache.catalina.startup.WebAnnotationSet.loadApplicationAnnotations(WebAnnotationSet.java:69)
	at org.apache.catalina.startup.ContextConfig.applicationAnnotationsConfig(ContextConfig.java:328)
	at org.apache.catalina.startup.ContextConfig.configureStart(ContextConfig.java:772)
	at org.apache.catalina.startup.ContextConfig.lifecycleEvent(ContextConfig.java:299)
	at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5007)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	... 27 more
Caused by: java.lang.ClassNotFoundException: org.apache.log4j.Logger
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1328)
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1157)
	... 40 more

фев 26, 2019 9:46:01 PM org.apache.catalina.core.ContainerBase startInternal
SEVERE: A child container failed during start
java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: A child container failed during start
	at java.util.concurrent.FutureTask.report(Unknown Source)
	at java.util.concurrent.FutureTask.get(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:951)
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:261)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:801)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.startup.Catalina.start(Catalina.java:695)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:350)
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:492)
Caused by: org.apache.catalina.LifecycleException: A child container failed during start
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:963)
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:831)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1432)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1422)
	at java.util.concurrent.FutureTask.run(Unknown Source)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:944)
	... 13 more
Caused by: java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/myTest]]
	at java.util.concurrent.FutureTask.report(Unknown Source)
	at java.util.concurrent.FutureTask.get(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:951)
	... 21 more
Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/myTest]]
	at org.apache.catalina.util.LifecycleBase.handleSubClassException(LifecycleBase.java:441)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:198)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1432)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1422)
	at java.util.concurrent.FutureTask.run(Unknown Source)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:944)
	... 21 more
Caused by: java.lang.NoClassDefFoundError: Lorg/apache/log4j/Logger;
	at java.lang.Class.getDeclaredFields0(Native Method)
	at java.lang.Class.privateGetDeclaredFields(Unknown Source)
	at java.lang.Class.getDeclaredFields(Unknown Source)
	at org.apache.catalina.util.Introspection.getDeclaredFields(Introspection.java:110)
	at org.apache.catalina.startup.WebAnnotationSet.loadFieldsAnnotation(WebAnnotationSet.java:269)
	at org.apache.catalina.startup.WebAnnotationSet.loadApplicationServletAnnotations(WebAnnotationSet.java:137)
	at org.apache.catalina.startup.WebAnnotationSet.loadApplicationAnnotations(WebAnnotationSet.java:69)
	at org.apache.catalina.startup.ContextConfig.applicationAnnotationsConfig(ContextConfig.java:328)
	at org.apache.catalina.startup.ContextConfig.configureStart(ContextConfig.java:772)
	at org.apache.catalina.startup.ContextConfig.lifecycleEvent(ContextConfig.java:299)
	at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5007)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	... 27 more
Caused by: java.lang.ClassNotFoundException: org.apache.log4j.Logger
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1328)
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1157)
	... 40 more

фев 26, 2019 9:46:01 PM org.apache.catalina.startup.Catalina start
SEVERE: The required Server component failed to start so Tomcat is unable to start.
org.apache.catalina.LifecycleException: A child container failed during start
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:963)
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:261)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:801)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.startup.Catalina.start(Catalina.java:695)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:350)
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:492)
Caused by: java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: A child container failed during start
	at java.util.concurrent.FutureTask.report(Unknown Source)
	at java.util.concurrent.FutureTask.get(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:951)
	... 13 more
Caused by: org.apache.catalina.LifecycleException: A child container failed during start
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:963)
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:831)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1432)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1422)
	at java.util.concurrent.FutureTask.run(Unknown Source)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:944)
	... 13 more
Caused by: java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/myTest]]
	at java.util.concurrent.FutureTask.report(Unknown Source)
	at java.util.concurrent.FutureTask.get(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:951)
	... 21 more
Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/myTest]]
	at org.apache.catalina.util.LifecycleBase.handleSubClassException(LifecycleBase.java:441)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:198)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1432)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1422)
	at java.util.concurrent.FutureTask.run(Unknown Source)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(Unknown Source)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:944)
	... 21 more
Caused by: java.lang.NoClassDefFoundError: Lorg/apache/log4j/Logger;
	at java.lang.Class.getDeclaredFields0(Native Method)
	at java.lang.Class.privateGetDeclaredFields(Unknown Source)
	at java.lang.Class.getDeclaredFields(Unknown Source)
	at org.apache.catalina.util.Introspection.getDeclaredFields(Introspection.java:110)
	at org.apache.catalina.startup.WebAnnotationSet.loadFieldsAnnotation(WebAnnotationSet.java:269)
	at org.apache.catalina.startup.WebAnnotationSet.loadApplicationServletAnnotations(WebAnnotationSet.java:137)
	at org.apache.catalina.startup.WebAnnotationSet.loadApplicationAnnotations(WebAnnotationSet.java:69)
	at org.apache.catalina.startup.ContextConfig.applicationAnnotationsConfig(ContextConfig.java:328)
	at org.apache.catalina.startup.ContextConfig.configureStart(ContextConfig.java:772)
	at org.apache.catalina.startup.ContextConfig.lifecycleEvent(ContextConfig.java:299)
	at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:123)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5007)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	... 27 more
Caused by: java.lang.ClassNotFoundException: org.apache.log4j.Logger
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1328)
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1157)
	... 40 more

фев 26, 2019 9:46:01 PM org.apache.coyote.AbstractProtocol pause
INFO: Pausing ProtocolHandler ["http-nio-8080"]
фев 26, 2019 9:46:01 PM org.apache.coyote.AbstractProtocol pause
INFO: Pausing ProtocolHandler ["ajp-nio-8009"]
фев 26, 2019 9:46:01 PM org.apache.catalina.core.StandardService stopInternal
INFO: Stopping service [Catalina]
фев 26, 2019 9:46:01 PM org.apache.coyote.AbstractProtocol destroy
INFO: Destroying ProtocolHandler ["http-nio-8080"]
фев 26, 2019 9:46:01 PM org.apache.coyote.AbstractProtocol destroy
INFO: Destroying ProtocolHandler ["ajp-nio-8009"]
