# GCP Logging + Observability issue

Reproduction steps:

1. Clone this repo
2. Run the app: `GRPC_GCP_OBSERVABILITY_CONFIG="{}" ./gradlew run`
3. Observe that an exception is thrown:
    ```
   Exception in thread "main" java.lang.IllegalArgumentException: GRPC_GCP_OBSERVABILITY_CONFIG value is null!
	at com.google.common.base.Preconditions.checkArgument(Preconditions.java:145)
	at io.grpc.gcp.observability.ObservabilityConfigImpl.parse(ObservabilityConfigImpl.java:85)
	at io.grpc.gcp.observability.ObservabilityConfigImpl.getInstance(ObservabilityConfigImpl.java:71)
	at io.grpc.gcp.observability.GcpObservability.grpcInit(GcpObservability.java:91)
	at org.example.Main.init(Main.java:18)
	at org.example.Main.main(Main.java:13)
   ```

If you delete/rename `src/main/resources/logback.xml` and run the app, it will run successfully.
This seems to show there is some issue with `com.google.cloud.logging.logback.LoggingAppender` and
`io.grpc.gcp.observability.GcpObservability`.