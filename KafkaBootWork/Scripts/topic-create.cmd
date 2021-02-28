REM %KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --topic kafka_int --partitions 3 --replication-factor 3
REM %KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --topic topic_txn --partitions 3 --replication-factor 3
%KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --topic Products --partitions 1 --replication-factor 1
%KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --topic Products --partitions 1
