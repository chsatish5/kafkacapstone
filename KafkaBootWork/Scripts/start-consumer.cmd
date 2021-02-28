REM %KAFKA_HOME%bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topic_txn
%KAFKA_HOME%\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning  -group cg1
