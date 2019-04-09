This sample demonstrates issue 551 of spring-cloud-commons

https://github.com/spring-cloud/spring-cloud-commons/issues/551


```bash
mvn spring-boot:run
```

The DiscoveredResouce can't be discovered/verified and will cause the following messages in the log file every few seconds
See the github issue link above for details

```
2019-04-09 14:32:04.935 DEBUG 15250 --- [pool-1-thread-1] o.s.c.c.hypermedia.DiscoveredResource    : Target system unavailable. Got: 
2019-04-09 14:32:09.936 DEBUG 15250 --- [pool-1-thread-1] o.s.c.c.hypermedia.DiscoveredResource    : Discovered null system at http://localhost:8080. Discovering resource…
```
